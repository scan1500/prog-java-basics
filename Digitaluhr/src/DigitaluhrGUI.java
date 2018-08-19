import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import javax.swing.JFrame;

public class DigitaluhrGUI
{
	public static void main(String[] args)
	{
		JFrame myframe = new JFrame("Digitaluhr");
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = myframe.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.black);

		Digitaluhr digi = new Digitaluhr();

		c.add(digi);

		myframe.setResizable(false);
		myframe.setSize(900, 200);
		myframe.setLocation(300, 200);
		myframe.setVisible(true);

		Timer t = new Timer(1000, new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				myframe.repaint();
			}
		});
		t.start();

	}
}
