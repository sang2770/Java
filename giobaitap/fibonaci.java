package giobaitap;

import java.util.*;

public class fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[] a = new int[n + 1];
		int i = 2;
		a[0] = 1;
		a[1] = 1;
		int res = 0;
//		for(int i=2;i<100;i++)
//			a[i]=a[i-1]+a[i-2];
//		System.out.println(a[n-1]);
//		System.out.println(fibonacii(5));
		while (a[i] >= n) {
			a[i] = a[i - 2] + a[i - 1];
			if (n - a[i - 1] > a[i] - n)
				res = a[i - 1];
			else {
				res = a[i];
			}
			i++;
		}

	}

	public static int fibonacii(int n) {
		if (n == 1 || n == 2)
			return 1;
		return fibonacii(n - 1) + fibonacii(n - 2);
	}

}
