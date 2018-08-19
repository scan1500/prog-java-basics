import java.util.Scanner;

public class FilterSensor
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int iAltezahl = 999;

		while (true)
		{
			int n = sc.nextInt();

			if (n > 0)
			{
				System.out.print(n + " ");
				iAltezahl = n;
			}

			else if (n == 0)
			{
				//Ausgeben nur wenn alte Zahl nicht Null ist
				if (iAltezahl != 0)
				{
					System.out.print(n + " ");
					iAltezahl = n;
				}
			}
		}

	}
}
