package Kethua;

public class Xe {
	String mauString;
	int Soluonng;
	public Xe() {
	}
	public String getMauString() {
		return mauString;
	}
	public void setMauString(String mauString) {
		this.mauString = mauString;
	}
	public int getSoluonng() {
		return Soluonng;
	}
	public void setSoluonng(int soluonng) {
		Soluonng = soluonng;
	}
	@Override
	public String toString() {
		return "Xe [mauString=" + mauString + ", Soluonng=" + Soluonng + "]";
	}
	

}
