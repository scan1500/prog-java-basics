import java.util.Date;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Digitaluhr extends JPanel
{
	public Digitaluhr()
	{
		this.setOpaque(false);
		setBounds(30,30,800,100);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Date datum = new Date();
		
		g.setFont(new Font("Chiller",Font.BOLD, 60 ));
		g.setColor(Color.red);
		g.drawString(datum.toString(), 75, 65);
	}
}
