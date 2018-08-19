import java.util.StringTokenizer;

public class WordColl
{
	Word[] word = new Word[100];
	int lastword = 0;

	public WordColl(String[] sentences)
	{
		// Klassenarray Word init.
		for (int i = 0; i < word.length; i++)
		{
			word[i] = new Word();
		}

		// Objekte erstellen, Wörter hinzufügen mit jeweiliger Stückzahl
		for (int i = 0; i < sentences.length; i++)
		{
			StringTokenizer tokenizer = new StringTokenizer(sentences[i], ",.!()- ", false);

			while (tokenizer.hasMoreTokens())
			{
				String token = tokenizer.nextToken();
				if (nameCheck(token))
				{
					// Wenn name bereitsvorhanden dann um 1 hochzählen
					countUp(token);
				}
				else
				{
					word[lastword++].setName(token);
				}
			}
		}
	}

	public void countUp(String name)
	{
		for (int i = 0; i < word.length; i++)
		{
			if (name.equals(word[i].name))
			{
				word[i].count++;
			}
		}
	}

	public boolean nameCheck(String name)
	{
		for (int i = 0; i < word.length; i++)
		{
			if (name.equals(word[i].name))
				return true;
		}
		return false;
	}

	public int size()
	{
		int counter = 0;
		
		for(int i=0;i<word.length;i++)
		{
			if(word[i].name != "")
				counter++;
		}
		return counter;
	}

	public int count(String name)
	{
		for (int i = 0; i < word.length; i++)
		{
			if (name.equals(word[i].name))
				return word[i].count;
		}
		return 0;
	}

	public void append(String sentence)
	{
		// Objekte erstellen, Wörter hinzufügen mit jeweiliger Stückzahl
		StringTokenizer tokenizer = new StringTokenizer(sentence, ",.!()- ", false);

		while (tokenizer.hasMoreTokens())
		{
			String token = tokenizer.nextToken();
			if (nameCheck(token))
			{
				// Wenn name bereitsvorhanden dann um 1 hochzählen
				countUp(token);
			}
			else
			{
				word[lastword++].setName(token);
			}
		}
	}

	public String top()
	{
		Word wHilf = new Word();

		for (int j = word.length - 1; j > 0; j--)
		{
			for (int i = 0; i < j; i++)
			{
				if (word[i].count < word[i + 1].count)
				{
					wHilf = word[i + 1];
					word[i + 1] = word[i];
					word[i] = wHilf;
				}
			}
		}

		return "Name: " + word[0].name + ", Anzahl: " + word[0].count;

	}

	public String toString()
	{
		for (Word w : word)
		{
			if (w.name != "")
			{
				System.out.println(w);
			}
		}

		return "";
	}

	public class Word
	{
		String name = "";
		int count = 1;

		public void setName(String name)
		{
			this.name = name;
		}

		public void increment()
		{
			count++;
		}

		public String toString()
		{
			return "Name: " + name + ", Anzahl: " + count;
		}
	}
}
