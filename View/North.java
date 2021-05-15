package View;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import CaroGame.Constants;

public class North {
	private JPanel N;
	private JLabel Content;
	private Font f1=new Font("Tamoha", Font.BOLD, 25);
	public North()
	{
		Content=new JLabel("Wellcome To Caro Game", JLabel.CENTER);
		Content.setPreferredSize(new Dimension(Constants.width, 50));
		Content.setFont(f1);
		N=new JPanel();
		N.setPreferredSize(new Dimension(0, 50));
		N.setLayout(new FlowLayout());
		N.add(Content);
	}
	public JPanel getN() {
		return N;
	}
	public void setN(JPanel n) {
		N = n;
	}
	public JLabel getContent() {
		return Content;
	}
	public void setContent(JLabel content) {
		Content = content;
	}
	public Font getF1() {
		return f1;
	}
	public void setF1(Font f1) {
		this.f1 = f1;
	}
	
}
