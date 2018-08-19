
public class Sterne 
{
	public static void main(String[] args)
	{
		for(int i=0; i<=9; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0; i<=9; i++)
		{
			for(int j=9; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		
		for(int i=0; i<=9; i++)
		{
			//Reihensprung, sprich ein Punkt mehr
			int iCount=0;
			
			for(int j=9; j>=i; j--)
			{
				while(iCount < i)
				{
					System.out.print(" ");
					iCount++;
				}
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0; i<=9; i++)
		{
			//Reihensprung, sprich ein Punkt mehr
			int iCount=9;
			
			for(int j=0; j<=i; j++)
			{
				while(iCount > i)
				{
					System.out.print(" ");
					iCount--;
				}
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
}
