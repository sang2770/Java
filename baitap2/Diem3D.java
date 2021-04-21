package baitap2;


public class Diem3D extends Diem2D {
	public double z;
	public Diem3D(double x, double y, double z) {
		super(x, y);
		this.z=z;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	@Override
	public String toString() {
		return "Diem3D [x=" + this.getX() + "][y=" + this.getY() + "]\" [z=" + z + "]";
	}
//	@Overload
	public double kc(Diem3D a) {
//		System.out.println("day la 3d" );
		double u=this.x-a.x;
		double v=this.y-a.y;
		double t=this.z-a.z;
		return Math.sqrt(u*u+v*v+t*t);
	}
	@Override
	public Diem2D dx() {
		Diem3D a=new Diem3D(-x, -y, -z);
		return a;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		String s1="3D";
		return s1;
	}
	
	
	
	
	
	
}
