package btap3;

public interface Shape {
	/*
	 * Nhom tinh toan
	 */
	// tinh dien tich
	public double area();
	// tnh chu vi
	public double perimeter();
	// tinh khoang cach
	public double distance();
	
	/*
	 * Nhom tinh tien
	 */
	// tinh tien
	public void move( int x, int y);
	// xoay
	public void rotate(int x);
	// thay doi
	public void zoom(int x);
	
	

}
