package BaitapString2;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// xoa ki tu
		String aString=" nguyen Van Sang";
	    aString=aString.replaceAll(" ", "");
		System.out.println("Chuoi khi xoa khoang trang la:"+aString);
		// viet hoa chu dau tien
		String a1=aString.substring(0, 1);
		a1=a1.toUpperCase();
		int size=aString.length();
		String a2=aString.substring(1, size);
//		System.out.println(aString.charAt(size-1));
		System.out.println(a1.concat(a2));
		
//		chuyen ki tu dau thanh hoa
		aString="nguyen van sang";
		int dem=0;
		char[] b=aString.toCharArray();
		if(b[0]>='a')
			b[0]-=32;
		for (int i = 1; i < b.length; i++) {
			if(b[i-1]==' ' && b[i]>='a')
			{
				b[i]-=32;
			}
		}
		for (char c : b) {
			System.out.print(c);
		}
		String[] liStrings=aString.split(" ");
//		Cach 2
		System.out.println();
		for (String string : liStrings) {
			System.out.println(string);
		}
		
	}

}
