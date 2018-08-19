import java.util.Scanner;

public class Fakultaet 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int iN=0;
		long lFak=1;
		
		System.out.println("Bitte n eingeben:");
		iN = sc.nextInt();
		
		for(int i = 1; i <= iN; i++)
		{
			lFak = lFak * i;
			
			//1 = 1 * 1
			//1 = 1 * 2
			//2 = 2 * 3
			//6 = 6 * 4
			//24 = 24 * 5
			// = 120
		}
		
		System.out.println(lFak);
	}
}
