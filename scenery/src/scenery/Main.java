package scenery;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import continent.AfricaBuilder;
import continent.AmericaBuilder;
import continent.AsiaBuilder;
import continent.ContinentBuilder;

public class Main 
{
	public static void main(String [] args)
	{
		JFrame frame = new JFrame("Continent Chooser");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(500, 200, 400, 300);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel label = new JLabel("Choose one or more items to view");
		label.setBounds(50, 50, 300, 25);
		panel.add(label);
		
		JCheckBox asia = new JCheckBox("Asia");
		panel.add(asia);
		asia.setBounds(50, 75, 100, 25);
		
		JCheckBox africa = new JCheckBox("Africa");
		panel.add(africa);
		africa.setBounds(50, 100, 100, 25);
		
		JCheckBox america = new JCheckBox("America");
		america.setBounds(50, 125, 100, 25);
		panel.add(america);
		
		JButton button = new JButton("ok");
		button.setBounds(50, 175, 100, 25);
		panel.add(button);
		
		frame.add(panel);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ArrayList<ContinentBuilder> builders = new ArrayList<>();
				String title="";
				if(asia.isSelected())	
				{
					builders.add(new AsiaBuilder());
					title+=" Asia ";
				}
				if(africa.isSelected())	
				{
					builders.add(new AfricaBuilder());
					title+=" Africa ";
				}
				if(america.isSelected())	
				{
					builders.add(new AmericaBuilder());
					title+=" America ";
				}
				
				if(builders.isEmpty())	
				{
					JOptionPane.showMessageDialog(panel, "You must select minimum one item");
					return;
				}
				new Scenery(builders,title);
			}
		});
	}
}
