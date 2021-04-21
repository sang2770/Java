package QuanliNH;

public class Account {
	private long SoTk;
	private String nameTk;
	private double money;
	private String Mk;
	public static final double lai=0.0035;
	public Account(long soTk, String nameTk, double money, String Mk) {
		super();
		SoTk = soTk;
		this.nameTk = nameTk;
		this.money = money;
		this.Mk=Mk;
	}
	public String getMk() {
		return Mk;
	}
	public void setMk(String mk) {
		Mk = mk;
	}
	public long getSoTk() {
		return SoTk;
	}
	public void setSoTk(long soTk) {
		SoTk = soTk;
	}
	public String getNameTk() {
		return nameTk;
	}
	public void setNameTk(String nameTk) {
		this.nameTk = nameTk;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "Account [SoTk=" + SoTk + ", nameTk=" + nameTk + ", money=" + money + ", Mk=" + Mk + "]";
	}
	public void Naptien(long x)
	{
		this.setMoney(this.getMoney()+x);
	}
	public void Ruttien(long x)
	{
		if(this.getMoney()-x<0)
			System.out.println("Giao Dich khong thanh cong");
		else {
			this.setMoney(this.getMoney()-x);
		}
	}
	public void Daohan()
	{
		this.setMoney(this.getMoney()+this.getMoney()*lai);
	}
	
	
	

}
