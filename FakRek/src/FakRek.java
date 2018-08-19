import java.util.Scanner;

public class FakRek 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Bitte n eingeben: ");
		long n = sc.nextLong();
		
		long lLaufzeitStart = System.currentTimeMillis();
		System.out.print(n+"! = "+fak(n));
		long lLaufzeitEnde = System.currentTimeMillis();
		
		System.out.print(", Laufzeit: " + (lLaufzeitEnde-lLaufzeitStart)+"ms");
		
	}
	
	static long fak(long n)
	{
		if(n>1)
		{
			return (n*fak(n-1));
			// Bsp: return(5*(fak(5-1)))
			//		return(5*(4*(fak(4-1))))
			//		return(5*(4*(3*(fak(3-1)))))
			//		return(5*(4*(3*(2*(fak(2-1))))))
			//		return(5*(4*(3*(2*(1)))))
		}
		else
		{
			return 1;
			// Abbruch der Rekursivität wenn n=1,
			// Funktion liefert den Wert 1 zurück
			// ohne Funktion erneut aufzurufen.
			// -> return(5*(4*(3*(2*(1)))))
		}
	}
	
}
