package CaroGame;

public class Node {
	private int row;
	private int col;
	private int value;
	private boolean Status;
	public Node(int row, int col, int value, boolean Status) {
//		super();
		this.row = row;
		this.col = col;
		this.value = value;
		this.Status=Status;
	}
	public boolean getStatus() {
		return Status;
	}
	public void setStatus(boolean status) {
		Status = status;
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
	
	
	
}
