package Phanso_OOP;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.zip.ZipEntry;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Phanso[] a= new Phanso[4];
//		a[0]=new Phanso(1,2);
//		a[1]=new Phanso(1,4);
//		a[2]=new Phanso(2,2);
//		a[3]=new Phanso(1,5);
		ArrayList<Phanso> list= new ArrayList<Phanso>();
		Phanso a1=new Phanso(1,2);
		Phanso a2=new Phanso(1,4);
		Phanso a3=new Phanso(2,2);
		list.add(a1);
		list.add(a2);
		list.add(a3);
		Phanso resPhanso=new Phanso();
		Phanso maxPhanso=list.get(0);
		for (Phanso z : list) {
			if(z.compare(maxPhanso)==1)
				maxPhanso=z;
//			resPhanso=resPhanso.tong(z);
		}
		resPhanso=resPhanso.tong(list.get(0));
		resPhanso=resPhanso.tong(list.get(1));
		System.out.println("phan so max:");
		for (Phanso phanso : list) {
			if(phanso.compare(maxPhanso)==0)
				System.out.println(phanso.toString());
		}
		resPhanso.rutgon();
		System.out.println("Tong cac phan so la:"+resPhanso.getTuso()+"/"+resPhanso.getMauso());
		for (Phanso z : list) {
			System.out.println(z.getTuso()+"/"+z.getMauso());
		}
		
	}

}
