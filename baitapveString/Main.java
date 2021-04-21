package baitapveString;
import java.util.*;

import javax.sound.sampled.ReverbType;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tạo chuỗi va kiểm tra hai loại String
		String inputString="Truong dai hoc giao thong van tai!";
		String iString=new String("Truong dai hoc giao thong van tai!");
		System.out.println(inputString==iString);
		//dem ki tu a
		for(int i=0;i<inputString.length();i++)
			if(inputString.charAt(i)=='a')
				System.out.print(i+" ");
		System.out.println("");
		//loại bỏ kí tự a
		String outString=inputString.replace("a", "");
		System.out.println(outString);
		//dao nguoc chuoi
		String outString2=new StringBuffer(inputString).reverse().toString();
		System.out.println(outString2);
		
		StringBuilder sb=new StringBuilder(inputString).reverse();
		String outString3= sb.toString();
		System.out.println(outString);
		
		// THUC HANH 
		
		// nhap chuoi va dem so ki tu
		Scanner scanner=new Scanner(System.in);
//		System.out.println("Nhap chuoi bat ki tu ban phim: 0k");
//		String chuoi=scanner.nextLine();
//		System.out.println("Chuoi vua nhap co do dai la:"+chuoi.length());
		
		// ham nou hai chuoi
		String a="Nguyen van";
		String b=" Sang";
		String c=a.concat(b);
		System.out.println("Chuoi noi la"+c);
		
		// xuat ra tung ki tu trong chuoi
		for(int i=0;i<a.length();i++)
			System.out.print(a.charAt(i)+" ");
		System.out.println("");
		// so sanh hai chuoi
		int result=a.compareTo(b);
		System.out.println(result==0?"true":"False");
		if(result<0)
			System.out.println("a<b");
		else if(result==0)
			System.out.println("a==b");
		else {
			System.out.println("a>b");
		}
		// ham kiem tra chuoi a co nam trong chuoi b k return vi tri xuat hien dau tien
		
		int res=a.indexOf(b);
		if(res==-1)
			System.out.println("a khong thuoc b");
		else {
			System.out.println("a co trong b bat dau tu vi tri:"+res);
		}
		// giong ham tren nhung cha ve vi tri cuoi cung
		int res1=a.lastIndexOf(b);
		
		//ham thay the gia tri 
		System.out.println(a.replace('N', 'S'));
		// ham loai bo khong trang o dau va cuoi chuoi
		String string1=" WEllCOME  ";
		System.out.println(string1.trim());
		
		// ham tao chuoi con tu vi tri trong chuoi cha
		System.out.println(string1.substring(5));
		
		//chuyen string thanh mot mang
		char[] mang=string1.toCharArray();
		System.out.println(mang);
		
		//dao nguoc
		StringBuffer test=new StringBuffer("Nguyen").reverse();
		System.out.println(test);
		// ham tra va chinh no
		System.out.println(string1.toString());
		
		// ham contentEquals dung cho string bufeer va cả string
		String string2= new StringBuffer("sang").toString();
		System.out.println(string1.contentEquals(string2));
		// ham ss 
		String str1="ok";
		String str2="ok";
		System.out.println(str1.equals(str2));
		
		// bien doi ca chuoi
		System.out.println(str1.replaceAll("ok", "i am root"));
		
		
		// ham cat chuoi tu vi tri
		System.out.println(string1.substring(2));
		// ham chuyen in hoa thanh in thuong va nguoc lai
		System.out.println(str1.toUpperCase());
		
		System.out.println(a.toLowerCase());
		
	}

}
