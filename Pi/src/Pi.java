import java.util.Scanner;

public class Pi 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double dPi=4;
		int iWechsel = -1, iZaehler=0;
		
		
		/*
		for(double dNenner=3; true ; dNenner+=2)
		{
			dPi = dPi + (iWechsel*(4/dNenner));
			
			if(iWechsel == 1)
			System.out.println(iZaehler++ +": " +dPi);
			
			if(iWechsel == 1 & dPi < 3.15)
				break;
			
			iWechsel = iWechsel * (-1);
		}
		*/
		
		double dNenner = 1;
		
		do
		{
			dPi = dPi + (iWechsel*(4/(dNenner+=2)));
			
			if(iWechsel == 1)
			System.out.println(iZaehler++ +": " +dPi);
			
			if(iWechsel == 1 & dPi < 3.15)
				break;
			
			iWechsel = iWechsel * (-1);
		}
		while(true);
	}
}
		


