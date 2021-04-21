package baitap2;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diem2D a1=new Diem2D(1, 2);
		Diem2D a2=new Diem2D(5, 2);
		Diem2D a3=new Diem2D(8,7);
		Diem3D a4=new Diem3D(1, 2,8);
		Diem3D a5=new Diem3D(1, 2, 4);
		List <Diem2D> L=new ArrayList <Diem2D> ();
		L.add(a1);
		L.add(a2);
		L.add(a3);
		L.add(a4);
		L.add(a5);
		L.remove(2);
		L.forEach(value -> System.out.println(value));
		/*
		 * Show
		 */
		for (Diem2D z : L) {
			System.out.println(z+z.name());
		}
		Diem2D[] static2D={a1, a2, a3, a4};
		L.clear();
		System.out.println("Da xoa");
		L.addAll(Arrays.asList(static2D));
		for (Diem2D diem2d : L) {
			System.out.println(diem2d);
		}
		/*
		 * tim kiem
		 */
		if(L.contains(a1)==true)
		{
			System.out.println("Co phan tu can tim");
		}
		System.out.println(L.lastIndexOf(a1)+"La vi tri cuoi cung xuat hien");
		/*
		 * Tim kiem 2
		 */
		Diem2D a6=new Diem2D(1, 2);
		if(L.contains(a6)==true)
		{
			System.out.println("Co phan tu can tim");
		}
		else {
			System.out.println("Khong tim thay");
		}
		System.out.println(L.lastIndexOf(a6)+"La vi tri cuoi cung xuat hien");
		/*
		 * Sort
		 */
		L.sort(new Diem2D());
		for (Diem2D diem2d : L) {
			System.out.println(diem2d);
		}
		/*
		 * Tong k/c 
		 */
		double sum2D=0, sum3D=0;
		Vector<Diem2D> res1=new Vector<Diem2D>();
		ArrayList<Diem2D> res2=new ArrayList<Diem2D>();
		for(Diem2D z:L)
		{
			if(z.name()=="2D")
			{
				for (Diem2D z1 : res1) {
					sum2D+=z1.kc(z);
				}
				res1.add(z);
			}
			if(z.name()=="3D")
	
				for (int i=0;i<res2.size();i++) {
					sum3D+=res2.get(i).kc(z);
				}
				res2.add(z);
				
			}
		
		
		System.out.println(res2.size());
		System.out.println("Tong KC cac diem 2D la:"+sum2D);
		System.out.println("Tong KC cac diem 3D la:"+sum3D);
		/*
		 * Diem doixung
		 */
		System.out.println("Danh sach diem ");
		int size=L.size();
		for (int i=0;i<size;i++) {
			L.add(L.get(i).dx());
		}
		for (Diem2D diem2d : L) {
			System.out.println(diem2d);
		}
//		
	}

}
