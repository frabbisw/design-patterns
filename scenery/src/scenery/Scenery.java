package scenery;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import continent.*;
import house.*;
import others.*;
import river.*;
import tree.*;

public class Scenery extends JFrame
{
	ArrayList<Paintable>components;
	int zero=50;
	int height=600,width=1100;
	public Scenery(ArrayList<ContinentBuilder>builders, String title)
	{
		components=new ArrayList<>();
		int conHeight=height/builders.size();
		int padding=10;
		
		for(int i=0; i<builders.size(); i++)
		{
			ContinentBuilder builder = builders.get(i);
			components.add(builder.getContinent(zero, zero+conHeight*i, width, conHeight-padding));
		}
		
		this.setSize(width+zero*2, height+zero*2);
		this.setVisible(true);
		this.setTitle(title);
	}
	
	public void paint(Graphics g)
	{
		g.fillRect(zero, zero, width, height);
		for(Paintable c : components)
			if(c!=null)	c.draw(g);
	}
}
