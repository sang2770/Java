package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import CaroGame.Constants;

public class East {
	private JPanel Inf;
	private Game_Main game_Main;
	private String user;
	private Color color;
	private JLabel Name_2, Count_2;
	private int demO;
	public East(Game_Main f, String s, int dem, String user, Color color, int demO) {
		this.game_Main=f;
		this.user =user;
		this.color=color;
		this.demO=demO;
		Name_2=new JLabel(s, JLabel.CENTER);
		Name_2.setPreferredSize(new Dimension(90, 80));
		Count_2=new JLabel("Count  "+dem, JLabel.CENTER);
		Count_2.setPreferredSize(new Dimension(90, 90));
		ImageIcon icon1=new ImageIcon(Constants.ImgRight);
		Image icon=icon1.getImage().getScaledInstance(90, 150,Image.SCALE_SMOOTH );
		ImageIcon icon_one=new ImageIcon(icon);
		JLabel img=new JLabel(icon_one);
		img.setPreferredSize(new Dimension(90, 200));
		Inf=new JPanel(new FlowLayout());
		JLabel X=new JLabel("( "+user+" )", JLabel.CENTER);
		X.setForeground(color);
		X.setPreferredSize(new Dimension(90, 20));
		Inf.add(Name_2);
		Inf.add(X);
		Inf.add(Count_2);
		Inf.add(img);
//		Inf.setMinimumSize(new Dimension(100, 0));
		Inf.setPreferredSize(new Dimension(100,0));
	}
	public int getDemO() {
		return demO;
	}
	public void setDemO(int demO) {
		this.demO = demO;
	}
	public JPanel getInf() {
		return Inf;
	}
	public void setInf(JPanel inf) {
		Inf = inf;
	}
	public Game_Main getGame_Main() {
		return game_Main;
	}
	public void setGame_Main(Game_Main game_Main) {
		this.game_Main = game_Main;
	}
	public JLabel getName_2() {
		return Name_2;
	}
	public void setName_2(JLabel name_2) {
		Name_2 = name_2;
	}
	public JLabel getCount_2() {
		return Count_2;
	}
	public void setCount_2(JLabel count_2) {
		Count_2 = count_2;
	}

	
}
