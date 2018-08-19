import java.util.Scanner;

public class DreierSumme 
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		int iSumme=0;
		
		System.out.println("Bitte n eingeben: ");
		int iN = sc.nextInt();
		
		/* Mit einer For-Schleife
		if(iN<3)
		{
			System.out.println("Summe = " + iSumme);
		}
		else
		{
			for(int iZaehler=1; iZaehler<=iN; iZaehler++)
			{
				if(iZaehler%3 == 0)
				{
					iSumme = iSumme + iZaehler;
				}
			}
			System.out.println("Summe = " + iSumme);
		}
		
		/*Mit einer While-Schleife
		
		if(iN<3)
		{
			System.out.println("Summe = " + iSumme);
		}
		else
		{
			int iZaehler = 1;
			while(iZaehler<=iN)
			{
				if(iZaehler%3 == 0)
				{
					iSumme = iSumme + iZaehler;
				}
				iZaehler++;
			}
			System.out.println("Summe = " + iSumme);
		}
		*/
		
		//Mit einer do-while Schleife
		
		if(iN<3)
		{
			System.out.println("Summe = " + iSumme);
		}
		else
		{
			int iZaehler = 1;
			do
			{
				if(iZaehler%3 == 0)
				{
					iSumme = iSumme + iZaehler;
				}
				iZaehler++;
			}
			while(iZaehler <= iN);
			
			System.out.println("Summe = " + iSumme);
		}
		
	}
}
