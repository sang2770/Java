package View;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

import Audio.Music_background;
import CaroGame.Constants;

public class Center implements ActionListener{
	private JButton[][] list_btn;
	private Game_Main game_Main;
	private int dem;
	Music_background music;
	public Center( Game_Main game_Main, Music_background a) {
		super();
		this.list_btn = new JButton[Constants.game_size+2][Constants.game_size+2];
		this.game_Main = game_Main;
		music=a;
	}

	public JPanel showButton()
	{
		JPanel Caro=new JPanel(new GridLayout(Constants.game_size, Constants.game_size, 0, 0));
		Caro.setBorder(null);
		Font f1=new Font("MV Boli", Font.BOLD,15);
		dem=(int)(Math.random()*2);
		game_Main.setDem(dem);
		for(int i=1;i<=Constants.game_size;i++)
		{
			for(int j=1;j<=Constants.game_size;j++)
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String[] test=e.getActionCommand().split("-");
		int a=Integer.parseInt(test[0]);
		int b=Integer.parseInt(test[1]);
		
		music.Start();
		if(game_Main.getGame().checkStatus(a, b)==true)
		{
			if(dem%2==0) {   // đếm chẵn thì X đánh
				System.out.println("X"+dem);
				list_btn[a][b].setForeground(Color.BLUE);
				dem++;
				game_Main.setDem(dem);
				game_Main.Gettitle().setText("Lượt O Đánh");
				game_Main.Gettitle().setForeground(Color.red);
				try {
					game_Main.check(game_Main.getGame(), 1,"X", a, b);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
			else { 			// Đếm lẻ thì O đánh
				System.out.println("O"+dem);
				list_btn[a][b].setForeground(Color.RED);
				dem++;
				game_Main.setDem(dem);
				game_Main.Gettitle().setText("Lượt X Đánh");
				game_Main.Gettitle().setForeground(Color.blue);
				try {
					game_Main.check(game_Main.getGame(), 2,"O", a, b);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
			System.out.println("actiond"+dem);
		}

	}

	public int getDem() {
		return dem;
	}

	public void setDem(int dem) {
		this.dem = dem;
	}

	public JButton[][] getList_btn() {
		return list_btn;
	}

	public void setList_btn(JButton[][] list_btn) {
		this.list_btn = list_btn;
	}
}
