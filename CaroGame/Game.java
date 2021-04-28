package CaroGame;

import java.util.Arrays;

import javax.swing.plaf.TreeUI;

public class Game {
	private Node[][] game;

	public Game() {
		int game_size=Constants.game_size;
		game= new Node[game_size][game_size];
		for (int i = 0; i < game_size; i++) {
			for (int j = 0; j < game_size; j++) {
				Node node =new Node(i,j, 0, false);
				this.game[i][j] = node;
			}
		}
	}

	public Node[][] getGame() {
		return game;
	}

	public void setGame(Node[][] game) {
		this.game = game;
	}
	public Node getNode(int row, int col)
	{
		return game[row][col];
	}
	public void setNode(Node a)
	{
		int row=a.getRow();
		int col=a.getCol();
		int value=a.getValue();
		String color=((value==1)?"x":"o");
		Node node=this.getNode(row, col);
		node.setValue(value);
		node.setStatus(a.getStatus());
	}

	@Override
	public String toString() {
		StringBuilder sdata = new StringBuilder();
		sdata.append("============== GAME ===============\n");
		for (Node[] nodes : this.game) {
			for (Node node : nodes) {
				sdata.append(node.getValue() + " | ");
			}
			sdata.append("\n");
		}
		return sdata.toString();
	}
	public boolean checkStatus(int row, int col)
	{
		if(this.getNode(row, col).getStatus()==false)
		{
			return true;
		}
		return false;
	}
	public boolean checkCol(Node node)
	{
		int row=node.getRow();
		int col=node.getCol();
		int value=node.getValue();
		int dem=0, r=row, c=col;
		int size=Constants.game_size;
		while(c<size && getNode(row, c).getValue()==value)
		{
			dem++;
			c++;
			
		}
		c=col-1;
		while(c>=0 && this.getNode(row, c).getValue()==value)
		{
			dem++;
			c--;
			
		}
		if(dem>4)
		{
			return true;
		}
		return false;
	}
	public boolean checkRow(Node node)
	{
		int row=node.getRow();
		int col=node.getCol();
		int value=node.getValue();
		int dem=0, r=row, c=col;
		int size=Constants.game_size;
		// check hang
		while(r<size && getNode(r, col).getValue()==value)
		{
			dem++;
			r++;
			
		}
		r=row-1;
		while(r>=0 &&  this.getNode(r, col).getValue()==value)
		{
			dem++;
			r--;
			
		}
		if(dem>4)
		{
			return true;
		}
		return false;
	}
	public boolean checkCross1(Node node)
	{
		int row=node.getRow();
		int col=node.getCol();
		int value=node.getValue();
		int dem=0, r=row , c=col;
		int size=Constants.game_size;
		while(c<size && r<size && this.getNode(r, c).getValue()==value)
		{
			dem++; c++; r++;
			
		}
		r=row-1; c=col-1;
		while(c>=0 && r>=0 && this.getNode(r, c).getValue()==value)
		{
			dem++; c--; r--;
		}
		if(dem>4)
		{
			return true;
		}
		return false;
	}
	public boolean checkCross2(Node node) {
		int row=node.getRow();
		int col=node.getCol();
		int value=node.getValue();
		int dem=0, r=row , c=col;
		int size=Constants.game_size;
		while(c<size && r>=0 && this.getNode(r, c).getValue()==value)
		{
			dem++; c++; r--;
		}
		r=row-1; c=col-1;
		while(c>=0 && r>=0 && r<size && this.getNode(r, c).getValue()==value)
		{
			dem++; c--; r++;
		}
		if(dem>4)
		{
			return true;
		}
		return false;
	}
	public boolean checkWin(Node node)
	{
		if(checkCol(node)|| checkRow(node)|| checkCross1(node)|| checkCross2(node))
			return true;
		return false;
	}
	public void Reset()
	{
		for (int i = 0; i < Constants.game_size; i++) {
			for (int j = 0; j < Constants.game_size; j++) {
				Node node =new Node(i,j, 0, false);
				this.game[i][j] = node;
			}
		}
	}
	
	
	
	
}
