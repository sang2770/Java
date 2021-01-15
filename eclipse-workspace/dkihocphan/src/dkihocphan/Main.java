package dkihocphan;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		try(Scanner reScanner=new Scanner(System.in)){
		n=reScanner.nextInt();
		monhoc[] a=new monhoc[n+1];
		for(int i=0;i<n;i++)
		{
			a[i]=new monhoc();
			a[i].nhap();
		}
		System.out.println("Nhap so sinh vien");
		int m=reScanner.nextInt();
		dkihp[] b=new dkihp[m+1];
		int[] sotin=new int[m+1];
		for(int i=0;i<m;i++)
		{
			b[i]=new dkihp();
			b[i].nhap();
			b[i].dki(n);
			for(int j=0;j<n;j++)
			{
				a[j].xuat();
				int c=reScanner.nextInt();
				b[i].setcheck(c, j);
				if(c==1)
					sotin[j]+=a[j].gettin();
				
			}
		}
		System.out.println("So tin chi moi sinh vien la:");
		for(int i=0;i<m;i++)
		{
			b[i].xuat();
			System.out.println(sotin[i]);
		}
		System.out.println("Nhap mon hoc can thong ke:");
		String test=reScanner.next();
		int vt=n;
		for(int i=0;i<n;i++)
			if(test.equals(a[i].getmon()))
			{
				vt=i;
				break;
			}
		System.out.println(vt);
		int dem=0;
		for(int i=0;i<m;i++)
			if(b[i].getcheck(vt)==1)
			{
				b[i].xuat();
				System.out.println("");
				dem++;
			}
		if(dem==0)
			System.out.println("Khong co sinh vien nao dki!");
				
		
	}

}
}
