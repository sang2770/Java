package View;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import CaroGame.Constants;

public class Menu extends JMenuBar implements ActionListener{
	private static final long serialVersionUID = -6184530407120517307L;
	Game_Main game_Main;
	private boolean on_1=true, on_2=true, off_1=false, off_2=false;
	JMenuItem On_1, On_2, Off_1, Off_2;
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
		
		JMenu Omenu=new JMenu("Options");
		JMenu Music=new JMenu("Music");
		On_1= new JMenuItem("On");
		On_1.setActionCommand("On_1");
		On_1.addActionListener(this);
		
		Off_1= new JMenuItem("Off");
		Off_1.setActionCommand("Off_1");
		Off_1.addActionListener(this);
		
		Music.add(On_1);
		Music.add(Off_1);
		
		JMenu Gomoku=new JMenu("Gomoku");
		On_2= new JMenuItem("On");
		On_2.setActionCommand("On_2");
		On_2.addActionListener(this);
		Off_2= new JMenuItem("Off");
		Off_2.setActionCommand("Off_2");
		Off_2.addActionListener(this);
		Gomoku.add(On_2);
		Gomoku.add(Off_2);
		setcolor();
		Omenu.add(Music);
		Omenu.add(Gomoku);
		
		
		this.add(Hmenu);
		this.add(Gmenu);
		this.add(Omenu);
		
		game_Main.setJMenuBar(this);
	}
	public void setcolor()
	{
		if(on_1==true)
		{
			On_1.setBackground(Color.gray);
			Off_1.setBackground(null);
		}
		else {
			On_1.setBackground(null);
			Off_1.setBackground(Color.gray);
		}
		if(on_2==true)
		{
			On_2.setBackground(Color.gray);
			Off_2.setBackground(null);
		}
		else {
			On_2.setBackground(null);
			Off_2.setBackground(Color.gray);
		}
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
		if(e.getActionCommand().equals("On_1"))
		{
			if(on_1!=true)
			{
				try {
					game_Main.getAudio().Remuse();
				} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				off_1=false;
				on_1=true;
			}
			setcolor();
			
		}
		if(e.getActionCommand().equals("On_2"))
		{
			if(on_2!=true)
			{
				game_Main.getGame().setGomoku();
				off_2=false;
				on_2=true;
			}
			setcolor();
		}
		if(e.getActionCommand().equals("Off_1"))
		{
			if(off_1!=true)
			{
				try {
					game_Main.getAudio().Pause();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				on_1=false;
				off_1=true;
			}
			setcolor();
		}
		if(e.getActionCommand().equals("Off_2"))
		{
			if(off_2!=true)
			{
				game_Main.getGame().setGomoku();
				off_2=true;
				on_2=false;
			}
			setcolor();
		}
		
	}
	
}
