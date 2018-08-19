import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Bibliothek
{
	Collection<Buch> bookcoll;

	public Bibliothek()
	{
		bookcoll = new ArrayList<Buch>();
	}

	public boolean einfügen(Buch b)
	{
		if (bookcoll.add(b))
			return true;
		else
			return false;
	}

	public Collection<Buch> sucheNachAutor(String autor)
	{
		return bookcoll.stream().filter(p -> p.autor.equals(autor)).collect(Collectors.toList());
	}

	public Collection<Buch> sucheNachISBN(String isbn)
	{
		return bookcoll.stream().filter(p -> p.isbn.equals(isbn)).collect(Collectors.toList());
	}

	public Buch[] listToArray(Collection<Buch> list)
	{
		Buch[] bookArray = new Buch[list.size()];
		bookcoll.toArray(bookArray);

		return bookArray;
	}

	public String toString()
	{
		// Lambda Ausruck innerhalb einer forEach Anweisung
		// bookcoll.forEach(b -> b.setAutor("Willhelm"));

		String output = "";

		for (Buch b : listToArray(bookcoll))
			output += b.toString() + "\n";

		return output;
	}

	public Collection<Buch> bestandSortierenNach(Comparator<Buch> comp)
	{
		Collections.sort((List<Buch>) bookcoll, comp);
		return bookcoll;
	}

	public String allTitlesByAutor(String autor)
	{
		String titles = "";
		for (Buch b : bookcoll)
		{
			if (autor == b.autor)
			{
				titles += ", " + b.titel;
			}
		}
		return titles;
	}

	public Map<String, List<Buch>> bestandNachAutor()
	{
		return bookcoll.stream().collect(Collectors.groupingBy((Buch b) -> b.getAutor()));
	}
}
