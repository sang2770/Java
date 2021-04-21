package truutuong;

public class test {
	public static void main(String[] args) {
		Point point=new Point(1,2);
		Point point1=new Point(2,2);
	    System.out.println(point.showme());
//	    circle ci=new circle();
//	    System.out.println(ci.showMe());
	    Line line=new Line(point, point1);
	    line.Control();
	}
}
