package Matran;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner cdScanner = new Scanner(System.in);
		// Tạo và in ra ma trận
		System.out.println("Nhap ma tran");
		int[][] a = { { 1, 2, 4, 0 }, { 1, 5, 7, 3 }, { 1, 3, 5, 3 }, { 3, 5, 7, 3 } };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");

			}
			System.out.println("");
		}
		// Tìm các phần tử lẻ, tính trung bình cộng
		double res = 0, dem = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] % 2 != 0) {
					dem++;
					res += a[i][j];
				}

			}
		}
		System.out.println(dem);
		System.out.println(res / dem);
//		System.out.println(2%3);
	}
}

