package sodokuob;

public class soduku {
	private int[][] a=new int[9][9];
	private int[][] adefault=new int[9][9];
	public soduku(int[][] b)
	{
		this.a=b;
		this.adefault=b;
	}
	public void seta(int v, int c, int r)
	{
		a[r][c]=v;
	}
	public void show()
	{
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	public boolean checkrow(int r,int v) {
		for(int i=0;i<9;i++)
			if(a[r][i]==v)
				return false;
		return true;
	}
	public boolean checkcol(int c, int v) {
		for(int i=0;i<9;i++)
			if(a[i][c]==v)
				return false;
		return true;
	}
	public boolean checkvung(int r, int c, int v) {
		int subr=r-(r%3);
		int subc=c-(c%3);
		for(int i=subr;i<subr+3;i++)
			for(int j=subc;j<subc+3;j++)
				if(a[i][j]==v)
					return false;
		return true;
	
	}
	public boolean trangthai() {
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
				if(a[i][j]==0)
					return false;
		}
		return true;
	}
	public boolean ktradefault(int r, int c)
	{
		if(a[r][c]!=0)
			return false;
		return true;
	}

}
