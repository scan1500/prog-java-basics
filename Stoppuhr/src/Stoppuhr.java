import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class Stoppuhr extends JPanel
{
	float timeCount = 0;
	
	public void resetTime()
	{
		timeCount = 0;
	}
	
	public void incTime()
	{
		timeCount += 0.01;
	}
	
	public Stoppuhr()
	{
		this.setOpaque(false);
		setPreferredSize(new Dimension(460,100));
		TitledBorder tb = new TitledBorder("Display");
		tb.setTitleColor(Color.white);
		setBorder(tb);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(Color.white);
		g.setFont(new Font("Courrier New", Font.BOLD, 45));
		g.drawString("Seconds: " + Float.toString((float)(((int)((timeCount)*100)))/100), 90, 70);
	}
	
	Timer t = new Timer(10, new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			incTime();
			repaint();
		}
	});
}
