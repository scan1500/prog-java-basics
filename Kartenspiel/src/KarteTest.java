
public class KarteTest
{
	public static void main(String[] args)
	{
		Karte k1 = new Karte(Karte.Farbe.Herz, Karte.Wert.Ass);
		
		//System.out.println(k1);
		
		
		Kartenspiel spiel = new Kartenspiel(5);
		
		//System.out.println(spiel.toString());
		
		spiel.mischen();
		
		System.out.println(k1.f.ordinal());
		
		spiel.sort();
		
		System.out.println("Neue Karten hinzugfügen:");
		
		Kartenspiel spiel2 = new Kartenspiel(5);
		spiel.kartenspielHinzufuegen(spiel2);
		
	}
}
