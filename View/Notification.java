package View;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Notification extends JDialog{
	private static final long serialVersionUID = -1985026182376424132L;
	public Notification(String s, String content)
	{
		super();
		JLabel aJLabel=new JLabel(content, JLabel.CENTER);
		aJLabel.setPreferredSize(new Dimension(300, 200));
		add(aJLabel);
		setTitle(s);
		setLayout(new FlowLayout());
		setSize(400, 300);
		setVisible(true);
		setLocationRelativeTo(null);
	}

}
