import java.util.Scanner;

public class Tabellenkalkulation 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Zeilen: ");
		int iZeilen = sc.nextInt();
		System.out.print("Spalten: ");
		int iSpalten = sc.nextInt();
		
		int iArray[][] = new int[iZeilen][iSpalten];
		
		//For-Schleife für Arrayinitialisierung und Zeilensummierung
		for(int i=0; i<iZeilen; i++)
		{
			int iZeilensumme = 0;
			for(int j=0; j<iSpalten; j++)
			{
				iArray[i][j] = (int)(Math.random()*10);
				System.out.print(iArray[i][j] + "  ");
				iZeilensumme = iZeilensumme + iArray[i][j];
			}
			System.out.print("||" + iZeilensumme);
			System.out.println();
		}
		
		//For-Schleife für Abtrennung (====)
		for(int i=0; i<=(iSpalten*3)+2; i++)
		{
			System.out.print("=");
		}
		
		System.out.println();
		
		
		//For-Schleife für Spaltensumme
		for(int i=0; i<iSpalten; i++)
		{
			int iSpaltensumme = 0;
			
			for(int j=0; j<iZeilen; j++)
			{
				iSpaltensumme = iSpaltensumme + iArray[j][i];
			}
			
			System.out.print(iSpaltensumme + " ");
		}
	}
}
