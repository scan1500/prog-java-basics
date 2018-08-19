import java.util.Arrays;

public class Quadrat
{
	// Quadrat mit verschiedenen Werten
	int[][] quad;

	// Klassenmethode zum Erzeugen von magischen Quadraten für ungerade n
	// falls n gerade liefern Sie null zurück
	public static Quadrat erzeugeMagicQuadrat(int n)
	{
		// Wenn n = gerade
		if ((n % 2) == 0)
			return null;
		// Wenn n = ungerade
		else
		{
			// Objekt: Magisches Quadrat erstellen
			Quadrat magQuad = new Quadrat(n);
			// Variablen init.
			int zeile = n / 2, spalte = (n / 2) + 1;

			for (int m = 1; m <= Math.pow(n, 2); m++)
			{
				magQuad.quad[zeile][spalte] = m;

				if (zeile == 0)
					zeile = n - 1;
				else
					zeile--;

				if (spalte == (n - 1))
					spalte = 0;
				else
					spalte++;

				if (magQuad.quad[zeile][spalte] != 0)
				{
					if (zeile == (n - 1))
						zeile = 0;
					else
						zeile++;

					if (spalte == (n - 1))
						spalte = 0;
					else
						spalte++;
				}
			}
			return magQuad;
		}
	}

	// Konstruktor erzeugt eine quadratische Matrix, die alle Elemente mit 0
	// initialisiert
	public Quadrat(int n)
	{
		quad = new int[n][n];
		// EINLESEN NULLEN
		for (int zeile = 0; zeile < n; zeile++)
			for (int spalte = 0; spalte < n; spalte++)
				quad[zeile][spalte] = 0;
	}

	// Konstruktor erzeugt eine quadratische Matrix und initiliasiert die Matrix
	// mit den Werten von q
	public Quadrat(int[][] q)
	{
		quad = q;
	}

	// Liefert die arithmetische Summe für eine Zeile zurück; zeilennr gibt die
	// Zeile an
	public int zeilenSumme(int zeilennr)
	{
		int summe = 0;
		for (int spalte = 0; spalte < quad.length; spalte++)
			summe += quad[zeilennr][spalte];
		return summe;
	}

	// Liefert die arithmetische Summe für eine Spalte zurück; spaltennr gibt
	// die Spalte an
	public int spaltenSumme(int spaltennr)
	{
		int summe = 0;
		for (int[] zeile : quad)
			summe += zeile[spaltennr];
		return summe;
	}

	// Liefert die arithmetische Summe der Diagonalen von LinksOben nach
	// RechtsUnten zurück
	public int diagonalSummeOToU()
	{
		int summe = 0;
		for (int i = 0; i < quad.length; i++)
			summe += quad[i][i];
		return summe;
	}

	// Liefert die arithmetische Summe der Diagonalen von LinksUnten nach
	// RechtsOben zurück
	public int diagonalSummeUToO()
	{
		int summe = 0, spalte = 0;
		for (int zeile = quad.length - 1; zeile >= 0; zeile--)
			summe += quad[zeile][spalte++];
		return summe;
	}

	// gibt true zurück, falls das Qudrat ein magisches Quadrat; ansonsten false
	public boolean isMagic()
	{
		int cnt=0;
		boolean[] pruefung = new boolean[(int) Math.pow(quad.length, 2)];
		
		for (int zeile = 0; zeile < quad.length; zeile++)
		{
			for (int spalte = 0; spalte < quad.length; spalte++)
			{
				if(quad[zeile][spalte] <= Math.pow(quad.length, 2))
				pruefung[(quad[zeile][spalte])-1] = true;
				else
					pruefung[quad[zeile][spalte]] = true;
			}
		}
		
		System.out.println(Arrays.toString(pruefung));
		
		for(boolean b : pruefung)
		{
			if(b==false)
				return false;
		}
		
	
		
		//Prüfen ob alle Zahlen von 1 - n² in quad vorhanden sind.
		
		
		// Jede Zeilensumme mit jeder Spaltensumme überprüfen
		for (int zeile = 0; zeile < quad.length; zeile++)
		{
			for (int spalte = 0; spalte < quad.length; spalte++)
			{
				if (zeilenSumme(zeile) != spaltenSumme(spalte))
				{
					return false;
				}
			}
		}
		
		//1.Diagonale mit 1.Zeilensumme überprüfen
		if(diagonalSummeOToU() != zeilenSumme(0))
			return false;
		
		//1.Diagonale mit 2.Diagonale überprüfen
		if(diagonalSummeOToU() != diagonalSummeUToO())
			return false;
		
		
		
		
		return true;
	}

	// gibt alle aktuellen Werte des Quadrats mit System.out.println aus
	public void print()
	{

	}

}
