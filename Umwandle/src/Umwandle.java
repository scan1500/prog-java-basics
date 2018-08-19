import java.io.*;

public class Umwandle
{
	public static void main(String[] args) throws IOException
	{
		// File input = new File(args[0]);
		// File output = new File(args[1]);

		Reader r = null;
		Writer w = null;

		try
		{
			r = new FileReader("input.txt");
			w = new PrintWriter("output.txt");
			for (int zeichen; (zeichen = r.read()) != -1;)
			{
				if ((char) zeichen == 'i')
					zeichen = '!';

				w.write(zeichen);
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
			if(r != null)
			r.close();
			
			if(w != null)
			w.close();
			}
			catch(IOException e)
			{
				System.out.println("Fehelr passiert");
			}
		}
		
	}

}
