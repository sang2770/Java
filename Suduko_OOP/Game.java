package Suduko_OOP;

import java.util.Arrays;

public class Game {
	private Node[][] gameNodes;

	public Game(Node[][] gameNodes) {
//		super();
		this.gameNodes = gameNodes;
	}
	public Game()
	{
		this.gameNodes= new Node[Contain.Game_size][Contain.Game_size];
		for(int i=0;i<Contain.Game_size;i++)
			for(int j=0;j<Contain.Game_size;j++)
			{
				Node node=new Node(i, j, 0, false);
				this.gameNodes[i][j]=node;
			}
	}
	public Game(int[][] game)
	{
		this.gameNodes= new Node[Contain.Game_size][Contain.Game_size];
		for(int i=0;i<Contain.Game_size;i++)
			for(int j=0;j<Contain.Game_size;j++)
			{
				Node node=new Node(i, j, game[i][j], game[i][j]>0 ? true: false);
				this.gameNodes[i][j]= node;
			}
	}
	public Node[][] getGameNodes() {
		return gameNodes;
	}
	public void setGameNodes(Node[][] gameNodes) {
		this.gameNodes = gameNodes;
	}
	public void setNode(Node node)
	{
		int r=node.getRow();
		int c=node.getCol();
		int value=node.getValue();
		Node gameNode= this.getNode(r, c);
		gameNode.setValue(value);
	}
	public Node getNode(int r, int c)
	{
		return this.gameNodes[r][c];
	}
	@Override
	public String toString() {
		StringBuilder sdata = new StringBuilder();
		sdata.append("============== GAME ===============\n");
		for(Node[] z:this.gameNodes)
		{
			for(Node node:z)
			{
				sdata.append(node.getValue()+"|");
			}
			sdata.append("\n");
		}
		return sdata.toString();
	}
	/*
	 * Check col;
	 */
	public boolean Checkcol(Node node) {
		int c=node.getCol();
		for(int i=0;i<Contain.Game_size;i++)
		{
			if(this.getNode(i, c).getValue() == node.getValue())
			{
				return false;
			}
			
		}
		return true;
	}
	/*
	 * check row
	 */
	public boolean Checkrow(Node node) {
		int r=node.getRow();
		for(int i=0;i<Contain.Game_size;i++)
		{
			if(this.getNode(r, i).getValue() == node.getValue())
			{
				return false;
			}
			
		}
		return true;
	}
	/*
	 * check Zone
	 */
	public boolean CheckZone(Node node)
	{
		int zone=node.getZone();
		int value=node.getValue();
		for(int i=0;i<Contain.Game_size;i++)
			for(int j=0;j<Contain.Game_size;j++)
			{
				Node ingameNode= this.getNode(i, j);
				if(ingameNode.getZone()== zone)
				{
					if(ingameNode.getValue()==value)
						return false;
				}
			}
		return true;
	}
	/*
	 * Check end game
	 */
	public boolean CheckEnd()
	{
		for(Node[] z:this.gameNodes)
		{
			for(Node node:z)
			{
				if(node.getValue()==0)
					return false;
			}
		}
		return true;
		
	}
	/*
	 * Check revert
	 */
	public boolean CheckRevert(Node node)
	{
		int r=node.getRow();
		int c=node.getCol();
		Node nodeIngame=this.getNode(r, c);
		return nodeIngame.getRevert();
	}
}
