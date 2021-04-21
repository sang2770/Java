package Phanso_OOP;

public class Phanso {
	private int tuso;
	private int mauso;
	public Phanso()
	{
		tuso=0;
		mauso=1;
	}
	public Phanso(int a, int b)
	{
		tuso=a;
		mauso=b;
	}
	public int getTuso() {
		return tuso;
	}
	public void setTuso(int tuso) {
		this.tuso = tuso;
	}
	public int getMauso() {
		return mauso;
	}
	public void setMauso(int mauso) {
		this.mauso = mauso;
	}
	@Override
	public String toString() {
		return "Phanso [tuso=" + tuso + ", mauso=" + mauso 
				+ "]";
	}
	public Phanso tong(Phanso a)
	{
		Phanso c=new Phanso();
		c.tuso=tuso*a.getMauso()+a.getTuso()*mauso;
		c.mauso=mauso*a.getMauso();
		return c;
	}
	public Phanso Hieu(Phanso a)
	{
		Phanso c=new Phanso();
		c.tuso=tuso*a.mauso-a.tuso*mauso;
		c.mauso=mauso*a.mauso;
		return c;
	}
	public Phanso Tich(Phanso a)
	{
		Phanso c=new Phanso();
		c.tuso=tuso*a.tuso;
		c.mauso=mauso*a.mauso;
		return c;
	}
	public Phanso Thuong(Phanso a)
	{
		Phanso c=new Phanso();
		c.tuso=tuso*a.mauso;
		c.mauso=mauso*a.tuso;
		return c;
	}
	public Phanso rutgon() {
		Phanso cPhanso=new Phanso();
		cPhanso.tuso=tuso/ucln(tuso, mauso);
		cPhanso.mauso=mauso/ucln(tuso, mauso);
		return cPhanso;
	}
	public int ucln(int a, int b)
	{
		if(a==0|| b==0)
			return a+b;
		while(true)
		{
			if(a>b) a=a-b;
			if(a<b) b=b-a;
			if(a==b) return a;
			
		}
			
	}
	public int  compare(Phanso a) {
		int tu=tuso/mauso;
		int mau=a.tuso/a.mauso;
		if(tu==mau)
			return 0;
		else if(tu>mau) {
			return 1;
		}
		else {
			return -1;
		}
		
	}
	
}
