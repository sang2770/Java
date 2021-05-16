package View;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
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
//		Left
		JPanel Left=new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JButton NewGame=new JButton("Game Mới");
		NewGame.setPreferredSize(new Dimension(120, 25));
		NewGame.setFocusable(false);
		NewGame.setActionCommand("NewGame");
		NewGame.addActionListener(this);
		
		JButton PauseGame=new JButton("Tạm Dừng");
		PauseGame.setPreferredSize(new Dimension(120, 25));
		PauseGame.setFocusable(false);
		PauseGame.setActionCommand("PauseGame");
		PauseGame.addActionListener(this);
		
		Left.add(NewGame);
		Left.add(PauseGame);
		Left.setPreferredSize(new Dimension(150, 60));
		
//		Right
		JPanel Right=new JPanel(new FlowLayout(FlowLayout.CENTER));
		JButton OutGame=new JButton("Thoát Game");
		OutGame.setPreferredSize(new Dimension(120, 25));
		OutGame.setFocusable(false);
		OutGame.setActionCommand("ExitGame");
		OutGame.addActionListener(this);
		
		
		
		JButton BackGame=new JButton("Chơi lại");
		BackGame.setPreferredSize(new Dimension(120, 25));
		BackGame.setFocusable(false);
		BackGame.setActionCommand("BackGame");
		BackGame.addActionListener(this);
		
		Right.add(BackGame);
		Right.add(OutGame);
		Right.setPreferredSize(new Dimension(150, 60));
		
		bottom.add(Left);
		bottom.add(f.Title());
		bottom.add(Right);
		bottom.setLayout(new FlowLayout(FlowLayout.CENTER));
		bottom.setPreferredSize(new Dimension(0, 80));
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
		if(e.getActionCommand().equals("PauseGame"))
		{
			try {
				game_Main.getAudio().Pause();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			JOptionPane.showMessageDialog(game_Main,"Game Đang Tạm Dừng, Nhấn Ok Để Tiếp Tục Chơi Nhé!" );
			try {
				game_Main.getAudio().Remuse();
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("BackGame"))
		{
			game_Main.BackGame();
			System.out.println("back");
		}
		
	}
	
}
