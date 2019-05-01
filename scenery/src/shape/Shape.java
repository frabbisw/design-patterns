package shape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import others.Paintable;

public abstract class Shape implements Paintable
{
	int x0,y0,width,height;
	Color color;
	public Shape(int x0, int y0, int width, int height)
	{
		this.x0=x0;
		this.y0=y0;
		this.width=width;
		this.height=height;
	}
	public void setColor(Color color)
	{
		this.color=color;
	}
}
