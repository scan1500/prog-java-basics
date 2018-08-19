public class Primzahlen 
{
	public static void main(String[] args)
	{
		int iPrimzahl=0;
		boolean bPrimzahl;
		
		for(int i=2; i<=1000; i++)
		{
			//Primzahl true solange kein Teiler gefunden wurde
			bPrimzahl = true;
			
			//j ist der potentielle Teiler
			//der Teiler kann maximal halb so groß sein wie die Zahl selbst
			//Bsp: i=700, j maximal 350, da alles > 350 duch 700 nicht mehr teilbar ist.
			//ungerade Zahlen sind sowieso nicht durch 2 teilbar also i/2 abgerundet egal
			//Bei 3 ist die hälfte 1.5 bzw 1 aber der erste teiler muss mindestens 2 sein!
			//2 ist bereits größer als die Hälfte von 3 bzw. 1!
			for(int j=2; j<=(i/2); j++)
			{
				if(i%j == 0)
				{
					//Sobald ein Teiler gefunden wurde Primzahl false (Keine Ausgabe)
					//Und Programm springt zur nächsten Zahl der Schleife (break)
					bPrimzahl = false;
					break;
				}
			}
			
			//Wenn kein Teiler gefunden wurde ist bPrimzahl stets true -> Ausgabe
			if(bPrimzahl)
			{
				//Counter
				iPrimzahl++;
				System.out.println(iPrimzahl + ": " + i);
			}
			
		}
	}
}
