package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import CaroGame.Constants;

public class Graphic_1 extends JFrame implements ActionListener {

	public int width=Constants.width;
	public int height=Constants.height;
	public void OutGame()
	{
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}
	public Graphic_1() {
		super("Game");
		setLayout(new BorderLayout()); 
		add(new Game_Main(), BorderLayout.CENTER);
		setSize(width, height);  
		setVisible(true);  
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		
	}
	public static void main(String[] arg)
	{
		JFrame frame=new  Graphic_1();
	}
	
	
}
