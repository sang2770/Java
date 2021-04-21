package truutuong;

public class Line extends Shapehinh {
	private Point p1;
	private Point p2;
	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	@Override
	public String showme() {
		// TODO Auto-generated method stub
		return "I am a Line";
	}
	@Override
	public double area() {
		int t=p1.getX()-p2.getX();
		int u=p1.getY()-p2.getY();
		return Math.sqrt(t*t+u*u);
	}
	@Override
	public double pre() {
		return 0;
	}
	
	

}
