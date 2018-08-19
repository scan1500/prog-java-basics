import java.util.Scanner;

public class Funktionen 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int iN, iM;
		double dX, dY;
		double dA0=1.0, dA1=2.5, dA2=0.1, dA3=0.0, dA4=0.8, dA5=0.0, dA6=1.5;
		
		System.out.println("Bitte n eingeben:");
		iN = sc.nextInt();
		
		System.out.println("Bitte m eingeben:");
		iM = sc.nextInt();
		
		System.out.println("Bitte x eingeben:");
		dX = sc.nextDouble();
		
		
		//1.Berechnung
		dY = Math.log((Math.abs(iN-iM))*dX);
		System.out.println(dY);
		
		//2.Berechnung
		dY = Math.sin((iN + iM)*0.5*dX) - Math.cos((iN - iM)*0.5*dX);
		System.out.println(dY);
		
		//3.Berechnung
		dY = 0.5*((iN-iM)/(iN+iM*1.0))*dX*(Math.exp((-1*(iN+iM))*Math.pow(dX, 2)));
		System.out.println(dY);
		
		//4.Berechnung
		dY = dA0-dA1*dX+dA2*Math.pow(dX, 2)-dA3*Math.pow(dX, 3)+dA4*Math.pow(dX, 4)-dA5*Math.pow(dX, 5)+dA6*Math.pow(dX, 6);
		System.out.println(dY);
		
		//5.Berechnung
		dY = (Math.pow((Math.exp(dX)+dX),2))/(0.5*dX+Math.exp(dX))-Math.exp(dX);
		System.out.println(dY);
		
	}
}
