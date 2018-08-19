
public class Triangle
{
	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Triangle(Point pointA, Point pointB, Point pointC)
	{
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}

	// Getter Methode für jeden Punkt

	public Point getPointA()
	{
		return pointA;
	}

	public Point getPointB()
	{
		return pointB;
	}

	public Point getPointC()
	{
		return pointC;
	}

	// Umfang Dreieck
	public double perimeter()
	{
		// double streckeAB = Math.sqrt(Math.pow(punktA.x()-punktB.x(),2) +
		// Math.pow(punktA.y-punktB.y,2));
		// double streckeBC = Math.sqrt(Math.pow(punktB.x()-punktC.x(),2) +
		// Math.pow(punktB.y-punktC.y,2));
		// double streckeCA = Math.sqrt(Math.pow(punktC.x()-punktA.x(),2) +
		// Math.pow(punktC.y-punktA.y,2));

		double streckeAB = pointA.abstand(pointB);
		double streckeBC = pointB.abstand(pointC);
		double streckeCA = pointC.abstand(pointA);

		double umfang = streckeAB + streckeBC + streckeCA;

		return umfang;
	}

	// Fläche Dreieck
	public double area()
	{

		double flaeche = 0.5 * Math.abs(((pointB.getX() - pointA.getX()) * (pointC.getY() - pointA.getY()))
				- ((pointC.getX() - pointA.getX()) * (pointB.getY() - pointA.getY())));
		// https://de.wikipedia.org/wiki/Dreiecksfl%C3%A4che

		return flaeche;
	}

	public Point lowerLeft()
	{
		double leftX = Math.min(Math.min(pointA.getX(), pointB.getX()), pointC.getX());
		double lowerY = Math.min(Math.min(pointA.getY(), pointB.getY()), pointC.getY());

		Point lowerleft = new Point(leftX, lowerY);

		return lowerleft;
	}

	public Point upperRight()
	{
		double rightX = Math.max(Math.max(pointA.getX(), pointB.getX()), pointC.getX());
		double upperY = Math.max(Math.max(pointA.getY(), pointB.getY()), pointC.getY());

		Point upperright = new Point(rightX, upperY);

		return upperright;
	}

	public Triangle moved(double dx, double dy)
	{
		Point pointAmoved = new Point(pointA.getX() + dx, pointA.getY() + dy);
		Point pointBmoved = new Point(pointB.getX() + dx, pointB.getY() + dy);
		Point pointCmoved = new Point(pointC.getX() + dx, pointC.getY() + dy);

		Triangle triangleMoved = new Triangle(pointAmoved, pointBmoved, pointCmoved);

		return triangleMoved;
	}

	public Triangle zoomed(double f)
	{
		Point pointAzoomed = new Point(pointA.getX() * f, pointA.getY() * f);
		Point pointBzoomed = new Point(pointB.getX() * f, pointB.getY() * f);
		Point pointCzoomed = new Point(pointC.getX() * f, pointC.getY() * f);

		Triangle triangleZoomed = new Triangle(pointAzoomed, pointBzoomed, pointCzoomed);

		return triangleZoomed;
	}

