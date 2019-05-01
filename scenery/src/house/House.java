package house;

import java.awt.Graphics;
import java.util.ArrayList;

import others.Paintable;

public class House implements Paintable
{
	ArrayList<Paintable>components;
	public House()
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
