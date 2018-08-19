import java.util.Scanner;

public class Fibonacci 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte n eingeben: ");
		int n = sc.nextInt();
		long iF = 0;
		long iFalt1=1;
		long iFalt2=0;

		if(n == 0)
		{
			System.out.println(iFalt2);
		}
			
		else if(n == 1)
		{
			System.out.println(iFalt1);
			
		}
		else
		{
		System.out.println(iFalt2);
		System.out.println(iFalt1);
		
		for(int iZahl=2; iZahl<=n; iZahl++)
		{
			iF = (iFalt2)+(iFalt1);
			
			iFalt2 = iFalt1;
			iFalt1 = iF;
			
			//2: 1 = 1 + 0
			//3: 3 = 2 + 1
			System.out.println(iF);
		}
		}
		
		
	}
}