	public Triangle zoomed(Point p, double f)
	{
		// Neue Zoompunkte werden angelegt
		Point pointAzoomed;
		Point pointBzoomed;
		Point pointCzoomed;

		// Für jeden Punkt wird geprüft ob das Zentrum P unter dem Y von A, B, C
		// liegt, falls ja muss
		// "nach oben gezoomed werden", sprich Addition der gezoomten y Werte
		// falls das Zentrum P aber über dem Y von A, B, C liegt wird nach unten
		// gezoomed.
		// falls das Zentrum P und A, B, C auf einer Höhe liegen so wird Delta y
		// von p und Punkt 0 sein
		// also wird sich sowieso nichts nach oben oder unten verschieben (hier:
		// +0)

		// So ähnlich auch mit den X-Koordinaten von p und den Punkten A B C!
		// wenn x von P kleiner ist als die x koordinate von A B oder C somit
		// liegt p links von A B oder C
		// somit wird nach rechts gezoomed, bei gleichheit wird delta x von p
		// und dem jeweil. Punkt eh 0.
		// wenn x von P größer als die x koordinate von A B oder C somit liegt p
		// rechts von A B oder C
		// es wird also nach links gezoomed

		if (p.getY() <= pointA.getY())
		{
			if (p.getX() <= pointA.getX())
			{
				pointAzoomed = new Point(p.getX() + (Math.abs(p.getX() - pointA.getX()) * f),
						p.getY() + (Math.abs(p.getY() - pointA.getY()) * f));
			}
			else
			{
				pointAzoomed = new Point(p.getX() - (Math.abs(p.getX() - pointA.getX()) * f),
						p.getY() + (Math.abs(p.getY() - pointA.getY()) * f));
			}
		}
		else
		{
			if (p.getX() <= pointA.getX())
			{
				pointAzoomed = new Point(p.getX() + (Math.abs(p.getX() - pointA.getX()) * f),
						p.getY() - (Math.abs(p.getY() - pointA.getY()) * f));
			}
			else
			{
				pointAzoomed = new Point(p.getX() - (Math.abs(p.getX() - pointA.getX()) * f),
						p.getY() - (Math.abs(p.getY() - pointA.getY()) * f));
			}
		}

		if (p.getY() <= pointB.getY())
		{
			if (p.getX() <= pointB.getX())
			{
				pointBzoomed = new Point(p.getX() + (Math.abs(p.getX() - pointB.getX()) * f),
						p.getY() + (Math.abs(p.getY() - pointB.getY()) * f));
			}
			else
			{
				pointBzoomed = new Point(p.getX() - (Math.abs(p.getX() - pointB.getX()) * f),
						p.getY() + (Math.abs(p.getY() - pointB.getY()) * f));
			}
		}
		else
		{
			if (p.getX() <= pointB.getX())
			{
				pointBzoomed = new Point(p.getX() + (Math.abs(p.getX() - pointB.getX()) * f),
						p.getY() - (Math.abs(p.getY() - pointB.getY()) * f));
			}
			else
			{
				pointBzoomed = new Point(p.getX() - (Math.abs(p.getX() - pointB.getX()) * f),
						p.getY() - (Math.abs(p.getY() - pointB.getY()) * f));
			}
		}

		if (p.getY() <= pointC.getY())
		{
			if (p.getX() <= pointC.getX())
			{
				pointCzoomed = new Point(p.getX() + (Math.abs(p.getX() - pointC.getX()) * f),
						p.getY() + (Math.abs(p.getY() - pointC.getY()) * f));
			}
			else
			{
				pointCzoomed = new Point(p.getX() - (Math.abs(p.getX() - pointC.getX()) * f),
						p.getY() + (Math.abs(p.getY() - pointC.getY()) * f));
			}
		}
		else
		{
			if (p.getX() <= pointC.getX())
			{
				pointCzoomed = new Point(p.getX() + (Math.abs(p.getX() - pointC.getX()) * f),
						p.getY() - (Math.abs(p.getY() - pointC.getY()) * f));
			}
			else
			{
				pointCzoomed = new Point(p.getX() - (Math.abs(p.getX() - pointC.getX()) * f),
						p.getY() - (Math.abs(p.getY() - pointC.getY()) * f));
			}
		}

		Triangle triangleZoomed = new Triangle(pointAzoomed, pointBzoomed, pointCzoomed);

		return triangleZoomed;
	}

	public Triangle pointReflection(Point reflectionPoint)
	{
		Triangle trianglePointReflected = zoomed(reflectionPoint, -1);

		return trianglePointReflected;
	}

	public Triangle zoomed2(Point p, double f)
	{

		double apX = (p.getX() - pointA.getX()) * f;
		double apY = (p.getY() - pointA.getY()) * f;

		double bpX = (p.getX() - pointB.getX()) * f;
		double bpY = (p.getY() - pointB.getY()) * f;

		double cpX = (p.getX() - pointC.getX()) * f;
		double cpY = (p.getY() - pointC.getY()) * f;

		Point aM = new Point(p.getX() + apX, p.getY() + apY);
		Point bM = new Point(p.getX() + bpX, p.getY() + bpY);
		Point cM = new Point(p.getX() + cpX, p.getY() + cpY);

		Triangle zoomed = new Triangle(aM, bM, cM);

		return zoomed;
	}

}
