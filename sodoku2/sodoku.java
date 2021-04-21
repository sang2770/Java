package sodoku2;
import java.util.*;

import bai2.Ktra;
public class sodoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [][] matrix = new int[][]
	                {
	                        { 6, 8, 0, 0, 0, 7, 1, 0, 0 },
	                        { 0, 2, 0, 9, 1, 5, 8, 0, 7 },
	                        { 9, 0, 0, 6, 0, 3, 5, 2, 0 },
	                        { 0, 5, 6, 0, 0, 2, 0, 0, 0 },
	                        { 3, 0, 0, 0, 0, 0, 0, 0, 0 },
	                        { 0, 9, 2, 0, 6, 0, 0, 5, 8 },
	                        { 7, 0, 0, 0, 5, 6, 0, 8, 1 },
	                        { 0, 0, 8, 3, 4, 9, 0, 0, 6 },
	                        { 0, 0, 0, 8, 0, 1, 4, 3, 0 }
	                };
	     if(slove(matrix,9))
	     {
	    	 for(int i=0;i<9;i++)
	    	 {
	    		 for(int j=0;j<9;j++)
	    			 System.out.print(matrix[i][j]+" ");
	    		 System.out.println();
	    	 }
	    	 
	     }
	     
	}
	public static boolean slove(int[][] matrix, int n)
	{
		int col=-1, row=-1;
		int i=0, j=0;
		for( i=0;i<n;i++)
			for( j=0;j<n;j++)
			{
				if(matrix[i][j]==0)
				{
					row=i;
					col=j;
					break;
				}
				if(row!=-1)
					break;
			}
		if(i==n && j==n)
			return true;
		else {
			for(int value=1;value<10;value++)
				if(ktra(matrix, value, col, row, n))
				{
					matrix[row][col]=value;
					if(slove(matrix, n)==false)
						matrix[row][col]=0;
					else {
						return true;
					}
				}
			return false;
		}
	}
	
	public static boolean  ktra(int[][] a, int value, int col, int row, int n) {
		// kiem tra col
		for(int i=0;i<9;i++)
			if(value==a[row][i])
				return false;
		//kiem tra hang
		for(int i=0;i<9;i++)
			if(value==a[i][col])
				return false;
		// kiem tra ma tran con
		int subrow=row-(row%3);
		int subcol=col-(col%3);
		for(int i=subrow;i<subrow+3;i++)
			for(int j=subcol;j<subcol+3;j++)
				if(a[i][j]==value)
					return false;
		return true;
		
		
	}

}
