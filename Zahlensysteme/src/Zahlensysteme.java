import java.util.Scanner;

public class Zahlensysteme 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String sWert;
		
		System.out.println("Bitte eine Dezimalzahl eingeben");
		int i = sc.nextInt();
		System.out.println("Eingelesene Dezimalzahl war: " +i);
		
		
		//Umwandlung in Binär
		System.out.println("Dezimal(" + i + ") -> Binär: " + Integer.toBinaryString(i));
		System.out.println("Dezimal(" + i + ") -> Hexadezimal: " + Integer.toHexString(i));
		System.out.println("Dezimal(" + i + ") -> Octal: " + Integer.toOctalString(i));
		
		
		System.out.println("Bitte eine Binärzahl eingeben");
		String st = sc.next();
		
		System.out.println("Binär(" + st + ") -> Dezimal: " + Integer.parseInt(st, 2));
		System.out.println("Binär(" + st + ") -> Hexadezimal: " + Integer.toHexString(Integer.parseInt(st, 2)));
		//System.out.println("Binär(" + st + ") -> Octal: " + Integer.parseInt(st, 8));
	}
}
