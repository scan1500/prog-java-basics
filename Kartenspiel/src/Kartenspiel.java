import java.util.Arrays;

public class Kartenspiel
{
	Karte[] karten;
	Karte[] kartenattach;

	public Kartenspiel(int n)
	{
		karten = new Karte[n];

		Karte.Farbe[] farben = Karte.Farbe.values();
		Karte.Wert[] werte = Karte.Wert.values();

		for (int i = 0; i < n; i++)
		{
			karten[i] = new Karte(farben[(int) (Math.random() * farben.length)],
					werte[(int) (Math.random() * werte.length)]);
		}
	}

	public String toString()
	{
		String ausgabe = "";

		for (Karte k : karten)
			ausgabe = ausgabe + "" + k.toString() + "\n";

		return ausgabe;
	}

	public void mischen()
	{
		System.out.println("ungemischt");
		for (Karte k : karten)
			System.out.println(k.toString());

		// Mischalogithmus

		Karte karteauslagern;
		for (int i = 0; i < 100; i++)
		{
			int iZufallszahl1 = (int) (Math.random() * karten.length);
			int iZufallszahl2 = (int) (Math.random() * karten.length); 

			karteauslagern = karten[iZufallszahl1]; 
			karten[iZufallszahl1] = karten[iZufallszahl2];
			karten[iZufallszahl2] = karteauslagern; 
		}

		System.out.println("gemischt");

		for (Karte k : karten)
			System.out.println(k.toString());

	}

	public void sort()
	{

		//Sortieralogrithmus ohne Arrays.sort

		/*
		Karte karteauslagern;

		for (int j = (karten.length) - 1; j > 0; j--)
		{
			for (int i = 0; i < j; i++)
			{
				if (karten[i].f.ordinal() > karten[i + 1].f.ordinal())
				{
					karteauslagern = karten[i + 1];
					karten[i + 1] = karten[i];
					karten[i] = karteauslagern;
				}
			}
		}
		
		System.out.println("Sortiert nach Farbe");

		for (Karte k : karten)
			System.out.println(k.toString());
		*/
		
		//Sortieren mit Arrays.sort
		
		
		System.out.println("Sortiert");
		
		Arrays.sort(karten);
		
		for (Karte k : karten)
			System.out.println(k.toString());
		
	}
	
	//Kartenspiel hinzufügen
	
	public void kartenspielHinzufuegen(Kartenspiel neu)
	{
		kartenattach = new Karte[karten.length+neu.karten.length];
		
		System.arraycopy(karten, 0, kartenattach, 0, 5);
		System.arraycopy(neu.karten, 0, kartenattach, karten.length, 5);
		
		
		for (Karte k : kartenattach)
			System.out.println(k.toString());
		
	}
}
