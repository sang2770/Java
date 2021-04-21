package mang;

import java.util.*;

public class Mang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 7, 3, 8, 0 };
		Scanner resScanner = new Scanner(System.in);
//		System.out.println("a");
		System.out.println("So chia het cho 2 la:");
		inmang(a);
		System.out.println("Mang sap xep tang dan");
		insertSort(a, a.length);
		inmang(a);
		System.out.println(Math.abs(-1.0));
	}

	public static void insertSort(int a[], int n) {
		int j, key;
		for (int i = 1; i < n; i++) {
			key = a[i];
			j = i - 1;
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}

	}

	public static void inmang(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				System.out.print(a[i] + " ");
		}
	}
}
