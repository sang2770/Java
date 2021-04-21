package btap3;

public class Point implements Shape {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public double distance() {
		// TODO Auto-generated method stub
		return Math.sqrt(this.x*this.x+this.y*this.y);
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		this.x+=x;
		this.y+=y;
	}

	@Override
	public void zoom(int x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rotate(int x) {
		// TODO Auto-generated method stub
		
	}
	
	
}
