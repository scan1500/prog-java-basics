import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Actions extends JFrame
{
	public Actions()
	{
	
	JFrame frame = new JFrame("Testumgebung");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JButton button1 = new JButton("Klick mich!");
	button1.setPreferredSize(new Dimension(300,100));
	JButton button2 = new JButton("Klick mich!");
	button2.setPreferredSize(new Dimension(300,100));
	//ActionListener al = new ActionListener(ActionEvent ae)
	
	Container c = frame.getContentPane();
	c.setLayout(new FlowLayout(FlowLayout.LEFT));
	
		
	//Variante 1
	ActionListener al = (ae) -> 
	{
		if(ae.getSource() == button1)
		{
			System.out.println("Button1 wurde geklickt!");
		}
		
	};
	
	//Variante 2
	class MyActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource() == button2)
			{
				System.out.println("Button2 wurde geklickt!");
			}
			
		}
	}
	

	
	c.add(button1);
	c.add(button2);
	
	button1.addActionListener(al);
	
	MyActionListener mal = new MyActionListener();
	button2.addActionListener(mal);
	
	frame.setSize(700, 300);
	frame.setLocation(300,200);
	frame.setVisible(true);
	
	}
}

