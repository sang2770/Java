package View;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class South extends JPanel {
	private JPanel bottom=new JPanel(new FlowLayout());
	private Game_Main game_Main ;
	public South(Game_Main f) {
		game_Main=f;
		JButton Remuse=new JButton("Game Mới");
		Remuse.setPreferredSize(new Dimension(120, 30));
		Remuse.setFocusable(false);
		Remuse.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					game_Main.ResetGame();
					game_Main.Gettitle().setText("");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		JButton OutGame=new JButton("Thoát Game");
		OutGame.setPreferredSize(new Dimension(120, 30));
		OutGame.setFocusable(false);
		OutGame.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f.ExitGame();
			}
		});
		
		
		bottom.add(Remuse);
		bottom.add(f.Title());
		bottom.add(OutGame);
		bottom.setPreferredSize(new Dimension(0, 60));
	}
	public JPanel getBottom() {
		return bottom;
	}
	public void setBottom(JPanel bottom) {
		this.bottom = bottom;
	}
	
}
