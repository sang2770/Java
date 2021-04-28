package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import CaroGame.Constants;
import CaroGame.Game;
import CaroGame.Node;

public class graphics {
	
	public static int GameSize=Constants.game_size;
	public static int dem=0;
	public static JButton[][] list_btn=new JButton[GameSize][GameSize];
	public static final JFrame f=new JFrame("Cờ ca rô");
	public static void check(Game game, int value, String s, int a, int b)
	{
		Node node=new Node(a, b, value, true);
		game.setNode(node);
		list_btn[a][b].setText(s);
		if(game.checkWin(node)==true)
		{
			JOptionPane obJOptionPane= new JOptionPane();
			obJOptionPane.showMessageDialog(f, s+" win");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game=new Game();
//		Tạo Frame	
		f.setSize(500, 500);
		
		f.setLayout(new BorderLayout());
		JPanel Caro=new JPanel(new GridLayout(GameSize, GameSize));
		
		Caro.setSize(500, 500);
		Caro.setBackground(Color.gray);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e)
			{
				JOptionPane close=new JOptionPane();
				int result=close.showConfirmDialog(Caro, "Do you want to close");
				if(result==0)
				{
					f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
				}
				else {
					f.setDefaultCloseOperation(f.DO_NOTHING_ON_CLOSE);
				}
			}
		});
		f.add(Caro);
		int size=500/GameSize;
		System.out.println(size);
		Font f1=new Font("MV Boli", Font.BOLD,15);
		for(int i=0;i<GameSize;i++)
		{
			for(int j=0;j<GameSize;j++)
			{
				
				list_btn[i][j]=new JButton("");
				list_btn[i][j].setSize(size, size);
				list_btn[i][j].setFont(f1);
				list_btn[i][j].setBackground(Color.lightGray);
				list_btn[i][j].setActionCommand(i+"-"+j);
				list_btn[i][j].setMargin(new Insets(0, 0, 0, 0));
				list_btn[i][j].setFocusable(false);
				list_btn[i][j].addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						System.out.println(e.getActionCommand());
						String[] test=e.getActionCommand().split("-");
						int a=Integer.parseInt(test[0]);
						int b=Integer.parseInt(test[1]);
						
						if(dem%2==0) {
							check(game, 1,"X", a, b);
							list_btn[a][b].setForeground(Color.BLUE);
						}
						else {
							check(game, 2,"O", a, b);
							list_btn[a][b].setForeground(Color.RED);
						}
//						System.out.println(game);
						dem++;
						list_btn[a][b].removeActionListener(this);
					}
				});
				
				Caro.add(list_btn[i][j]);
				
				
			}
		}
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
	}

}
