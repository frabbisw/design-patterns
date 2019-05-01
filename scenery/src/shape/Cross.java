package shape;

import java.awt.Graphics;
import java.awt.Polygon;

public class Cross extends Shape{

	Polygon polygon;
	public Cross(int x0, int y0, int width, int height) 
	{
		super(x0, y0, width, height);
		
		int ex=width/10;
		int ey=height/10;
		
		polygon = new Polygon();
		polygon.addPoint(x0+ex, y0);
		polygon.addPoint(x0+width/2, y0+height/2-ey);
		polygon.addPoint(x0+width-ex, y0);
		polygon.addPoint(x0+width, y0+ey);
		polygon.addPoint(x0+width/2+ex, y0+height/2);
		polygon.addPoint(x0+width, y0+height-ey);
		polygon.addPoint(x0+width-ex, y0+height);
		polygon.addPoint(x0+width/2, y0+height/2+ey);
		polygon.addPoint(x0+ex, y0+height);
		polygon.addPoint(x0, y0+height-ey);
		polygon.addPoint(x0+width/2-ex, y0+height/2);
		polygon.addPoint(x0, y0+ey);
	}

	@Override
	public void draw(Graphics g) 
	{
		// TODO Auto-generated method stub
		g.setColor(color);
		g.fillPolygon(polygon);
	}

}
