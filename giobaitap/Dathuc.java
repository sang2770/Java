package giobaitap;
import java.util.*;
public class Dathuc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n;
		double res=0.0;
		System.out.println("Nhap n:");
		n=scanner.nextInt();
		double T=1.0;
		int S=1;
		System.out.println("Da thuc can  tinh la :");
		for(int i=0;i<=n;i++)
		{
//			T=T*i;
//			if(i%2==0)
//			res+=T/(i*(i+1));
//			else {
//				res-=T/(i*(i+1));
//			}
			n*=(n+1-i);
			T*=i;
//			res+=n*Math.pow(x,i)/T;
			
		}
		System.out.printf("%.2f", res);
		scanner.close();	
	}
//	public static int giaithua(int n)
//	{
////		int res=1;
////		for(int i=1;i<=n;i++)
////			res*=i;
////		return res;
//		if(n==1|| n==0)
//			return 1;
//		else {
//			return n*giaithua(n-1);
//		}
//	}

}
