import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterTest
{
	public static void main(String[] args)
	{
		Writer fw = null;
		try
		{
			fw = new FileWriter("Datei.txt");
			fw.write("Text in Datei schreiben...");
		}
		catch (IOException e)
		{
			System.err.println("Fehler beim Öffnen der Datei");
		}
		finally
		{
			if (fw != null)
			{
				try
				{
					fw.close();
				}
				catch (IOException e)
				{
					System.err.println("Fehler");
				}
			}
		}
	}
}
