import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class WordlistCreation
{
	String word;
	HashSet<String> wordlist = new HashSet<String>();

	
	public WordlistCreation(String word)
	{
		this.word = word.toLowerCase();
	}
	
	public void startTheMagic()
	{
		wordlist.addAll(lowerUpperCase());
		wordlist.addAll(numberReplace(wordlist));
		wordlist.addAll(stupidAttachment(wordlist));
		
		
		String[] stringarray = (String[]) wordlist.toArray(new String[0]);
		Writer w = null;

		try
		{
			w = new FileWriter("C:/Users/Andi/Desktop/wordlist.txt", true);
			for(int i=0; i<stringarray.length; i++)
			{
				w.write(stringarray[i]);
				w.write("\r\n");
			}
		}
		catch (IOException e)
		{
			System.out.println("Fehler passiert");
		}
		finally
		{
			try
			{
				if (w != null)
					w.close();
			}
			catch (IOException e)
			{
				System.out.println("Fehelr passiert");
			}
		}
	}
	
	public HashSet<String> lowerUpperCase()
	{
		HashSet<String> upperlowerlist = new HashSet<String>();
		char[] letters = new char[word.toCharArray().length];
		letters = word.toCharArray();
		
		//lower to upper (all step by step)
		for(int i=0; i<word.toCharArray().length; i++)
		{
			letters[i] = Character.toUpperCase(letters[i]);
			String word = new String(letters);
			upperlowerlist.add(word);
		}
		//upper to lower (all step by step)
		for(int i=0; i<word.toCharArray().length; i++)
		{
			letters[i] = Character.toLowerCase(letters[i]);
			String word = new String(letters);
			upperlowerlist.add(word);
		}
		//lower to upper (single letters)
		for(int i=0; i<word.toCharArray().length; i++)
		{
			letters = word.toCharArray();
			letters[i] = Character.toUpperCase(letters[i]);
			String word = new String(letters);
			upperlowerlist.add(word);
		}
		//upper  to lower (single letters)
		for(int i=0; i<word.toCharArray().length; i++)
		{
			letters = word.toUpperCase().toCharArray();
			letters[i] = Character.toLowerCase(letters[i]);
			String word = new String(letters);
			upperlowerlist.add(word);
		}
		return upperlowerlist;
	}
	
	public HashSet<String> numberReplace(HashSet<String> list)
	{
		HashSet<String> numberlist = new HashSet<String>();
		
		String[] stringarray = (String[]) list.toArray(new String[0]);
		
		for(int i=0; i<stringarray.length; i++)
		{
			numberlist.add(stringarray[i].replace("a", "4"));
			numberlist.add(stringarray[i].replace("e", "3"));
			numberlist.add(stringarray[i].replace("i", "1"));
			numberlist.add(stringarray[i].replace("o", "0"));
			numberlist.add(stringarray[i].replace("t", "7"));
			numberlist.add(stringarray[i].replace("l", "1"));
		}
		return  numberlist;
	}
	
	public HashSet<String> stupidAttachment(HashSet<String> list)
	{
		HashSet<String> attachlist = new HashSet<String>();
		
		String[] stringarray = (String[]) list.toArray(new String[0]);
		
		for(int i=0; i<stringarray.length; i++)
		{
			attachlist.add(stringarray[i] += "123");
		}
		
		stringarray = (String[]) list.toArray(new String[0]);
		
		for(int i=0; i<stringarray.length; i++)
		{
			attachlist.add(stringarray[i] += "!");
		}
		
		stringarray = (String[]) list.toArray(new String[0]);
		
		for(int i=0; i<stringarray.length; i++)
		{
			attachlist.add(stringarray[i] += "123!");
		}
		
		stringarray = (String[]) list.toArray(new String[0]);
		
		for(int i=0; i<stringarray.length; i++)
		{
			attachlist.add("!" + stringarray[i]);
		}
		
		stringarray = (String[]) list.toArray(new String[0]);
		
		for(int i=0; i<stringarray.length; i++)
		{
			attachlist.add(stringarray[i] += "/");
		}
		
		stringarray = (String[]) list.toArray(new String[0]);
		
		for(int i=0; i<stringarray.length; i++)
		{
			attachlist.add(stringarray[i] += "123/");
		}
		//jahreszahlen
	
		stringarray = (String[]) list.toArray(new String[0]);
		
		for(int i=0; i<stringarray.length; i++)
		{
			for(int j=0; j<=60; j++)
			{
				stringarray = (String[]) list.toArray(new String[0]);
				attachlist.add(stringarray[i] += Integer.toString(1950 + j));
			}
		}
		
		stringarray = (String[]) list.toArray(new String[0]);
		
		for(int i=0; i<stringarray.length; i++)
		{
			for(int j=0; j<=99; j++)
			{
				stringarray = (String[]) list.toArray(new String[0]);
				attachlist.add(stringarray[i] += Integer.toString(j));
			}
		}
		
		stringarray = (String[]) list.toArray(new String[0]);
		
		for(int i=0; i<stringarray.length; i++)
		{
			for(int j=0; j<=9; j++)
			{
				stringarray = (String[]) list.toArray(new String[0]);
				attachlist.add(stringarray[i] += "0" + Integer.toString(j));
			}
		}
		
		
		return  attachlist;
	}
	
	public String toString()
	{
		return Integer.toString(wordlist.size());
	}
}
