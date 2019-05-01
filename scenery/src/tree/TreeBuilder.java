package tree;

import java.awt.Color;

import shape.Circle;
import shape.Cross;
import shape.Rectangle;

public class TreeBuilder 
{
	public static Tree getAsianTree(int x0, int y0, int width, int height)
	{
		int logRadius=width/10;
		int topRadius=Math.min(width, height/2)/2;
		
		Tree asianTree = new Tree();
		
		Circle circle = new Circle(x0, y0, width, topRadius*2);
		Rectangle rectangle = new Rectangle(x0+width/2-logRadius, y0+topRadius*2, logRadius*2, height-topRadius*2);
		
		circle.setColor(new Color(0x22, 0x8b, 0x22));
		rectangle.setColor(new Color(0x33, 0x2a, 0x22));
		
		asianTree.addComponent(circle);
		asianTree.addComponent(rectangle);
				
		return asianTree;
	}
	
	public static Tree getAmericanTree(int x0, int y0, int width, int height)
	{
		int logRadius=width/10;
		int cirRW=width/4;
		int cirRH=Math.min(width, height/2)/4;
		
		int topRadius=Math.min(width, height/2)/2;
		
		Tree americanTree = new Tree();
		
		Circle circle1 = new Circle(x0+width/2-cirRW, y0, cirRW*2, cirRH*2);
		Circle circle2 = new Circle(x0, y0+cirRH*2, cirRW*2, cirRH*2);
		Circle circle3 = new Circle(x0+width/2, y0+cirRH*2, cirRW*2, cirRH*2);
		
		circle1.setColor(new Color(0x22, 0xdb, 0x22));
		circle2.setColor(new Color(0x22, 0x8b, 0x22));
		circle3.setColor(new Color(0x22, 0x8b, 0x22));
		
		americanTree.addComponent(circle1);
		americanTree.addComponent(circle2);
		americanTree.addComponent(circle3);
		
		Rectangle rectangle = new Rectangle(x0+width/2-logRadius, y0+topRadius*2, logRadius*2, height-topRadius*2);
		rectangle.setColor(new Color(0x33, 0x2a, 0x22));
		americanTree.addComponent(rectangle);
				
		return americanTree;
	}
	public static Tree getAfricanTree(int x0, int y0, int width, int height)
	{
		int logRadius=width/10;
		
		int topRadius=Math.min(width, height/2)/2;
		
		Tree africanTree = new Tree();
		
		Cross cross = new Cross(x0, y0, width, height/2);	
		cross.setColor(new Color(0x22, 0x8b, 0x22));
		
		Rectangle rectangle = new Rectangle(x0+width/2-logRadius, y0+topRadius, logRadius*2, height-topRadius);
		rectangle.setColor(new Color(0x33, 0x2a, 0x22));
		
		africanTree.addComponent(rectangle);
		africanTree.addComponent(cross);
				
		return africanTree;
	}
}