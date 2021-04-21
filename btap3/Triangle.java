package btap3;

public class Triangle  implements Shape {
	private Point a1;
	private Point a2;
	private Point a3;
	public Triangle(Point a1, Point a2, Point a3) {
//		super();
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
	}
	public double line1()
	{
		int t=a1.getX()-a2.getX();
		int u=a1.getY()-a2.getY();
		return Math.sqrt(t*t+u*u);
	}
	public double line2()
	{
		int t=a1.getX()-a3.getX();
		int u=a1.getY()-a3.getY();
		return Math.sqrt(t*t+u*u);
	}
	public double line3()
	{
		int t=a3.getX()-a2.getX();
		int u=a3.getY()-a2.getY();
		return Math.sqrt(t*t+u*u);
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.line1()+this.line2()+this.line3();
	}
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		double t=this.area();
		return Math.sqrt(t*(t-this.line1())*(t-this.line2())*(t-this.line3()));
	}
	@Override
	public void move(int x, int y) {
		a1.setX(a1.getX()+x);
		a2.setX(a2.getX()+x);
		a1.setY(a1.getY()+y);
		a2.setY(a2.getY()+y);
		a3.setY(a3.getY()+y);
		a3.setY(a3.getY()+y);
	}
	@Override
	public void zoom(int x) {
		// TODO Auto-generated method stub
		a1.setX(a1.getX()*x);
		a2.setX(a2.getX()*x);
		a1.setY(a1.getY()*x);
		a2.setY(a2.getY()*x);
		a3.setY(a3.getY()*x);
		a3.setY(a3.getY()*x);
	}
	@Override
	public String toString() {
		return "Triangle [a1=" + a1 + ", a2=" + a2 + ", a3=" + a3 + "]";
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
	
	

}
