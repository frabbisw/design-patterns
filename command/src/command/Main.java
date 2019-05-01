package command;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main
{
	public static void main(String [] args)
	{
		JFrame frame = new JFrame("Moving Ball");
		frame.setBounds(200, 50, 1000, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		JPanel controlPanel = new JPanel();
		controlPanel.setBackground(new Color(100, 200, 255));
		controlPanel.setLayout(null);
		
		JButton undo = new JButton("Undo");
		undo.setBounds(25, 100, 100, 25);
		JButton redo = new JButton("Redo");
		redo.setBounds(175, 100, 100, 25);
		controlPanel.add(undo);
		controlPanel.add(redo);
		
		JButton up = new JButton("Up");
		up.setBounds(100, 300, 100, 25);
		JButton down = new JButton("Down");
		down.setBounds(100, 400, 100, 25);
		JButton left = new JButton("Left");
		left.setBounds(25, 350, 100, 25);
		JButton right = new JButton("Right");
		right.setBounds(175, 350, 100, 25);
		
		controlPanel.add(up);
		controlPanel.add(down);
		controlPanel.add(right);
		controlPanel.add(left);
		
		MyPanel ballPanel = new MyPanel(300, 0, 600, 700);
		frame.add(controlPanel);
		controlPanel.setBounds(0, 0, 300, 600);
		frame.add(ballPanel);
		ballPanel.setBounds(300, 0, 600, 700);
		
		up.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ballPanel.addMove(new MoveUp());
			}
		});
		down.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ballPanel.addMove(new MoveDown());
			}
		});
		left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ballPanel.addMove(new MoveLeft());
			}
		});
		right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ballPanel.addMove(new MoveRight());
			}
		});
		undo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ballPanel.undo();
			}
		});
		redo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ballPanel.redo();
			}
		});
	}
}