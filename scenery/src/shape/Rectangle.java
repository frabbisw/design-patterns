package shape;

import java.awt.Graphics;

public class Rectangle extends Shape{

	public Rectangle(int x0, int y0, int width, int height)
	{
		super(x0, y0, width, height);
	}
	
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(color);
		g.fillRect(x0, y0, width, height);
	}
}
