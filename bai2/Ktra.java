package bai2;

import java.util.*;

import org.w3c.dom.ls.LSOutput;

public class Ktra {
	public static void main(String[] args) {
		String[] inputString= {"123 123 2", "12a 123"};
		Scanner resScanner = new Scanner(System.in);
//		 Nhap chuoi
//		System.out.println("Nhap chuoi");
//		inputString = resScanner.nextLine();
//		 hien chuoi
		int i=0;
		int count=0;
		while(i<=1)
		{
			int dem = 0;
			String[] wordStrings=inputString[i].split(" ");
			for(String z:wordStrings)
			{
//				for(int j=0;j<z.length();j++)
//					if(z.charAt(j)<='9')
//					{
//						dem++;
//					}
//					else {
//						System.out.println("ban nhap sai!");
//						dem=0;
//						break;
//					}
//				if(dem==0) break;
//				System.out.println(z);
//			}
//			if(dem>0)
//			System.out.println(dem);
//			i++;
//			}
				try {
					Double.parseDouble(z);
					count++;
				}catch (NumberFormatException e) {
					// TODO: handle exception
					System.out.println("Nhap sai roi!");
					return;
				}finally {
					resScanner.close();
				}
			}
		}
				
			 System.out.println(count);
			 
		
}
		}
		
