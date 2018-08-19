import java.awt.Graphics;

public class Point
{
	private double x, y;
	
	public Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void setX(double x)
	{
		this.x = x;
	}
	
	public void setY(double y)
	{
		this.y = y;
	}
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	public String toString()
	{
		return "x: " + x + " ; " + "y: " + y;
	}
	
	public double abstand(Point punkt)
	{
		double abstand = Math.sqrt(Math.pow(x-punkt.getX(),2) + Math.pow(y-punkt.getY(),2));
		
		return abstand;
	}
	

}