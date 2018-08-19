import java.util.Scanner;

public class Flieﬂkommaarithmetik 
{
	
	public static void main(String[] Args)
	{
		double x=0, y=0, z=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte Zahl1 eingeben: ");
		x = sc.nextDouble();
		
		System.out.println("Bitte Zahl1 eingeben: ");
		y = sc.nextDouble();
		
		z = (Math.pow(x, 2)*Math.pow(y, 2)) - (4*x*y) + 4;
		
		System.out.println("Ergebnis 1: " + z);
		
		z = (Math.pow(1+x*y,2))/(1+(Math.pow(1+x*y,4)));
		
		System.out.println("Ergebnis 2: " + z);
		
		z = (x * y) + ((3 - x) * y) - y;
		
		System.out.println("Ergebnis 3: " + z);
		
		z = 2 * y;
		
		System.out.println("Ergebnis 4: " + z);
		
	}

	
	
}
