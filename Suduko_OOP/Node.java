package Suduko_OOP;

public class Node {
	private int row;
	private int col;
	private int value;
	private boolean Revert;
	private int zone;
	public Node(int row, int col, int value, boolean revert) {
//		super();
		this.row = row;
		this.col = col;
		this.value = value;
		Revert = revert;
		this.zone=CalculatorZone();
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public boolean getRevert() {
		return Revert;
	}
	public void  setRevert(Boolean revert) {
		Revert = revert;
	}
	public int getZone() {
		return zone;
	}
	public void setZone(int zone) {
		this.zone = zone;
	}
	public boolean Validate()
	{
		if(value<0 || value>9)
		{
			return false;
		}
		if(col<0 || col>9)
		{
			return false;
		}
		if(row<0 || row>9)
		{
			return false;
		}
		return true;
	}
	public int CalculatorZone()
	{
		int r=this.row / Contain.Zone_size;
		int c=this.col / Contain.Zone_size;
		return r/Contain.Zone_size +c;
	}
	
	
	
}
