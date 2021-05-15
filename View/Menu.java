package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import CaroGame.Constants;

public class Menu extends JMenuBar implements ActionListener{
	private static final long serialVersionUID = -6184530407120517307L;
	Game_Main game_Main;
	public Menu(Game_Main f)
	{
		super();
		game_Main=f;
		JMenu Hmenu=new JMenu("Home");
		JMenuItem New=new JMenuItem("Game Mới");
		New.setActionCommand("New");
		New.addActionListener(this);
		JMenuItem Exit=new JMenuItem("Thoát Game");
		Exit.setActionCommand("Exit");
		Exit.addActionListener(this);
		Hmenu.add(New);
		Hmenu.add(Exit);
		
		JMenu Gmenu=new JMenu("Giới thiệu");
		JMenuItem Inf=new JMenuItem("About");
		Inf.setActionCommand("About");
		Inf.addActionListener(this);
		JMenuItem Tuto=new JMenuItem("Hướng Dẫn");
		Tuto.setActionCommand("Tuto");
		Tuto.addActionListener(this);
		Gmenu.add(Inf);
		Gmenu.add(Tuto);
		
		this.add(Hmenu);
		this.add(Gmenu);
		
		game_Main.setJMenuBar(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getActionCommand());
		if(e.getActionCommand().equals("New")==true)
		{
			try {
				game_Main.NewGame();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("Exit")==true)
		{
			game_Main.ExitGame();
		}
		if(e.getActionCommand().equals("About")==true)
		{
			Notification About=new Notification("About", Constants.InfAuthor);
		}
		if(e.getActionCommand().equals("Tuto")==true)
		{
			Notification Tuto=new Notification("Hướng dẫn", Constants.Tutorials);
		}
	}
	
}
