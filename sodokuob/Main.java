package sodokuob;

import java.util.Scanner;

import giobaitap.sodoku;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] bmatrix ={ { 6, 8, 0, 0, 0, 7, 1, 0, 0 }, { 0, 2, 0, 9, 1, 5, 8, 0, 7 },
			{ 9, 0, 0, 6, 0, 3, 5, 2, 0 }, { 0, 5, 6, 0, 0, 2, 0, 0, 0 }, { 3, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 9, 2, 0, 6, 0, 0, 5, 8 }, { 7, 0, 0, 0, 5, 6, 0, 8, 1 }, { 0, 0, 8, 3, 4, 9, 0, 0, 6 },
			{ 0, 0, 0, 8, 0, 1, 4, 3, 0 }};
		soduku aSoduku=new soduku(bmatrix);
		aSoduku.show();
		Scanner cd=new Scanner(System.in);
		int r=0, c=0, v=0;
		while(true)
		{
			System.out.println("Nhap so hang"); r=cd.nextInt()-1;
			System.out.println("Nhap so cot"); c=cd.nextInt()-1;
			System.out.println("Nhap value"); v=cd.nextInt();
			if(aSoduku.ktradefault( r, c)==false)
			{
				System.out.println("Ban khong duoc nhao gia tri o nay:(");
				continue;
			}
			if(!aSoduku.checkcol( c, v)) System.out.println("sai cot roi:");
			else if(!aSoduku.checkrow( r,v)) System.out.println("sai hang roi:");
			else if(!aSoduku.checkvung( r, c, v)) System.out.println("sai vung roi:");
			else {
				aSoduku.seta(v, c, r);
				aSoduku.show();
			}
			if(!aSoduku.trangthai())
				continue;
			else {
				System.out.println("Cogratuation:))");
			}
		}
		
	}

}
