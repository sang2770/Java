package View;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import CaroGame.Constants;
import CaroGame.Game;
import CaroGame.Node;

public class Game_Main extends JPanel implements ActionListener {
	private int width=Constants.width;
	private int height=Constants.height;
	private int GameSize=Constants.game_size;
	private int dem=0, demX=0, demO=0;
	public JButton[][] list_btn=new JButton[GameSize][GameSize];
	JLabel title=null;
	User user=new User();
	Game game=new Game();
	JLabel Name_1=null, Name_2=null, Count_1=null,Count_2=null;
	public JLabel getName_1() {
		return Name_1;
	}
	public void setName_1(JLabel name_1) {
		Name_1 = name_1;
	}
	public JLabel getName_2() {
		return Name_2;
	}
	public void setName_2(JLabel name_2) {
		Name_2 = name_2;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Ingame"))
		{
			Name_1.setText(user.getText_1().getText());
			Name_2.setText(user.getText_2().getText());
			AddGame();
		}
		else {
			String[] test=e.getActionCommand().split("-");
			int a=Integer.parseInt(test[0]);
			int b=Integer.parseInt(test[1]);
			if(game.checkStatus(a, b)==true)
			{
				if(dem%2==0) {   // đếm chẵn thì X đánh
					list_btn[a][b].setForeground(Color.BLUE);
					dem++;
					title.setText("Lượt O Đánh");
					title.setForeground(Color.red);
					check(game, 1,"X", a, b);
				}
				else { 			// Đếm lẻ thì O đánh
					list_btn[a][b].setForeground(Color.RED);
					dem++;
					title.setText("Lượt X Đánh");
					title.setForeground(Color.blue);
					check(game, 2,"O", a, b);
					
				}
				System.out.println("actiond"+dem);
			}
		}
//		Button
		
		
		
	}
	public void AddGame()
	{
		
	}
	/*
	 * User
	 */
	public JPanel Button()
	{
		JPanel Button=new JPanel(new FlowLayout(FlowLayout.CENTER));
		JButton a=new JButton("Vào game");
		a.setPreferredSize(new Dimension(120, 40));
		a.setActionCommand("Ingame");
		JButton b=new JButton("Thoát game");
		b.setPreferredSize(new Dimension(120, 40));
		b.setActionCommand("Outgame");;
		a.addActionListener(this);
		b.addActionListener(this);
		a.setFocusable(false);
		b.setFocusable(false);
		Button.add(a);
		Button.add(b);
		Button.setPreferredSize(new Dimension(width, 100));
		return Button;
	}
	public JPanel Login()
	{
		JPanel list=user.getList();
		list.add(Button());
		return list;
	}
	/*
	 * Main
	 */
	public JPanel Inf_1(String s, int dem)
	{
		Name_1=new JLabel(s, JLabel.CENTER);
		Name_1.setBounds(0, 10, 95, 70);
		Count_1=new JLabel("Count  "+dem, JLabel.CENTER);
		Count_1.setBounds(0 ,100, 95, 70);
		JPanel info=new JPanel();
		info.add(Name_1);
		info.add(Count_1);
		info.setPreferredSize(new Dimension(90,0));
		
		return info;
	}
	public JPanel Inf_2(String s, int dem)
	{
		Name_2=new JLabel(s, JLabel.CENTER);
		Name_2.setBounds(0, 10, 95, 70);
		Count_2=new JLabel("Count  "+dem, JLabel.CENTER);
		Count_2.setBounds(0 ,100, 95, 70);
		JPanel info=new JPanel();
		info.add(Name_2);
		info.add(Count_2);
		info.setPreferredSize(new Dimension(90,0));
		
		return info;
	}
	public JLabel Title()
	{
		Font f1=new Font(Font.SERIF, Font.BOLD, 20);
		if(dem%2==0)
		{
			title=new JLabel("Lượt X Đánh", JLabel.CENTER);
			title.setForeground(Color.BLUE);
		}
		else {
			title=new JLabel("Lượt O Đánh", JLabel.CENTER);
			title.setForeground(Color.red);
		}
		title.setFont(f1);
		title.setPreferredSize(new Dimension(0, 60));
		return title;
	}
	public JPanel ShowButton()
	{
		
		JPanel Caro=new JPanel(new GridLayout(Constants.game_size, Constants.game_size));
		Caro.setBackground(Color.gray);
		Font f1=new Font("MV Boli", Font.BOLD,15);
		dem=(int)(Math.random()*2);
		System.out.println("begin"+dem);
		for(int i=0;i<GameSize;i++)
		{
			for(int j=0;j<GameSize;j++)
			{
				
				list_btn[i][j]=new JButton("");;
				list_btn[i][j].setFont(f1);
				list_btn[i][j].setBackground(Color.lightGray);
				list_btn[i][j].setActionCommand(i+"-"+j);
				list_btn[i][j].setMargin(new Insets(0, 0, 0, 0));
				list_btn[i][j].setFocusable(false);
				list_btn[i][j].addActionListener(this);
				Caro.add(list_btn[i][j]);	
			}
		}
		return Caro;
	}
	/*
	 * Check
	 */
	public void check(Game game, int value, String s, int a, int b)
	{
		Node node=new Node(a, b, value, true);
		game.setNode(node);
		list_btn[a][b].setText(s);
		if(game.checkWin(node)==true)
		{
			
			JOptionPane obJOptionPane= new JOptionPane();
			int res=obJOptionPane.showConfirmDialog(this, s+" Win !"+"\nMời Sang Hiệp "+(demO+demX+1));
			
			if(s.compareTo("X")==0)
			{
				demX++;
				Endgame();
				dem=0;
				title.setText("Lượt X đánh");
				title.setForeground(Color.blue);
				Count_1.setText("Count "+demX);
			}
			else {
				demO++;
				Endgame();
				dem=1;
				title.setText("Lượt O đánh");
				title.setForeground(Color.red);
				Count_2.setText("Count "+demO);
				
			}
			if(res==0)
			{
				
				ResetButton();
				game.Reset();
			}
			System.out.println("check"+dem);
		}
	}
	public void ResetButton()
	{
		for(int i=0;i<GameSize;i++)
		{
			for(int j=0;j<GameSize;j++)
			{
				list_btn[i][j].setText("");
			}
		}
	}
	
	public void Endgame()
	{
		JOptionPane Notify=new JOptionPane();
		
		if(demX==2)
		{
			Notify.showConfirmDialog(this,"Congratulations "+ " X "+ " Win !");
			demO=0; demX=0;
			Count_1.setText("Count "+demX);
			Count_2.setText("Count "+demO);
		}
		if(demO==2)
		{
			Notify.showConfirmDialog(this,"Congratulations "+ " O "+ " Win !");
			demO=0; demX=0;
			Count_1.setText("Count "+demX);
			Count_2.setText("Count "+demO);
		}
	}
	
	/*
	 * Constructor
	 */
	public Game_Main() {
		
		setLayout(new BorderLayout());
//		add(this.Login(), BorderLayout.CENTER);
//
		JLabel Content=new JLabel("Wellcome To My Game", JLabel.CENTER);
		Font f1=new Font(Font.SANS_SERIF, Font.BOLD, 25);
		Content.setPreferredSize(new Dimension(0, 60));
		Content.setFont(f1);
		add(Content, BorderLayout.NORTH);
		add(ShowButton(), BorderLayout.CENTER);
		add(Inf_1("Người Chơi 1", demX), BorderLayout.WEST);
		add(Inf_2("Người Chơi 2", demO), BorderLayout.EAST);
		add(Title(), BorderLayout.SOUTH);
	}

}
