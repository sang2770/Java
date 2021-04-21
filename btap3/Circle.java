package btap3;


public class Circle implements Shape {
	private int r;
	private Point a1;
	private double pi=3.14;
	public Circle(int r, Point a1) {
//		super();
		this.r = r;
		this.a1 = a1;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	@Override
	public String toString() {
		return "Circle [r=" + r + ", a1=" + a1 + "]";
	}
	public Point getA1() {
		return a1;
	}
	public void setA1(Point a1) {
		this.a1 = a1;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 2*pi*r;
	}
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return pi*r*r;
	}
	@Override
	public double distance() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void rotate(int x) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		a1.setX(a1.getX()+x);
		a1.setY(a1.getY()+y);
	}
	@Override
	public void zoom(int x) {
		// TODO Auto-generated method stub
		this.r*=x;
	}
	
	
}
