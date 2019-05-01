package continent;

import tree.*;
import river.*;
import house.*;

public abstract class ContinentBuilder 
{
	public Continent getContinent(int x0, int y0, int width, int height)
	{
		int unitX=width/20;
		int unitY=height/20;
		int unit=Math.min(unitX, unitY);
		
		House littleHouse1 = getHouse(x0+width-unitX*10, y0+unitY*2, unit*2, unit*2);
		Tree littleTree1 = getTree(x0+width-unitX*9, y0, unit*2, unit*4);
		House littleHouse2 = getHouse(x0+width-unitX*8, y0+unitY*2, unit*2, unit*2);
		Tree littleTree2 = getTree(x0+width-unitX*7, y0, unit*2, unit*4);
		House littleHouse3 = getHouse(x0+width-unitX*6, y0+unitY*2, unit*2, unit*2);
		Tree littleTree3 = getTree(x0+width-unitX*5, y0, unit*2, unit*4);
		House littleHouse4 = getHouse(x0+width-unitX*4, y0+unitY*2, unit*2, unit*2);
		Tree littleTree4 = getTree(x0+width-unitX*3, y0, unit*2, unit*4);
		House littleHouse5 = getHouse(x0+width-unitX*2, y0+unitY*2, unit*2, unit*2);
		
		Tree bigTree1 = getTree(x0+unitX, y0+height-unitY*17, unit*8, unit*16);
		House bigHouse = getHouse(x0+unitX*6, y0+height-unitY*12, unit*10, unit*10); 
		
		River river = getRiver(x0, y0, x0+width, y0+unitY*8, x0+width, y0+height, x0, y0+unitY*14);
		
		Continent continent = new Continent();
		
		continent.addComponent(littleHouse1);
		continent.addComponent(littleTree1);
		continent.addComponent(littleHouse2);
		continent.addComponent(littleTree2);
		continent.addComponent(littleHouse3);
		continent.addComponent(littleTree3);
		continent.addComponent(littleHouse4);
		continent.addComponent(littleTree4);
		continent.addComponent(littleHouse5);
		
		continent.addComponent(river);
		
		continent.addComponent(bigTree1);
		continent.addComponent(bigHouse);
		
		return continent;
	}
	
	public abstract House getHouse(int x0, int y0, int width, int height);
	public abstract Tree getTree(int x0, int y0, int width, int height);
	public abstract River getRiver(int x0, int y0, int x1, int y1, int x2, int y2, int x3, int y3);
}