package schneemanngrid;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Triangle extends JPanel
{
	public Triangle()
	{
		this.setBackground(Color.yellow);
		setBounds(220, 350, 100, 200);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.drawLine(10, 10, 50, 190);
		g.drawLine(50, 190, 90, 10);
		g.drawLine(10, 10, 90, 10);
		
	}

}
