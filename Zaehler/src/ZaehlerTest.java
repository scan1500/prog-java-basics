import java.util.Scanner;

public class ZaehlerTest
{
	public static void main(String[] args) throws UeberlaufException
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Einerstelle:");
		int einereingabe = sc.nextInt();

		System.out.print("Zehnerstelle:");
		int zehnereingabe = sc.nextInt();

		Zaehler zaehler1 = new Zaehler(einereingabe, zehnereingabe);
		
		while (true)
		{
			zaehler1.zaehlen();
			System.out.println(zaehler1.toString());
			sc.nextLine();
		}
	}
}
