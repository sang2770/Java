package Exception_Bt1;

import java.awt.List;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random=new Random();
		Scanner cd=new Scanner(System.in);
		ArrayList<Integer> bList=new ArrayList<Integer>();
		for(int i=0;i<50;i++)
		{
			int a=random.nextInt(50);
			bList.add(a);
		}
		try {
			int n=cd.nextInt();
			System.out.println(bList.get(n-1));
			
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Ban chua nhap So nguyen nao!");
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Ban truy cap ngoai phan tu mang!");	
		}
	}

}
