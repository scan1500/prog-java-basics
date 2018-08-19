import java.util.Scanner;

public class Quersumme
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte Zahl eingeben: ");
		int n = sc.nextInt();

		//gibt die jeweilige 10er wertigkeit zurück 317 = 100;
		int iTeiler = (int) Math.pow(10, (int) Math.log10(n));

		int quersumme = 0;

		int iZahl;

		System.out.println(iTeiler);

		for(int i = 1; i<=iTeiler; iTeiler/=10)
		{
			iZahl = n / iTeiler;

			quersumme = quersumme + iZahl;
			
			n = n - iTeiler * iZahl;
		}
		System.out.println(quersumme);
	}

}
