package Sophuc;

import javax.swing.plaf.basic.BasicSplitPaneDivider;

public class Sophuc {
	private double thuc;
	private double ao;
	public Sophuc()
	{
		this.thuc=1;
		this.ao=-1;
	}
	public Sophuc(double thuc, double ao) {
		this.thuc = thuc;
		this.ao = ao;
	}
	public double getThuc() {
		return thuc;
	}
	public void setThuc(double thuc) {
		this.thuc = thuc;
	}
	public double getAo() {
		return ao;
	}
	public void setAo(double ao) {
		this.ao = ao;
	}
	@Override
	public String toString() {
		if(this.ao<0)
		{
			return "["+this.thuc+""+this.ao+"*i"+"]";
		}
		else if(this.ao==0)
		{
			return "["+this.thuc+"]";
		}
		return "["+this.thuc+"+"+this.ao+"*i"+"]";
	}
	public Sophuc cong(Sophuc a)
	{
		double a1=this.thuc+a.thuc;
		double a2=this.ao+a.ao;
		Sophuc b=new Sophuc(a1, a2);
		return b;
	}
	public Sophuc div(double d)
	{
		this.ao=this.ao/d;
		this.thuc=this.thuc/d;
		return this;
	}
	public double Module()
	{
		double u=this.thuc*this.thuc;
		double v=this.ao*this.ao;
		return Math.sqrt(u+v);
	}
}
