package Exception_Bt2;

import java.util.Scanner;

public class Test_two {
	static void Validatestring(String s) throws ValidateString{
		if(s.compareTo("sang")==0)
		{
			throw new ValidateString("chuoisai");
		}
		else {
			System.out.println("Ban nhap dung");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cd=new Scanner(System.in);
		try {
			String aString=cd.nextLine();
			int dem=0;
//			Validatestring(aString);
			String[] list=aString.split(" ");
			for (String string : list) {
				int a=Integer.parseInt(string);
				dem++;
			}
			System.out.println(dem);
			System.out.println("True");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("False");
		}
		
	}

}
