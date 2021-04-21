package btap3;

public class Line implements Shape {
	private Point a1;
	private Point a2;
	public Line(Point a1, Point a2) {
		super();
		this.a1 = a1;
		this.a2 = a2;
	}
	
	@Override
	public String toString() {
		return "Line [a1=" + a1 + ", a2=" + a2 + "]";
	}

	public Point getA1() {
		return a1;
	}

	public void setA1(Point a1) {
		this.a1 = a1;
	}

	public Point getA2() {
		return a2;
	}

	public void setA2(Point a2) {
		this.a2 = a2;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		int t=a1.getX()-a2.getX();
		int u=a1.getY()-a2.getY();
		return Math.sqrt(t*t+u*u);
	}
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return this.area();
	}
	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		a1.setX(a1.getX()+x);
		a2.setX(a2.getX()+x);
		a1.setY(a1.getY()+y);
		a2.setY(a2.getY()+y);
	}
	@Override
	public void zoom(int x) {
		// TODO Auto-generated method stub
		a1.setX(a1.getX()*x);
		a2.setX(a2.getX()*x);
		a1.setY(a1.getY()*x);
		a2.setY(a2.getY()*x);
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
