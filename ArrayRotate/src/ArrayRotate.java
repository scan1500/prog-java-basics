import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotate
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte Anzahl der Zeilen und Spalten eingeben");
		int iZeile = sc.nextInt();
		int iSpalte = sc.nextInt();
		int iZahl = 0;

		int[][] iArray = new int[iZeile][iSpalte];

		//Array initialisieren mit Inkrement iZahl
		for (int i = 0; i < iSpalte; i++)
		{
			for (int j = 0; j < iZeile; j++)
			{
				iArray[i][j] = iZahl++;
			}
		}

		//Ausgabe des Arrays original
		for (int i = 0; i < iSpalte; i++)
		{
			for (int j = 0; j < iZeile; j++)
			{
				System.out.print(iArray[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
	
		System.out.println();

		//Ausgabe des Arrays rotated
		for (int j = 0; j < iSpalte; j++)
		{
			for (int i = iSpalte - 1; i >= 0; i--)
			{
				System.out.print(iArray[i][j]);
			}
			System.out.println();
		}

		System.out.println();
		
		/*
		
		//Ausgabe des Arrays rotated mit verändertem Array
		for (int i = 0; i < iSpalte; i++)
		{
			for (int j = 0; j < iZeile; j++)
			{
				System.out.print(iArray[i][j]);
			}
			System.out.println();
		}
		
		*/
	}
}
