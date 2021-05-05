package CaroGame;

import java.util.Scanner;

import javax.swing.text.html.CSS;

public class Control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game =new Game();
//		System.out.println(game);
		Scanner cd= new Scanner(System.in);
		while(true)
		{
			System.out.println(game);
			System.out.println("Nhap cot:");
			int col=cd.nextInt();
			System.out.println("Nhap hang");
			int row=cd.nextInt();
			System.out.println("Nhap value");
			int value=cd.nextInt();
			Node node=new Node(row, col, value, true);
			if(game.checkStatus(row, col)==true)
			{
				game.setNode(node);
			}
			else {
				System.out.println("Ban k duoc nhap mot o hai lan");
				continue;
			}
			if(game.checkWin(node)==true)
			{
				System.out.println("Nguoi choi "+ node.getValue()+"WIn");
				game.Reset();

			}
			
		}
	}

}
