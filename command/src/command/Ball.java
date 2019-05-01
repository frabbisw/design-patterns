package command;

import java.awt.Color;

public class Ball {
	public int coX;
	public int coY;
	public int dx=25;
	public int dy=25;
	public int width=20;
	public int height=20;
	public Color color = new Color(255, 0, 0);
	int panelHeight,panelWidth;
	
	public Ball(int coX, int coY, int panelWidth, int panelHeight)
	{
		this.coX=coX;
		this.coY=coY;
		this.panelHeight=panelHeight;
		this.panelWidth=panelWidth;
	}	
	public boolean moveLeft()
	{
		if(coX>dx)	
		{
			coX-=dx;
			return true;
		}
		return false;
	}
	public boolean moveRight()
	{
		if(panelWidth-coX>dx)
		{
			coX+=dx;
			return true;
		}
		return false;
	}
	public boolean moveUp()
	{
		if(coY>dy)
		{
			coY-=dy;
			return true;
		}
		return false;
	}
	public boolean moveDown()
	{
		if(panelHeight-coY>dy)
		{
			coY+=dy;
			return true;
		}
		return false;
	}
}
