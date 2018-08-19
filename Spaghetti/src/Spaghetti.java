import java.util.Scanner;

public class Spaghetti 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Bitte x eingeben: ");
		double dX = sc.nextDouble();
	
		if(dX == 0)
		{
			System.out.println(dX);
		}
		else if(dX>2005)
		{
			dX = dX/(Math.sqrt(dX));
			dX = dX / (dX * dX);
			System.out.println(dX);
		}
		else
		{
			dX = dX / dX*(dX + dX);
			dX = dX / (dX * dX);
			System.out.println(dX);
		}
	}
}

