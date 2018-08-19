import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.io.Writer;
import java.nio.file.StandardOpenOption;
import java.util.Collection;
import java.util.LinkedList;

public class Artikelverwaltung
{
	LinkedList<Artikel> lili;

	public Artikelverwaltung(Artikel[] artikelArray)
	{
		lili = new LinkedList<Artikel>();
		for (Artikel a : artikelArray)
			lili.add(a);
	}

	public void write(String filename)
	{
		PrintWriter pw = null;
		try
		{
			Writer fw = new FileWriter(filename, true);
			Writer bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);

			for (Object a : lili.toArray())
				pw.println(a.toString() + ",");
		}
		catch (IOException e)
		{
			System.err.println("eeeehm kleiner Fehler passiert...");
		}
		finally
		{
			if (pw != null)
			{
				pw.close();
			}
		}
	}

	public void read(String filename)
	{
		for (int i = 0; i < lili.size(); i++)
		{
			lili.remove(i);
		}

		Reader pr = null;
		try
		{
			pr = new FileReader(filename);
			BufferedReader br = new BufferedReader(pr);
			StreamTokenizer st = new StreamTokenizer(br);

			// while(st.nextToken() != st.TT_EOF)
			// {
			while(st.nextToken() != st.TT_EOF)
			{
			st.nextToken();
			String artikelname = st.sval;
			st.nextToken();
			double groesse = st.nval;
			st.nextToken();
			int farbindex = 0;

			switch (st.sval)
			{
				case "SCHWARZ":
					farbindex = 0;
					break;
				case "GRÜN":
					farbindex = 1;
					break;
				case "ROT":
					farbindex = 2;
					break;
				case "BLAU":
					farbindex = 3;
					break;
				case "GRAU":
					farbindex = 4;
					break;
				default:
					System.out.println("Farbe gibts net");
			}
			st.nextToken();
			int schrittlaenge = (int)st.nval;
			st.nextToken();
			
			lili.add(new Jeans((int) groesse, Kleidungsstück.Farbe.values()[farbindex], artikelname, schrittlaenge));
			}
		}

		catch (IOException e)
		{
			System.err.println("Fehler!");
		}
	}

	public String toString()
	{
		String s = "";
		for (Object a : lili.toArray())
			s += a.toString() + ",\n";

		return s;
	}
}
