package BaiTap_2;

import java.util.Scanner;


public class Validate {
	public static void  validate(String s) throws ValidateEmail
	{
		if(s.indexOf("@")==-1)
		{
			throw new ValidateEmail("missing @");
		}
		if(s.indexOf(".")==-1)
		{
			throw new ValidateEmail("missing .");
		}
		if(s.indexOf("@")!= s.lastIndexOf("@"))
		{
			throw new ValidateEmail("Multilplace @");
		}
		if(s.lastIndexOf("@") < s.lastIndexOf("."))
		{
			throw new ValidateEmail("Not Valible");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String email="  nguyenvansang30102001@gmai.com  ";
		try {
			Scanner cdScanner=new Scanner(System.in);
			System.out.println("Nhap chuoi cua ban");
			String email =cdScanner.nextLine();
			validate(email);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
