package Kethua;

public class Xetai extends Xe {
	String tenString;
	int trongtai;
	public Xetai() {};
	public String getTenString() {
		return tenString;
	}
	public void setTenString(String tenString) {
		this.tenString = tenString;
	}
	public int getTrongtai() {
		return trongtai;
	}
	public void setTrongtai(int trongtai) {
		this.trongtai = trongtai;
	}
	@Override
	public String toString() {
		return "Xetai [tenString=" + tenString + ", trongtai=" + trongtai + ", mauString=" + mauString + ", Soluonng="
				+ Soluonng + "]";
	}
	
}

