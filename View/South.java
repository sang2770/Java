package View;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class South extends JPanel implements ActionListener{
	private static final long serialVersionUID = -325696845712638101L;
	private JPanel bottom=new JPanel(new FlowLayout());
	private Game_Main game_Main ;
	public South(Game_Main f) {
		super();
		game_Main=f;
		JButton NewGame=new JButton("Game Mới");
		NewGame.setPreferredSize(new Dimension(120, 30));
		NewGame.setFocusable(false);
		NewGame.setActionCommand("NewGame");
		NewGame.addActionListener(this);
		
		JButton OutGame=new JButton("Thoát Game");
		OutGame.setPreferredSize(new Dimension(120, 30));
		OutGame.setFocusable(false);
		OutGame.setActionCommand("ExitGame");
		OutGame.addActionListener(this);
		
		JButton PauseGame=new JButton("Tạm Dừng");
		PauseGame.setPreferredSize(new Dimension(120, 30));
		PauseGame.setFocusable(false);
		PauseGame.setActionCommand("PauseGame");
		PauseGame.addActionListener(this);
		
		JButton BackGame=new JButton("Chơi lại");
		BackGame.setPreferredSize(new Dimension(120, 30));
		BackGame.setFocusable(false);
		BackGame.setActionCommand("BackGame");
		BackGame.addActionListener(this);
		
		bottom.add(PauseGame);
		bottom.add(NewGame);
		bottom.add(f.Title());
		bottom.add(OutGame);
		bottom.add(BackGame);
		bottom.setLayout(new FlowLayout(FlowLayout.CENTER));
		bottom.setPreferredSize(new Dimension(0, 60));
	}
	public JPanel getBottom() {
		return bottom;
	}
	public void setBottom(JPanel bottom) {
		this.bottom = bottom;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("NewGame"))
		{
			try {
				game_Main.NewGame();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("ExitGame"))
		{
			game_Main.ExitGame();
		}
		
	}
	
}
