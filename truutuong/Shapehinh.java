package truutuong;

public abstract class Shapehinh implements Ishape {
	public void Control()
	{
		// show
		System.out.println(this.showme());
		// chuvi
		System.out.println(this.area());
		//dien tich
		System.out.println(this.pre());
		
	}
}
