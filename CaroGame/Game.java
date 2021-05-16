package CaroGame;

import java.security.KeyPair;
import java.util.Arrays;
import java.util.Stack;

import javax.swing.plaf.TreeUI;

public class Game {
	private Node[][] game;
	private boolean gomoku=true;
	private Stack<Pair> S=new Stack<Pair>();
	public Game() {
		int game_size=Constants.game_size;
		game= new Node[game_size+2][game_size+2];
		for (int i = 1; i <= game_size; i++) {
			for (int j = 1; j <= game_size; j++) {
				Node node =new Node(i,j, 0, false);
				this.game[i][j] = node;
			}
		}
		for(int i=0;i<=game_size+1;i++)
		{
			Node node = new Node(0,i, 3, false);
			this.game[0][i] = node;
			Node node_1 =new Node(game_size+1,i, 0, false);
			this.game[game_size+1][i] = node;
		}
		for(int i=0;i<=game_size+1;i++)
		{
			Node node = new Node(i, 0, 3, false);
			this.game[i][0] = node;
			Node node_1 =new Node(i,game_size+1, 0, false);
			this.game[i][game_size+1] = node;
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
		if(value!=0)
		{
			S.push(new Pair(row, col));
		}
		
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
		int CheckFalse=0;
		int row=node.getRow();
		int col=node.getCol();
		int value=node.getValue();
		int dem=0, r=row, c=col;
		int size=Constants.game_size;
		while(getNode(row, c).getValue()==value && getNode(row, c).getValue()!=3)
		{
			dem++;
			c++;
			
		}
		if(gomoku && getNode(row, c).getValue()!=value && getNode(row, c).getValue()!=0 && getNode(row, c).getValue()!=3 )
			CheckFalse++;
		c=col-1;
		while(getNode(row, c).getValue()!=3 && this.getNode(row, c).getValue()==value)
		{
			dem++;
			c--;
			
		}
		if(gomoku && getNode(row, c).getValue()!=3 && getNode(row, c).getValue()!=value && getNode(row, c).getValue()!=0 )
			CheckFalse++;
		if(dem>4 && CheckFalse!=2)
		{
			return true;
		}
		return false;
	}
	public boolean checkRow(Node node)
	{
		int CheckFalse=0;
		int row=node.getRow();
		int col=node.getCol();
		int value=node.getValue();
		int dem=0, r=row, c=col;
		int size=Constants.game_size;
		// check hang
		while(getNode(r, col).getValue()!=3 && getNode(r, col).getValue()==value)
		{
			dem++;
			r++;
			
		}
		if(gomoku && getNode(r, col).getValue()!=3 && getNode(r, col).getValue()!=value && getNode(r, col).getValue()!=0 )
			CheckFalse++;
		r=row-1;
		while(getNode(r, col).getValue()!=3 &&  this.getNode(r, col).getValue()==value)
		{
			dem++;
			r--;
			
		}
		if(gomoku && getNode(r, col).getValue() !=3 && getNode(r, col).getValue()!=value && getNode(r, col).getValue()!=0 )
			CheckFalse++;
		if(dem>4 && CheckFalse!=2)
		{
			return true;
		}
		return false;
	}
	public boolean checkCross1(Node node)
	{
		int CheckFalse=0;
		int row=node.getRow();
		int col=node.getCol();
		int value=node.getValue();
		int dem=0, r=row , c=col;
		while(getNode(r, c).getValue()!=3 &&  getNode(r, c).getValue()==value)
		{
			dem++; c++; r++;
		}
		if(gomoku && getNode(r, c).getValue()!=3 && getNode(r, c).getValue()!=value && getNode(r, c).getValue()!=0 )
			CheckFalse++;
		r=row-1; c=col-1;
		while(getNode(r, c).getValue()!=3 && this.getNode(r, c).getValue()==value)
		{
			dem++; c--; r--;
		}
		if(gomoku && getNode(r, c).getValue()!=3 && getNode(r, c).getValue()!=value && getNode(r, c).getValue()!=0 )
			CheckFalse++;
		if(dem>4 && CheckFalse!=2)
		{
			return true;
		}
		return false;
	}
	public boolean checkCross2(Node node) {
		int CheckFalse=0;
		int row=node.getRow();
		int col=node.getCol();
		int value=node.getValue();
		int dem=0, r=row , c=col;
		while(getNode(r, c).getValue()!=3 && getNode(r, c).getValue()==value)
		{
			dem++; c++; r--;
		}
		if(gomoku && getNode(r, c).getValue()!=3 && getNode(r, c).getValue()!=value && getNode(r, c).getValue()!=0 )
			CheckFalse++;
		r=row+1; c=col-1;
		while(getNode(r, c).getValue() !=3 && this.getNode(r, c).getValue()==value)
		{
			dem++; c--; r++;
		}
		if(gomoku && getNode(r, c).getValue()!=3 && getNode(r, c).getValue()!=value && getNode(r, c).getValue()!=0 )
			CheckFalse++;
		System.out.println(dem);
		if(dem>4 && CheckFalse!=2)
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
		for (int i = 1; i <= Constants.game_size; i++) {
			for (int j = 1; j < Constants.game_size; j++) {
				Node node =new Node(i,j, 0, false);
				this.game[i][j] = node;
			}
		}
	}

	public void setGomoku() {
		this.gomoku = !gomoku;
		System.out.println("gomoku"+gomoku);
	}

	public Pair getNode_back()
	{
		if(S.size()!=0)
		{
			Pair s1=S.peek();
			S.pop();
			int i=s1.getX(), j=s1.getY();
			Node node_1=new Node(i, j, 0, false);
			this.setNode(node_1);
			return s1;
		}
		return null;
	}
	
	
	
	
	
}
