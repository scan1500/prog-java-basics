
public class Prim
{
	static void isPrime(int n)
	{
		for (int i = 2; i <= n; i++) //Zahlen von i bis n
		{
			boolean primvalue = true;
			for (int teiler = 2; teiler <=i/2; teiler++) //Teiler von 2 bis i/2
			{
				if (i % teiler == 0) //wenn teilbar dann keine primzahl
				{
					primvalue = false; //keine Ausgabe nach Schleife#
					break;
				}
			}
			if (primvalue == true) //wenn nicht teilbar bis i/2 dann immernoch primzahl
				System.out.println(i); //Ausgabe der primzahl
		}
	}
}
