package Sophuc;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sophuc a1=new Sophuc(1, 2);
		Sophuc a2=new Sophuc(4, 2);
		Sophuc a3=new Sophuc(7, 3);
		Sophuc a4=new Sophuc(9, -2);
		Sophuc a5=new Sophuc(2, 0);
		ArrayList<Sophuc> list= new ArrayList<Sophuc>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		list.add(a5);
		/*
		 * Show
		 */
		System.out.println("Danh sach so phuc:");
		for (Sophuc z : list) {
			System.out.println(z);
		}
		/*
		 * Trung binh cong
		 */
		Sophuc b=new Sophuc();
		for (Sophuc z : list) {
			b=a1.cong(z);
		}
		int size=list.size();
		System.out.println("Trung binh cong so phuc la:");
		System.out.println(b.div(size));
		/*
		 * So phuc co module lon nhat
		 */
		double max=list.get(0).Module();
		ArrayList<Sophuc> listao=new ArrayList<Sophuc>();
		System.out.println("So phuc co module lon nhat la ");
		for (Sophuc z : list) {
			double min=z.Module();
			if(max<min)
			{
				max=min;
			}
		}
		
		for(Sophuc z: list)
		{
			if(max==z.Module())
			{
				System.out.println(z);
			}
		/*
		 * Kiem tra so phuc k co phan ao
		 */
			if(z.getAo()==0)
			{
				listao.add(z);
			}
		}
		/* 
		 * in so phuc k co phan ao
		 */
		System.out.println("So phuc k co phan ao la:");
		for (Sophuc sophuc : listao) {
			System.out.println(sophuc);
		}
		if(listao.size()==0)
		{
			System.out.println("Khong co so phuc nao co phan ao bang 0");
		}
		
	}

}
