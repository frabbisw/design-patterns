package house;

import java.awt.Color;

import shape.Circle;
import shape.Rectangle;
import shape.Triangle;

public class HouseBuilder 
{
	public static House getAsianHouse(int x0, int y0, int width, int height)
	{
		int xPadding=width/10;
		int yPadding=height/10;
		
		Triangle roof = new Triangle(x0, y0, width, height/2);
		roof.setColor(Color.DARK_GRAY);
		
		Rectangle wall = new Rectangle(x0+xPadding, y0+height/2, width-xPadding*2, height/2);
		wall.setColor(new Color(0xfa, 0x80, 0x72));
		
		Rectangle door = new Rectangle(x0+width/2-xPadding, y0+height/2+yPadding*2, xPadding*2, height/2-yPadding*2);
		door.setColor(new Color(0x66, 0x33, 0x00));
		
		House house = new House();
		house.addComponent(roof);
		house.addComponent(wall);
		house.addComponent(door);
		
		return house;
	}
	public static House getAfricanHouse(int x0, int y0, int width, int height)
	{
		int cirRad = Math.min(width/6,height/3);
		int xPadding=width/10;
		int yPadding=height/10;
		
		Circle roof1 = new Circle(x0, y0, cirRad*2, cirRad*2);
		roof1.setColor(Color.DARK_GRAY);
		Circle roof2 = new Circle(x0+width/2-cirRad, y0, cirRad*2, cirRad*2);
		roof2.setColor(Color.DARK_GRAY);
		Circle roof3 = new Circle(x0+width-cirRad*2, y0, cirRad*2, cirRad*2);
		roof3.setColor(Color.DARK_GRAY);
		
		Rectangle wall = new Rectangle(x0, y0+cirRad, width, height-cirRad);
		wall.setColor(new Color(0xfa, 0x80, 0x72));
		
		Rectangle door = new Rectangle(x0+width/2-xPadding, y0+height/2+yPadding*2, xPadding*2, height/2-yPadding*2);
		door.setColor(new Color(0x55, 0x43, 0x00));
		
		House house = new House();
		house.addComponent(roof1);
		house.addComponent(roof2);
		house.addComponent(roof3);
		house.addComponent(wall);
		house.addComponent(door);
		
		return house;
	}
	public static House getAmericanHouse(int x0, int y0, int width, int height)
	{
		int xPadding=width/10;
		int yPadding=height/10;
		
		Rectangle wall = new Rectangle(x0, y0+yPadding, width, height-yPadding);
		wall.setColor(new Color(0xfa, 0x80, 0x72));
		
		Rectangle roof1 = new Rectangle(x0, y0, xPadding, yPadding);
		roof1.setColor(Color.DARK_GRAY);
		Rectangle roof2 = new Rectangle(x0+xPadding*2, y0, xPadding, yPadding);
		roof2.setColor(Color.DARK_GRAY);
		Rectangle roof3 = new Rectangle(x0+width/2-xPadding, y0, xPadding*2, yPadding);
		roof3.setColor(Color.DARK_GRAY);
		Rectangle roof4 = new Rectangle(x0+width-xPadding*3, y0, xPadding, yPadding);
		roof4.setColor(Color.DARK_GRAY);
		Rectangle roof5 = new Rectangle(x0+width-xPadding, y0, xPadding, yPadding);
		roof5.setColor(Color.DARK_GRAY);
		
		Rectangle window1 = new Rectangle(x0+xPadding, y0+yPadding*2, width/2-xPadding*2, height/2-yPadding*2);
		window1.setColor(new Color(0x66, 0x33, 0xaa));
		Rectangle window2 = new Rectangle(x0+width/2+xPadding, y0+yPadding*2, width/2-xPadding*2, height/2-yPadding*2);
		window2.setColor(new Color(0x66, 0x33, 0xaa));
		Rectangle window3 = new Rectangle(x0+xPadding, y0+height/2+yPadding, width/2-xPadding*2, height/2-yPadding*2);
		window3.setColor(new Color(0x66, 0x33, 0x00));
		Rectangle window4 = new Rectangle(x0+width/2+xPadding, y0+height/2+yPadding, width/2-xPadding*2, height/2-yPadding*2);
		window4.setColor(new Color(0x66, 0x33, 0x00));
		
		House house = new House();
		house.addComponent(roof1);
		house.addComponent(roof2);
		house.addComponent(roof3);
		house.addComponent(roof4);
		house.addComponent(roof5);		
		house.addComponent(wall);
		house.addComponent(window1);
		house.addComponent(window2);
		house.addComponent(window3);
		house.addComponent(window4);
		
		return house;
	}
}