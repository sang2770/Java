package BaiTap_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test_person {
	public static void show(List<Person> L)
	{
		for (Person person : L) {
			System.out.println(person);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list=new ArrayList<Person>();
		Person a1=new Person(1, "sang", "nguyenvansang@gmail.com");
		Person a2=new Person(2, "Mai", "Mai@gmail.com");
		Person a3=new Person(3, "Nam", "Nam@gmail.com");
		Person a4=new Person(4, "Hai", "Hai@gmail.com");
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		show(list);
		System.out.println("Danh sach sau khi sap xep la:");
//		Collections.sort(list);
		list.sort(new Mycomparator());
		show(list);
		//Cach2
		
		
		list.remove(1);
		System.out.println("Danh sach sau khi xoa la:");
//		list.remove(a1);
		show(list);
	}

}
