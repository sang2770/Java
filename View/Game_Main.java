package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Audio.Music_background;
import CaroGame.Constants;
import CaroGame.Game;
import CaroGame.Node;
import CaroGame.Pair;

public class Game_Main extends JFrame {
	private static final long serialVersionUID = -3149873185501265833L;
	private int width = Constants.width;
	private int height = Constants.height;
	private int GameSize = Constants.game_size;
	public JButton[][] list_btn;
	private JLabel title = null;
	private Game game = new Game();
	private JLabel Name_1 = null, Name_2 = null, Count_1 = null, Count_2 = null;
	private JDialog a = null;
	private North Content;
	private West Inf_1;
	private East Inf_2;
	private Center center;
	private int dem, demX, demO;
	private JMenuBar menu;
	private Music_background Audio, Click, Appl;
	
	public Music_background getAudio()
	{
		return Audio;
	}
	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public JLabel Gettitle() {
		return title;
	}

	public void Settitle(JLabel title) {
		this.title = title;
	}

	public int getDem() {
		return dem;
	}

	public void setDem(int dem) {
		this.dem = dem;
	}
	public void ChangeTitle() {
		
		if (dem % 2 == 0) {
			title.setText("Lượt X Đánh");
			title.setForeground(Color.BLUE);
			dem=0;
		} else {
			
			title.setText("Lượt O Đánh");
			dem=1;
			title.setForeground(Color.red);
		}
		System.out.println(dem);
	}

	public JLabel Title() {
		Font f1 = new Font(Font.SERIF, Font.BOLD, 20);
		if (dem % 2 == 0) {
			title = new JLabel("", JLabel.CENTER);
			
		} else {
			title = new JLabel("", JLabel.CENTER);
			
		}
		title.setFont(f1);
		title.setPreferredSize(new Dimension(200, 60));
		return title;
	}

	/*
	 * Check
	 */
	public void check(Game game, int value, String s, int a, int b) throws IOException {
		Node node = new Node(a, b, value, true);
		game.setNode(node);
		list_btn[a][b].setText(s);
		int check = 0;
		if (game.checkWin(node) == true) {
			Appl.Start();
			JOptionPane obJOptionPane = new JOptionPane();
			if (s.compareTo("X") == 0) {
				demX++;
				Inf_1.setDemX(demX);
				obJOptionPane.showMessageDialog(this, "Hiêp " + (demX + demO) + ": " + Name_1.getText() + " Win");
				check++;
				if (Endgame() == false) {
					dem = 0;
					title.setText("Lượt X đánh");
					title.setForeground(Color.blue);
					Count_1.setText("Count " + demX);
					ShowBegin();
				}

			} else {
				demO++;
				obJOptionPane.showMessageDialog(this, "Hiêp " + (demX + demO) + ": " + Name_2.getText() + " Win");
				check++;
				if (Endgame() == false) {
					dem = 1;
					title.setText("Lượt O đánh");
					title.setForeground(Color.red);
					Count_2.setText("Count " + demO);
					ShowBegin();
				}

			}
			if (check != 0) {
				Appl.Reset();
				Appl.Pause();
			}
			center.setDem(dem);
			ResetButton();
			game.Reset();
			System.out.println("check" + dem);
		}
	}

	public void ResetButton() {
		for (int i = 1; i <= GameSize; i++) {
			for (int j = 1; j <= GameSize; j++) {
				list_btn[i][j].setText("");
			}
		}
	}

	public boolean Endgame() throws IOException {
		JOptionPane Notify = new JOptionPane();
		int res = -1;
		title.setText("");
		if (demX == 2) {
			res = Notify.showConfirmDialog(this,
					"Congratulations " + Name_1.getText() + " Win ! Bạn có muốn làm thêm Ván Game Nữa ?");
			demO = 0;
			demX = 0;
			Count_1.setText("Count " + demX);
			Count_2.setText("Count " + demO);
		}
		if (demO == 2) {
			res = Notify.showConfirmDialog(this,
					"Congratulations " + Name_2.getText() + " Win ! Bạn có muốn làm thêm Ván Game Nữa ?");
			demO = 0;
			demX = 0;
			Count_1.setText("Count " + demX);
			Count_2.setText("Count " + demO);
		}
		if (res == 1) {
			ExitGame();
			return true;
		}
		if (res == 0) {

			ResetGame();
			return true;
		}
		return false;

	}

