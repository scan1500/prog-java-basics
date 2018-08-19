import java.util.Scanner;

public class WordlistCreatorTest
{
	public static void main(String[] args)
	{

		while (true)
		{
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);

			System.out.print("WORD: ");
			String word = sc.nextLine();

			WordlistCreation wlc = new WordlistCreation(word);

			wlc.startTheMagic();
			System.out.println(wlc);
		}
	}
}
