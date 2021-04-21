package Practice_File_2;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Point {
	public static String file_in="C:\\Users\\nguye\\eclipse-workspace\\Baitapmodau\\src\\Practice_File_2\\Point.txt";
	public static String file_out="C:\\Users\\nguye\\eclipse-workspace\\Baitapmodau\\src\\Practice_File_2\\Result.txt";
	
	public static List<PointItem> list=new ArrayList<PointItem>(); 
	public static void main(String[] args) throws IOException
	{
		FileReader fin=null;
		BufferedReader Bin=null;
		FileWriter fout=null;
		BufferedWriter Bout =null;
		try {
			// lay du lieu
			fin=new FileReader(file_in);
			Bin=new BufferedReader(fin);
			String s=Bin.readLine();
			String ListPoint="";
			while(s != null)
			{
				ListPoint+=s;
				s=Bin.readLine();
			}
			System.out.println(ListPoint);
			String[] pointStrings=ListPoint.split("]-");
			for (String z : pointStrings) {
				z=z.replace("[", "").replace("]", "");
				String[] z1=z.split(";");
				PointItem item=new PointItem(Double.parseDouble(z1[0]),Double.parseDouble(z1[1]) );
				list.add(item);
			}
			// tinh tong khoang cach
			double res=0;
			for(PointItem z: list)
			{
				for(PointItem z1: list)
				{
					res+=z.Distance(z1);
				}
			}
			
			// ghi ket qua
			fout=new FileWriter(file_out);
			Bout=new BufferedWriter(fout);
			Bout.write("Total Of Point:"+ list.size());
			Bout.newLine();
			Bout.write("Sum of distance ="+res);
			System.out.println("Write in file Successful!");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}finally {
			if(Bin!=null)
			{
				Bin.close();
			}
			if(fin!=null)
			{
				fin.close();
			}
			if(Bout!=null)
			{
				Bout.close();
			}
			if(fout!=null)
			{
				fout.close();
			}
		}
	}
}
