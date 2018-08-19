import java. util.Scanner;

public class MagQuad 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int iN = 0;
		
		do
		{
			System.out.println("Zahl eingeben: (ungerade, 2<n<10)");
			iN = sc.nextInt();
		}
		while(iN >= 10 | iN <=2 | iN%2 == 0);
		
		int[][] iArray = new int[iN][iN];
		int iZeile = iN/2;
		int iSpalte = (iN/2)+1;
		
		for(int i=0; i<iN; i++)
		{
			for(int j=0; j<iN; j++)
			{
				iArray[i][j] = 0;
			}
		}
		
		for(int iM=1; iM<=Math.pow(iN, 2); iM++)
		{
			iArray[iZeile][iSpalte]=iM;
			
			if(iZeile-1 < 0)
			iZeile = iN-1;
			else
			iZeile--;
			
			if(iSpalte+1 >= iN)
			iSpalte = 0;
			else
			iSpalte++;
			
			if(iArray[iZeile][iSpalte] != 0 )
			{
				if(iZeile+1 >= iN)
				iZeile = 0;
				else
				iZeile++;
				
				if(iSpalte+1 >= iN)
				iSpalte = 0;
				else
				iSpalte++;
			}
			
			}
		
		for(int i=0; i<iN; i++)
		{
			for(int j=0; j<iN; j++)
			{
				System.out.print(iArray[i][j]+ "  ");
			}
			System.out.println();
		}
		
		}
		
	}

