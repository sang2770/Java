package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import CaroGame.Constants;

public class West {
	private JPanel Inf;
	private Game_Main game_Main;
	private JLabel Name_1, Count_1;
	private String user;
	private Color color;
	private int demX;
	public int getDemX() {
		return demX;
	}
	public void setDemX(int demX) {
		this.demX = demX;
	}
	public West(Game_Main f, String s, int dem, String user, Color color, int demX) {
		game_Main=f;
		this.user =user;
		this.color=color;
		this.demX=demX;
		Name_1=new JLabel(s, JLabel.CENTER);
		Name_1.setPreferredSize(new Dimension(90, 80));
		Count_1=new JLabel("Count  "+dem, JLabel.CENTER);
		Count_1.setPreferredSize(new Dimension(90, 90));
		ImageIcon icon1=new ImageIcon(Constants.ImgLeft);
		Image icon=icon1.getImage().getScaledInstance(90, 150,Image.SCALE_SMOOTH );
		ImageIcon icon_one=new ImageIcon(icon);
		JLabel img=new JLabel(icon_one);
		img.setPreferredSize(new Dimension(90, 200));
		Inf=new JPanel(new FlowLayout());
		JLabel X=new JLabel("( "+user+" )", JLabel.CENTER);
		X.setForeground(color);
		X.setPreferredSize(new Dimension(90, 20));
		Inf.add(Name_1);
		Inf.add(X);
		Inf.add(Count_1);
		Inf.add(img);
		Inf.setPreferredSize(new Dimension(100,0));
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
	public JLabel getName_1() {
		return Name_1;
	}
	public void setName_1(JLabel name_1) {
		Name_1 = name_1;
	}
	public JLabel getCount_1() {
		return Count_1;
	}
	public void setCount_1(JLabel count_1) {
		Count_1 = count_1;
	}
	
}
