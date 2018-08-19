import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.util.Scanner;

public class IOTokens
{
	public static void main(String[] args)
	{
		/*
		Scanner sc = new Scanner(System.in);
		int[] zahlen = new int[5];
		int ergebnis = 0;

		for (int i = 0; i < 5; i++)
		{
			System.out.print("Bitte " + (i + 1) + ". Zahl eingeben:");
			zahlen[i] = sc.nextInt();
		}

		for (int i : zahlen)
			ergebnis += i;

		System.out.println(ergebnis);
		 */
		// ----------------------------------------------------------

		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(r);
		try
		{
			// print the stream tokens
			while(true)
			{
				int token = st.nextToken();
				switch (token)
				{
					case StreamTokenizer.TT_WORD:
						System.out.println("Wort: " + st.sval);
						break;
					case StreamTokenizer.TT_NUMBER:
						System.out.println("Nummer: " + st.nval);
						break;
					default:
						System.out.println("Zeichen: " + (char) token);
				}
			}
		}
		catch (Exception ex)
		{
			System.err.println("Fehler passieren.");
		}
	}
}
