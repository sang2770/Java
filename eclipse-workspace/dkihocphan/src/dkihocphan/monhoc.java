package dkihocphan;
import java.util.*;
public class monhoc {
	Scanner res=new Scanner(System.in);
	int mamon;
	String tenmon;
	int sotin;
	public void nhap()
	{
		System.out.println("Nhap ma mon:");
		mamon=Integer.parseInt(res.nextLine());
		System.out.println("Nhap ten mon");
		tenmon=res.nextLine();
		System.out.println("Nhap so tin:");
		sotin=res.nextInt();
	}
	public void xuat()
	{
		System.out.println(mamon+"||"+tenmon+"||");
	}
	public String getmon() {
		return tenmon;
		
	}
	public int gettin() {
		return sotin;
	}
	public int getma()
	{
		return mamon;
	
	}

}
