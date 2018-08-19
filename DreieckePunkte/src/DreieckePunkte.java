
public class DreieckePunkte
{
	public static void main(String[] args)
	{
		
		// Point punkt = new Point(6,3);

		// System.out.println(punkt.toString());
		/*
		 * Triangle dreieck = new Triangle(new Point(1,1),new Point(2,3),new
		 * Point(4,1)); System.out.println(dreieck.perimeter());
		 * System.out.println(dreieck.area());
		 * 
		 * System.out.println(dreieck.lowerLeft());
		 * System.out.println(dreieck.upperRight());
		 * 
		 * System.out.println(dreieck.getPointA().getX());
		 * System.out.println(dreieck.getPointA().getY());
		 */
		/*
		 * Triangle dreieckMoved = dreieck.moved(2, 2);
		 * System.out.println(dreieckMoved.perimeter());
		 * System.out.println(dreieckMoved.area());
		 * 
		 * System.out.println(dreieckMoved.lowerLeft());
		 * System.out.println(dreieckMoved.upperRight());
		 */

		// Zoom mit p als Zentrum Test
		/*
		 * Triangle dreieckZoomed = dreieck.zoomed(new Point(1,1),-1);
		 * System.out.println(dreieckZoomed.perimeter());
		 * System.out.println(dreieckZoomed.area());
		 * 
		 * System.out.println(dreieckZoomed.lowerLeft());
		 * System.out.println(dreieckZoomed.upperRight());
		 * 
		 * System.out.println(dreieckZoomed.getPointA().getX());
		 * System.out.println(dreieckZoomed.getPointA().getY());
		 * 
		 * System.out.println(dreieckZoomed.getPointB().getX());
		 * System.out.println(dreieckZoomed.getPointB().getY());
		 * 
		 * System.out.println(dreieckZoomed.getPointC().getX());
		 * System.out.println(dreieckZoomed.getPointC().getY()); //
		 */

		Triangle t1 = new Triangle(new Point(-1, 0), new Point(0, 2), new Point(1, 0));

		//Triangle t1 = new Triangle(new Point(1, 1), new Point(4, 1), new Point(2, 4));
		
		
		System.out.println(t1.perimeter()); // 6.47…
		System.out.println(t1.area()); // 2.0

		System.out.println("A");
		System.out.println(t1.getPointA().getX());
		System.out.println(t1.getPointA().getY());
		System.out.println("B");
		System.out.println(t1.getPointB().getX());
		System.out.println(t1.getPointB().getY());
		System.out.println("C");
		System.out.println(t1.getPointC().getX());
		System.out.println(t1.getPointC().getY());
		
		
		Triangle t2 = t1;
		Triangle t3 = t1;
		
		t2 = t2.zoomed(new Point(1,1),2);
		t3 = t3.zoomed2(new Point(1,1), 2);
		
		/*
		t2 = t2.zoomed(new Point(0, 1), -1);
		t2 = t2.moved(0, -1); // Ausgabe des umschliessenden Recktecks
		*/
		
		System.out.println(t2.lowerLeft()); // -1 -1
		System.out.println(t2.upperRight()); // 1 1



		System.out.println("A");
		System.out.println(t2.getPointA().getX());
		System.out.println(t2.getPointA().getY());
		System.out.println("B");
		System.out.println(t2.getPointB().getX());
		System.out.println(t2.getPointB().getY());
		System.out.println("C");
		System.out.println(t2.getPointC().getX());
		System.out.println(t2.getPointC().getY());

		System.out.println("NEU");
		
		System.out.println(t3.lowerLeft()); // -1 -1
		System.out.println(t3.upperRight()); // 1 1



		System.out.println("A");
		System.out.println(t3.getPointA().getX());
		System.out.println(t3.getPointA().getY());
		System.out.println("B");
		System.out.println(t3.getPointB().getX());
		System.out.println(t3.getPointB().getY());
		System.out.println("C");
		System.out.println(t3.getPointC().getX());
		System.out.println(t3.getPointC().getY());
		
	}
}
