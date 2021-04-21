package truutuong;

public class Point extends Shapehinh {
	private int x;
	private int y;
	public Point(int x, int y) {
//		super();
		this.x = x;
		this.y = y;
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
	public String showme() {
		return "i aam a Points;";
		
	}
	@Override
	public double area() {
		return 0;
	}
	@Override
	public double pre() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
