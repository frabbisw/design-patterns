package continent;

import java.awt.Graphics;
import java.util.ArrayList;

import others.Paintable;

public class Continent implements Paintable
{
	ArrayList<Paintable>components;
	
	public Continent() 
	{
		components = new ArrayList<>();
	}
	
	public void addComponent(Paintable p)
	{
		components.add(p);
	}
	
	@Override
	public void draw(Graphics g) 
	{
		for(Paintable c : components)
			c.draw(g);
	}
}