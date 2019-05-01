package command;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class MyPanel extends JPanel{
	Ball b;
	Ball past;
	ArrayList<Move>moves;
	ArrayList<Move>undoes;
	Color color=new Color(200, 200, 100);
	int height,width;
	
	public MyPanel(int x, int y, int height,int width)
	{
		this.height=height;
		this.width=width;
		b=new Ball(100, 100, width, height);
		moves = new ArrayList<>();
		undoes = new ArrayList<>();
		
		setBounds(x, y, width, height);
	}
	
	public void paintComponent(Graphics g)
	{
		g.setColor(color);
		if(past!=null)	
		{
			g.fillOval(past.coX, past.coY, b.width, b.height);
			past=null;
		}
		g.setColor(b.color);
		if(b!=null) g.fillOval(b.coX, b.coY, b.width, b.height);
	}
	
	public void addMove(Move move)
	{
		past=new Ball(b.coX, b.coY, width, height);
		if(move.execute(b))
			moves.add(move);
		repaint();
	}
	
	public void undo()
	{
		if(moves.isEmpty())	return;
		past=new Ball(b.coX, b.coY, width, height);
		
		Move move = moves.remove(moves.size()-1);	
		move.abandon(b);

		undoes.add(move);
		
		repaint();
	}
	
	public void redo()
	{
		if(undoes.isEmpty())	return;
		past=new Ball(b.coX, b.coY, width, height);
		Move move = undoes.remove(undoes.size()-1);
		move.execute(b);
		repaint();
	}
}