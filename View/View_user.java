package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Audio.Music_background;
import CaroGame.Constants;

public class View_user extends JDialog implements ActionListener {
	private static final long serialVersionUID = 655841510529897121L;
	private JTextField User_1;
	private JTextField User_2;
	private int width=Constants.user_width;
	private int height=Constants.user_height;
	private Game_Main Main;
	Music_background music;
	public View_user(Game_Main owner, String title, boolean modal, Music_background a) {
		super(owner, title, modal);
		Main = owner;
		User_1= new JTextField(13);
		User_2= new JTextField(13);
		music=a;
//		Font f1=new Font("MV Boli", Font.BOLD,15);
		Font f1=new Font("Sitka Text", Font.BOLD,15);
		JLabel Option=new JLabel("Mời điền tên người chơi !", JLabel.CENTER);
		Option.setFont(f1);
		Option.setPreferredSize(new Dimension(300, 60));
		JPanel user_1=new JPanel( new FlowLayout());
		JLabel Name_user_1=new JLabel("Người Chơi 1", JLabel.CENTER);
		Name_user_1.setPreferredSize(new Dimension(90, 30));
		JLabel X =new JLabel("X", JLabel.CENTER);
		X.setFont(f1);
		X.setForeground(Color.blue);
		X.setPreferredSize(new Dimension(30, 30));
		user_1.add(Name_user_1);
		user_1.add(User_1);
		user_1.add(X);
		user_1.setPreferredSize(new Dimension(width, 50));
		
		
		JPanel user_2=new JPanel( new FlowLayout());
		JLabel Name_user_2=new JLabel("Người Chơi 2", JLabel.CENTER);
		Name_user_2.setPreferredSize(new Dimension(90, 30));
		user_2.add(Name_user_2);
		JLabel O =new JLabel("O", JLabel.CENTER);
		O.setPreferredSize(new Dimension(30, 30));
		O.setFont(f1);
		O.setForeground(Color.red);
		user_2.add(User_2);
		user_2.add(O);
		user_2.setBounds(0, 50, 300, 40);
		user_2.setPreferredSize(new Dimension(300, 70));
		
//		button
		JPanel Button=new JPanel(new FlowLayout());
		JButton Login=new JButton("Vào Game");
		Login.setPreferredSize(new Dimension(100,30));
		Login.setActionCommand("Ingame");
		Login.addActionListener(this);
		Button.add(Login);
		JButton Out=new JButton("Thoát");
		Out.setActionCommand("Out");
		Out.addActionListener(this);
		Out.setPreferredSize(new Dimension(100,30));
		Button.add(Out);
		
		Button.setPreferredSize(new Dimension(width, 50));
		
		add(Option);
		add(user_1);
		add(user_2);
		add(Button);
		setLayout(new FlowLayout());
		setSize(width, height);
		setVisible(true);
		setLocationRelativeTo(null);
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				music.Start();
				music.Loop();
				super.windowClosing(e);
				
			}
			
		});
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Ingame")==true )
		{
			setVisible(false);
			Main.UpdateName(User_1.getText(), User_2.getText());
			Main.ChangeTitle();
			music.Start();
			music.Loop();
		}
		else {
			setVisible(false);
		}
		
	}
}
