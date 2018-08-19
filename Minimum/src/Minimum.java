import java.util.Scanner;

public class Minimum 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int iHilf;
		
		System.out.println("Bitte Anzahl eingeben: ");
		int iAnzahl = sc.nextInt();
		
		int[] iArray = new int[iAnzahl];
		
		//Eingabe in das Array
		System.out.println("Eingabe: ");
		for(int i=0; i<iAnzahl; i++)
		{
			System.out.println("Zahl"+(i+1)+": ");
			iArray[i] = sc.nextInt();
		}
		
		//Ausgabe unsortiert
		System.out.println("Ausgabe unsortiert: ");
		for(int i=0; i<iAnzahl; i++)
		{
			System.out.println(iArray[i]);
		}
		
		//Sortieren des Arrays
		for(int j=(iAnzahl-1); j>=0; j--)
		{
			for(int i=0; i<j; i++)
			{
				if(iArray[i]>iArray[i+1])
				{
					iHilf = iArray[i+1];
					iArray[i+1] = iArray[i];
					iArray[i] = iHilf;
				
					/*
					iHilf = iArray[i];
					iArray[i] = iArray[i+1];
					iArray[i+1] = iHilf;
					 */
				}
			}
		}
		
		//Ausgabe sortiert
		System.out.println("Ausgabe sortiert: ");
		for(int i=0; i<iAnzahl; i++)
		{
			System.out.println(iArray[i]);
		}
		
		
		//Ausgabe größte Zahl
		System.out.println("Größter Wert: "+iArray[iAnzahl-1]);
		//Ausgabe kleinste Zahl
		System.out.println("Kleinster Wert: "+iArray[0]);
	}
}
