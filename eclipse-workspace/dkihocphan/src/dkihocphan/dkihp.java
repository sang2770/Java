package dkihocphan;
import java.util.*;

//import javax.sound.midi.VoiceStatus;
public class dkihp {
	Scanner resScanner=new Scanner(System.in);
	int masv;
	String tensv;
	int[] a;
	public void nhap() {
		System.out.println("Nhap ma sinh vien");
		masv=Integer.parseInt(resScanner.nextLine());
		System.out.println("Nhap ten sinh vien");
		tensv=resScanner.nextLine();
		System.out.println("Nhap bang dki hoc phan:");
		
	}
	public void xuat()
	{
		System.out.print(masv+"||"+tensv+"||");
	
	}
	public int getcheck(int i) {
		return a[i];
	}
	public void setcheck(int b, int i) {
		a[i]=b;
	}
	public void dki(int n) {
		a=new int[n+1];
		
	}
	
	
}
