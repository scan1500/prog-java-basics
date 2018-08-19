import java.util.LinkedList;

public class ArtikelverwaltungTest
{
	public static void main(String[] args)
	{
		Artikel[] artikelArray =
		{ 
				new Jeans(38, Kleidungsst�ck.Farbe.BLAU, "Levis", 440),
				new Jeans(34, Kleidungsst�ck.Farbe.GR�N, "Wrangler", 400),
				new Jeans(42, Kleidungsst�ck.Farbe.ROT, "Dickies", 420),
				new Jeans(40, Kleidungsst�ck.Farbe.SCHWARZ, "Boss", 450),
				new Jeans(41, Kleidungsst�ck.Farbe.GRAU, "Esprit", 430), 
		};
		
		Artikelverwaltung av1 = new Artikelverwaltung(artikelArray);
		Artikelverwaltung av2 = new Artikelverwaltung(artikelArray);
		
		av1.write("Artikel.txt");
		av2.read("Artikel.txt");
		
		System.out.println(av2);
		
	}

}
