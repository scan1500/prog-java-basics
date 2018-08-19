import java.awt.Color;
import java.awt.Graphics;
import java.applet.Applet;

public class Zeichnung extends Applet
{
	public static void main(String[] args)
	{
		
	}
	
	public void paint(Graphics g)
	{		
		Triangle t1 = new Triangle(new Point(400, 100), new Point(100, 500), new Point(500, 500));
		
		g.drawLine((int) t1.getPointA().getX(),(int) t1.getPointA().getY(),(int) t1.getPointB().getX(),(int) t1.getPointB().getY());
		g.drawLine((int) t1.getPointB().getX(),(int) t1.getPointB().getY(),(int) t1.getPointC().getX(),(int) t1.getPointC().getY());
		g.drawLine((int) t1.getPointC().getX(),(int) t1.getPointC().getY(),(int) t1.getPointA().getX(),(int) t1.getPointA().getY());
		
		//g.drawOval(400, 250, 10, 10);
		
		
		Triangle t2 = t1.moved(100, 80);
		g.drawLine((int) t2.getPointA().getX(),(int) t2.getPointA().getY(),(int) t2.getPointB().getX(),(int) t2.getPointB().getY());
		g.drawLine((int) t2.getPointB().getX(),(int) t2.getPointB().getY(),(int) t2.getPointC().getX(),(int) t2.getPointC().getY());
		g.drawLine((int) t2.getPointC().getX(),(int) t2.getPointC().getY(),(int) t2.getPointA().getX(),(int) t2.getPointA().getY());
		
		g.drawLine((int) t1.getPointA().getX(),(int) t1.getPointA().getY(),(int) t2.getPointA().getX(),(int)t2.getPointA().getY());
		g.drawLine((int) t1.getPointB().getX(),(int) t1.getPointB().getY(),(int) t2.getPointB().getX(),(int)t2.getPointB().getY());
		g.drawLine((int) t1.getPointC().getX(),(int) t1.getPointC().getY(),(int) t2.getPointC().getX(),(int)t2.getPointC().getY());
		
		
	}
}
