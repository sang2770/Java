package Practice_File_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileVirus {
	public static String File_in="E:\\CNTT4K58nam2";
	public static List<String> listFile=new ArrayList<String>();
	public static FilenameFilter name=new FilenameFilter() {
		
		@Override
		public boolean accept(File dir, String name) {
			// TODO Auto-generated method stub
			return name.endsWith(".exe") || name.endsWith(".bat");
		}
	};
	public static void  Readfile(File s) 
	{
		try {
		File[] lisFiles=s.listFiles();
		for (File file : lisFiles) {
			System.out.println(file.getAbsolutePath());
			if(file.getName().endsWith(".exe")|| file.getName().endsWith(".bat")){
				listFile.add(file.getName());
			}
			if(file.listFiles()!=null)
			{
				Readfile(file);
			}
		}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file=new File(File_in);
			Readfile(file);
			if(listFile.size()==0) {
				System.out.println("No File Virus");
			}
			else {
				System.out.println("Number File Virus:" + listFile.size());
				for (String z : listFile) {
					System.out.println(z);
				}
			}
				
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
