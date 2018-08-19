import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Schachbrett extends JPanel
{
	Font font = new Font("Courier New",Font.BOLD,50);
	public Schachbrett()
	{
		super.setBackground(Color.white);
		setBounds(0, 0, 800, 800);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(Color.black);

		for (int y = 0; y < 800; y += 200)
		{
			for (int x=100; x < 800; x += 200)
			{
				g.fillRect(x, y, 100, 100);
			}
			for (int x=0; x < 800; x += 200)
			{
				g.fillRect(x, y+100, 100, 100);
			}
		}
		
		for (int y = 0; y < 800; y += 100)
		{
			for (int x=0; x < 800; x += 100)
			{
				g.setFont(font);
				g.setColor(Color.red);
				g.drawString(Integer.toString(((x/100)+1)+((y/100)*8)), x+20, y+60);
			}
		}

	}
}
