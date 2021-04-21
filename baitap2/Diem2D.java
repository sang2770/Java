package baitap2;

import java.util.Comparator;

public class Diem2D implements Comparator<Diem2D>{
	protected double x;
	protected double y;
	public Diem2D() {
		super();
	}
	public  Diem2D(double x, double y) {
//		super();
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Diem2D [x=" + x + ", y=" + y + "]";
	}
	public double kc(Diem2D a)
	{
//		System.out.println("Day la 2d");
		double u=this.x-a.x;
		double v=this.y-a.y;
		return Math.sqrt(u*u+v*v);
	}
	public Diem2D dx()
	{
		
		double x1=-this.x;
		double y1=-this.y;
		Diem2D a=new Diem2D(x1,y1);
		return a;
	}
	public String  name() {
		String s="2D";
		return s; 
	}
//	instanceof
//	Dinh nghia laji hascode
	public double distance() {
		// TODO Auto-generated method stub
		return 0;
	}
//	@Override
//	public int hashCode()
//	{
//		double d=this.distance();
////		int hashkey =new Double(d).hashCode();
//		return Double(d).hashCode();
//	}
	@Override
	public int compare(Diem2D o1, Diem2D o2) {
		// TODO Auto-generated method stub
		double d1=o1.distance();
		double d2=o2.distance();
		return d1>d2? 1: d1==d2? 0:-1;
	}
	

}
