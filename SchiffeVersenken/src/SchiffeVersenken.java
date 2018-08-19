import java.util.Scanner;

public class SchiffeVersenken
{
	/*
	 * Objekte: Spielfeld, 2,3,4,5er Schiffe;
	 * 
	 * Funktionen: Spielfeld generieren, Schiff platzieren, Kanone feuern;
	 */

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);


		System.out.print("Spielgröße?:");
		int iN = sc.nextInt();
		//String[][] sSpielfeld = new String[iN][iN];

		//Objekt von Klasse cSpielfeld erstellen
		cSpielfeld spielfeld = new cSpielfeld(iN);
		
		cSchiff schiff = new cSchiff(3);

		
		
		// Spielfeld zeichnen mit Schiff

		int iZufallZeile = (int) (Math.random() * iN);
		int iZufallSpalte = (int) (Math.random() * iN);
		boolean bPlatzierung = false;

		do
		{

			int iZufallsRichtung = (int) (Math.random() * 4);

			switch (iZufallsRichtung)
			{
				case 0:// rechts

					if (iZufallSpalte + (schiff.iSchiffslaenge - 1) >= iN)
					{
						break;
					} else
					{
						for (int i = 0; i < schiff.iSchiffslaenge; i++)
						{
							spielfeld.sSpielfeld[iZufallZeile][iZufallSpalte + i] = " X ";
						}
						bPlatzierung = true;
					}
					break;

				case 1:// runter
					if (iZufallZeile + (schiff.iSchiffslaenge - 1) >= iN)
					{
						break;
					} else
					{
						for (int i = 0; i < schiff.iSchiffslaenge; i++)
						{
							spielfeld.sSpielfeld[iZufallZeile + i][iZufallSpalte] = " X ";
						}
						bPlatzierung = true;
					}
					break;

				case 2:// links
					if (iZufallSpalte - (schiff.iSchiffslaenge - 1) < 0)
					{
						break;
					} else
					{
						for (int i = 0; i < schiff.iSchiffslaenge; i++)
						{
							spielfeld.sSpielfeld[iZufallZeile][iZufallSpalte - i] = " X ";
						}
						bPlatzierung = true;
					}
					break;

				case 3:// hoch
					if (iZufallZeile - (schiff.iSchiffslaenge - 1) < 0)
					{
						break;
					} else
					{
						for (int i = 0; i < schiff.iSchiffslaenge; i++)
						{
							spielfeld.sSpielfeld[iZufallZeile - i][iZufallSpalte] = " X ";
						}
						bPlatzierung = true;
					}
					break;
			}
		} while (bPlatzierung == false);

		for (int i = 0; i < iN; i++)
		{
			System.out.print("+");
			for (int j = 0; j < iN; j++)
			{
				System.out.print("---+");
			}
			System.out.println();

			System.out.print("|");
			for (int j = 0; j < iN; j++)
			{
				System.out.print(spielfeld.sSpielfeld[i][j] + "|");
			}
			System.out.println();

			if (i == iN - 1)
			{
				System.out.print("+");
				for (int j = 0; j < iN; j++)
				{
					System.out.print("---+");
				}
			}
		}
		sc.nextLine();
		sc.nextLine();
		
		
	}

}
