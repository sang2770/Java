package Practice_File_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;

public class TestFile {
	public static String File_IN="C:\\Users\\nguye\\eclipse-workspace\\Baitapmodau\\src\\Practice_File_1";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		FileInputStream fin=null;
		try {
			File fin=new File(File_IN);
			
			System.out.println("Property Of File:");
			System.out.println("CanRead:"+ fin.canRead());
			System.out.println("Exist:"+fin.exists());
			System.out.println("CanWrite: "+fin.canWrite());
			System.out.println("Name: "+fin.getName() );
			System.out.println("Parent: "+ fin.getParent());
			System.out.println("Path"  + fin.getPath());
			System.out.println("AbsolutePath|:"+ fin.getAbsolutePath());
			double size=fin.length();
			System.out.println("lengh" +size/(1024) );
//			System.out.println("Size:"+ fin.getTotalSpace());
			
			// change property
//			fin.setReadOnly();
//			System.out.println(fin.canWrite());
//			System.out.println(fin.canRead());
			
			
			// dinh nghia filter
			FilenameFilter filter= new FilenameFilter() {
				
				@Override
				public boolean accept(File dir, String name) {
					// TODO Auto-generated method stub
					return name.endsWith(".txt");
				}
			};
			// loc
			File[] files=fin.listFiles(filter);
			for (File file : files) {
				System.out.println(file.getName());
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}

}
