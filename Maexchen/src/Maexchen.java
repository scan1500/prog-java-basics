import java.util.Scanner;

public class Maexchen 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
		System.out.print("Zahl1: ");
		int iZahl1 = sc.nextInt();
		
		System.out.print("Zahl2: ");
		int iZahl2 = sc.nextInt();
		
		if(iZahl1 == iZahl2)
		{
			System.out.println(100 * iZahl1);
		}
		else if(iZahl1 == 1 & iZahl2 == 2 || iZahl1 == 2 & iZahl2 == 1)
		{
			System.out.println("1000");
		}
		else
		{
			if(iZahl1 > iZahl2)
			{
				System.out.println((iZahl1*10)+iZahl2);
			}
			else
			{
				System.out.println((iZahl2*10)+iZahl1);
			}
		}
		}
	}
}



