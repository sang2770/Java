package View;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import CaroGame.Constants;

public class User {
	private int width;
	private int height;
	private JTextField Text_1;
	private JTextField Text_2;
	private JPanel list_user;
	public JTextField getText_1() {
		return Text_1;
	}
	public void setText_1(JTextField text_1) {
		Text_1 = text_1;
	}
	public JTextField getText_2() {
		return Text_2;
	}
	public void setText_2(JTextField text_2) {
		Text_2 = text_2;
	}
	
	public User() {
//		super();
		this.width = Constants.width;
		this.height = Constants.height;
		Text_1 = new JTextField(20);
		Text_2 = new JTextField(20);
		this.list_user = new JPanel();
	}
	public JPanel getList() 
	{
		JLabel inf=new JLabel("Wellcome to My game", JLabel.CENTER);
//		inf.setBounds(0, 10, 500, 60);
		inf.setPreferredSize(new Dimension(width, 60));
		list_user.add(inf);
//		user1
		JPanel user_1=new JPanel(new FlowLayout(FlowLayout.CENTER));
		JLabel label_1=new JLabel("Nguời chơi 1 (X) :");
		label_1.setPreferredSize(new Dimension(150, 30));
		user_1.add(label_1);
		user_1.add(Text_1);
		user_1.setPreferredSize(new Dimension(width, 60));
		list_user.add(user_1);
//		user_2
		JPanel user_2=new JPanel(new FlowLayout(FlowLayout.CENTER));
		JLabel label_2=new JLabel("Nguời chơi 2 (O) :");
		label_2.setPreferredSize(new Dimension(150, 30));
		user_2.add(label_2);
		user_2.add(Text_2);
		user_2.setPreferredSize(new Dimension(width, 60));
		list_user.add(user_2);
		
		list_user.setLayout(new FlowLayout());
		list_user.setPreferredSize(new Dimension(width, height));
		return list_user;
		}

	


}
