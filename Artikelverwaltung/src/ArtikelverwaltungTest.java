import java.util.LinkedList;

public class ArtikelverwaltungTest
{
	public static void main(String[] args)
	{
		Artikel[] artikelArray =
		{ 
				new Jeans(38, Kleidungsstück.Farbe.BLAU, "Levis", 440),
				new Jeans(34, Kleidungsstück.Farbe.GRÜN, "Wrangler", 400),
				new Jeans(42, Kleidungsstück.Farbe.ROT, "Dickies", 420),
				new Jeans(40, Kleidungsstück.Farbe.SCHWARZ, "Boss", 450),
				new Jeans(41, Kleidungsstück.Farbe.GRAU, "Esprit", 430), 
		};
		
		Artikelverwaltung av1 = new Artikelverwaltung(artikelArray);
		Artikelverwaltung av2 = new Artikelverwaltung(artikelArray);
		
		av1.write("Artikel.txt");
		av2.read("Artikel.txt");
		
		System.out.println(av2);
		
	}

}
