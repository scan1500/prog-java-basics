import java.util.Scanner;

public class Papieraufgabe 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean bedingung = sc.nextBoolean(); 
		int wert = sc.nextInt();
		
		/*
		int i;
		i = 1;
		
		while(i < 10)
		{
			System.out.println(i);
			i = i + 1;
		}
		*/
		//Besser mit For-Schleife
		
		for(int i=1; i<10; i++)
		{
			System.out.println(i);
		}
		
		
		/*
		while(bedingung == true)
		{
			System.out.println("Bedingung ist wahr");
			break; // Beendet while-Schleife
		}
		*/
		//Besser mit IF-Abfrage
		
		
		if(bedingung == true)
		{
			System.out.println("Bedingung ist wahr");
		}
		else
		{
			System.out.println("Bedingung ist nicht wahr");
		}
		
		
		/*
		 
		if(wert == 0)
		{
			System.out.println("Wert ist 0");
		}
		else if(wert == 1)
		{
			System.out.println("Wert ist 1");
		}
		else if(wert == 2)
		{
			System.out.println("Wert ist 2");
		}
		else
		{
			System.out.println("Wert ist weder 0, noch 1, noch 2");
		}
		*/
		//Besser mit Switch(case)
		
		switch(wert)
		{
			case 0: System.out.println("Wert ist 0");
			break;
			
			case 1: System.out.println("Wert ist 1");
			break;
			
			case 2: System.out.println("Wert ist 2");
			break;
			
			default: System.out.println("Wert ist weder 0, noch 1, noch 2");
			break;
			
		}
		
	}
}
