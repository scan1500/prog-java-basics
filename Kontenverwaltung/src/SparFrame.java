import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SparFrame extends JFrame implements Observer
{
	JTextField tf = new JTextField("test");

	public SparFrame()
	{
	
		JFrame frame = new JFrame("Sparkonto 1.0");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = frame.getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.CENTER));
			
		c.add(tf);
		
		JButton jb = new JButton("KS update");
		c.add(jb);

		ActionListener al = (ae) -> 
		{
			if(ae.getSource() == jb)
			{
				
			}
		};
		jb.addActionListener(al);
		
		frame.setSize(300, 100);
		frame.setLocation(500,300);
		frame.setVisible(true);
	}
	public void update(Observable sender, Object arg)
	{
		Sparkonto sk2 = (Sparkonto) sender;
		tf.setText("Kontostand = " + sk2.getKontoStand());
	}
}