package river;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import others.Paintable;

public class River implements Paintable{

	Polygon polygon;
	Color c;
	
	public River() 
	{		
		polygon=new Polygon();
	}

	public void addPoint(int x, int y)
	{
		polygon.addPoint(x, y);
	}
	
	public void setColor(Color c)
	{
		this.c=c;
	}
	
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(c);
		g.fillPolygon(polygon);
	}
}