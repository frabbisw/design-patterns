package shape;

import java.awt.Graphics;

public class Circle extends Shape{

	public Circle(int x0, int y0, int width, int height) 
	{
		super(x0, y0, width, height);
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
		g.setColor(color);
		g.fillOval(x0, y0, width, height);
	}
}
