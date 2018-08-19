
public class cSpielfeld 
{
	String[][] sSpielfeld;
	
	public cSpielfeld(int iN)
	{
		sSpielfeld = new String[iN][iN];
			
		for(int i=0; i<iN; i++)
		{
			System.out.print("+");
			for(int j=0; j<iN; j++)
			{
				System.out.print("---+");
			}
			System.out.println();
				
			System.out.print("|");
			for(int j=0; j<iN; j++)
			{
				sSpielfeld[i][j] = ("   ");
				System.out.print(sSpielfeld[i][j]+"|");
			}
			System.out.println();
				
			if(i == iN-1)
			{
				System.out.print("+");
				for(int j=0; j<iN; j++)
				{
					System.out.print("---+");
				}
			}
		}
	}
}