	public void UpdateName(String a, String b) {
		if (a.isEmpty() == false)
			Inf_1.getName_1().setText(a);
		if (b.isEmpty() == false)
			Inf_2.getName_2().setText(b);
		ShowBegin();

	}

	public void ShowBegin() {
		JOptionPane First = new JOptionPane();
		if (dem % 2 == 0) {
			First.showMessageDialog(this, "Hiệp " + (demO + demX + 1) + ":" + Name_1.getText() + " Đánh trước");
		} else {
			First.showMessageDialog(this, "Hiệp " + (demO + demX + 1) + ":" + Name_2.getText() + " Đánh trước");
		}
	}

	public void ExitGame() {
		JOptionPane Option = new JOptionPane();

		int a = Option.showConfirmDialog(Option, "Do you  want to quit the Game");
		System.out.println(a);
		if (a == 0) {
			System.exit(0);
		}
	}
	public void NewGame() throws IOException {
		JOptionPane noti=new JOptionPane();
		int a=noti.showConfirmDialog(this, "Do you want to play  new Game");
		if(a==0)
		{
			ResetGame();
			Gettitle().setText("");
		}
		return;
	}
	public void ResetGame() throws IOException {
		Audio.Reset();
		Audio.Pause();
		ResetButton();
		game.Reset();
		dem = (int) (Math.random() * 2);
		center.setDem(dem);
		a = new View_user(this, "Notification", false, Audio);
	}
	public void BackGame()
	{
		
		Pair s1= game.getNode_back();
		if(s1!=null)
		{
			list_btn[s1.getX()][ s1.getY()].setText("");
			dem--;
			center.setDem(dem);
		}
		
		
		Pair s2= game.getNode_back();
		if(s2!=null)
		{
			list_btn[s2.getX()][ s2.getY()].setText("");
			dem--;
			center.setDem(dem);
		}
		
		this.ChangeTitle();
		System.out.println(dem);
	}
	/*
	 * Constructor
	 */
	public Game_Main() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		super();
		Audio = new Music_background(Constants.Music_Main);
		Click = new Music_background(Constants.Music_Click);
		Appl = new Music_background(Constants.Music_App);
		setLayout(new BorderLayout());
//		North
		Content = new North();
		add(Content.getN(), BorderLayout.NORTH);
//		Center
		center = new Center(this, Click);
		list_btn = center.getList_btn();
		add(center.showButton(), BorderLayout.CENTER);
//		West
		Inf_1 = new West(this, "Người chơi 1", demX, "X", Color.blue, 0);
		Name_1 = Inf_1.getName_1();
		Count_1 = Inf_1.getCount_1();
		demX = Inf_1.getDemX();
		add(Inf_1.getInf(), BorderLayout.WEST);
//		East
		Inf_2 = new East(this, "Người chơi 2", demX, "O", Color.red, 0);
		demO = Inf_2.getDemO();
		Name_2 = Inf_2.getName_2();
		Count_2 = Inf_2.getCount_2();
		add(Inf_2.getInf(), BorderLayout.EAST);
//		Bottom
		South Bottom = new South(this);
		add(Bottom.getBottom(), BorderLayout.SOUTH);
//		Main
		menu=new Menu(this);
		setTitle("Game Caro");
		setSize(width, height);
		setVisible(true);
		setLocationRelativeTo(null);
		setMinimumSize(new Dimension(580, 580));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		Notification
		a = new View_user(this, "Notification", false, Audio);
	}

}
