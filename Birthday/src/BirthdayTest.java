import java.text.ParseException;
import java.util.Scanner;

public class BirthdayTest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.println("Datum:");
			String date = sc.nextLine();

			try
			{
				Birthday bday = new Birthday(date);
				bday.checkDay(date);
			}
			catch (InvalidBirthdayException e)
			{
				System.err.println("Falsches Datumsformat");
			}
		}
		while (true);
	}
}
