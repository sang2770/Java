package Suduko_OOP;

import java.util.Scanner;

public class Contol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Game game=new Game(Contain.DEMO_GAME);
		while (true) {
			/*
			 * Launch the game
			 */
			
			System.out.println(game.toString());
			int r=sc.nextInt()-1;
			int c=sc.nextInt()-1;
			int value=sc.nextInt();
			Node ingameNode=new Node(r, c, value, false);
			System.out.println(ingameNode.getValue());
			if (ingameNode.Validate()==false) {
				System.out.println("The input data is wrong, please re-input data!");
				continue;
			}
			if (game.CheckRevert(ingameNode)==true) {
				System.out.println("This node is reserved, please choose another node!");
				continue;
			}
			if (game.Checkrow(ingameNode)==false) {
				System.out.println("Duplicated value in row, please choose another value!");
				continue;
			}
			if (!game.Checkcol(ingameNode)) {
				System.out.println("Duplicated value in column, please choose another value!");
				continue;
			}
			if (!game.CheckZone(ingameNode)) {
				System.out.println("Duplicated value in zone, please choose another value!");
				continue;
			}
			game.setNode(ingameNode);
			if (game.CheckEnd()) {
				System.out.println("Conglatulation, you win the game!");
				sc.close();
				return;
			} else {
				// continue the game ...
				System.out.println("Continue ...");
			}
		}
}
}
