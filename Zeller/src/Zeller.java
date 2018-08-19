import java.util.Scanner;

public class Zeller 
{
	public static void main(String[] args)
	{
		int iTag=0, iMonat=0, iJahr=0, iJahrhundert=0, iWochentag;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Bitte Tag eingeben:");
		iTag = sc.nextInt();
		
		System.out.print("Bitte Monat eingeben:");
		iMonat = sc.nextInt();
		
		System.out.print("Bitte Jahr eingeben:");
		iJahr = sc.nextInt();
		
		iJahrhundert = (iJahr/100);
		iJahr = iJahr - iJahrhundert*100;
		
		System.out.println(iJahr);
		
		System.out.println(iJahrhundert);
		
		iWochentag = (iTag + (((26*(iMonat + 1))/10)) + ((5*iJahr)/4) + (iJahrhundert/4) + (5*iJahrhundert)-1)%7;
				
		System.out.println(iWochentag);
		
		switch(iWochentag)
		{
			case 0: System.out.print("Sonntag");
			break;
		
			case 1: System.out.print("Montag");
			break;
		
			case 2: System.out.print("Dienstag");
			break;
		
			case 3: System.out.print("Mittwoch");
			break;
		
			case 4: System.out.print("Donnerstag");
			break;
		
			case 5: System.out.print("Freitag");
			break;
		
			case 6: System.out.print("Samstag");
			break;
		}
	}
}
