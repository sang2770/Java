package giobaitap;

import java.util.Iterator;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class sodoku {
	public static void main(String[] args) {

		int[][] matrix = new int[][] { { 6, 8, 0, 0, 0, 7, 1, 0, 0 }, { 0, 2, 0, 9, 1, 5, 8, 0, 7 },
				{ 9, 0, 0, 6, 0, 3, 5, 2, 0 }, { 0, 5, 6, 0, 0, 2, 0, 0, 0 }, { 3, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 9, 2, 0, 6, 0, 0, 5, 8 }, { 7, 0, 0, 0, 5, 6, 0, 8, 1 }, { 0, 0, 8, 3, 4, 9, 0, 0, 6 },
				{ 0, 0, 0, 8, 0, 1, 4, 3, 0 }

		};
		int[][] matrixdefault = new int[][] { { 6, 8, 0, 0, 0, 7, 1, 0, 0 }, { 0, 2, 0, 9, 1, 5, 8, 0, 7 },
			{ 9, 0, 0, 6, 0, 3, 5, 2, 0 }, { 0, 5, 6, 0, 0, 2, 0, 0, 0 }, { 3, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 9, 2, 0, 6, 0, 0, 5, 8 }, { 7, 0, 0, 0, 5, 6, 0, 8, 1 }, { 0, 0, 8, 3, 4, 9, 0, 0, 6 },
			{ 0, 0, 0, 8, 0, 1, 4, 3, 0 }

	};
		Scanner cd=new Scanner(System.in);
		int r=0, c=0, v=0;
		sodoku.show(matrix);
		while(true)
		{
			System.out.println("Nhap so hang"); r=cd.nextInt()-1;
			System.out.println("Nhap so cot"); c=cd.nextInt()-1;
			System.out.println("Nhap value"); v=cd.nextInt();
			if(checkdefualt(matrixdefault, r, c)==false)
			{
				System.out.println("Ban khong duoc nhao gia tri o nay:(");
				continue;
			}
			if(!checkcol(matrix, r, c, v)) System.out.println("sai cot roi:");
			else if(!checkrow(matrix, r, c, v)) System.out.println("sai hang roi:");
			else if(!checkvung(matrix, r, c, v)) System.out.println("sai vung roi:");
			else {
				matrix[r][c]=v;
			}
			if(!sodoku.trangthai(matrix))
				continue;
			else {
				System.out.println("Cogratuation:))");
			}
				
		}
	}
	public  static boolean checkdefualt(int[][] a, int r, int c) {
		if(a[r][c]!=0)
			return false;
		return true;
		
	}
	public  static boolean trangthai(int[][] matrix) {
		for(int[] z : matrix)
			for(int z1: z)
			   if(z1==0)
				return false;
		return true;
	}
	public static void show(int[][] a) {

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static boolean checkrow(int a[][], int r, int c, int v) {
		for(int i=0;i<9;i++)
			if(a[r][i]==v)
				return false;
		return true;
	}
	public static boolean checkcol(int a[][], int r, int c, int v) {
		for(int i=0;i<9;i++)
			if(a[i][c]==v)
				return false;
		return true;
	}
	public static boolean checkvung(int a[][], int r, int c, int v) {
		int subr=r-(r%3);
		int subc=c-(c%3);
		for(int i=subr;i<=subr+3;i++)
			for(int j=subc;j<=subc+3;j++)
				if(a[i][j]==v)
					return false;
		return true;
	
	}
}
