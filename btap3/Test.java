package btap3;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
	Point a1=new Point(1, 2);
	Line a2=new Line(new Point(2, 2),new Point(2, 3));
	Circle a3=new Circle(10, new Point(3,3));
	Triangle a4=new Triangle(new Point(4, 2),new Point(5, 3),new Point(2, 3));
	ArrayList <Shape> L=new ArrayList<Shape>();
	L.add(a1);
	L.add(a2);
	L.add(a3);
	L.add(a4);
	double res=0;
	double min=L.get(0).perimeter();
	for(Shape z: L)
	{
		System.out.println(z);
		double t=z.perimeter();
		res+=t;
		if(min>t)
		{
			min=t;
		}
	}
	System.out.println("Tong dien tich cac hinh:"+res);
	System.out.println("Cac hinh co dien tich nho nhat la");
	for(Shape z: L)
	{
		if(z.perimeter()==min)
			System.out.println(z);
	}
	System.out.println("Nhap ti le ratio:");
	Scanner cdScanner= new Scanner(System.in);
	int ratio=cdScanner.nextInt();
	System.out.println("Kich thuoc ca hinh sau khi zoom la:");
	for(Shape z: L)
	{
		z.zoom(ratio);
		System.out.println(z);
	}
	

	}
}
