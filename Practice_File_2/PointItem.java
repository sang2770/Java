package Practice_File_2;

public class PointItem {
	private double x;
	private double y;
	public PointItem(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "PointItem [x=" + x + ", y=" + y + "]";
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
	public double Distance(PointItem a1)
	{
		double u=a1.x-this.x;
		double v=a1.y-this.y;
		return Math.sqrt(v*v  +u*u);
	}
}
