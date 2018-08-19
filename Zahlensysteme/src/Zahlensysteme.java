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
		
		
		//Umwandlung in Bin�r
		System.out.println("Dezimal(" + i + ") -> Bin�r: " + Integer.toBinaryString(i));
		System.out.println("Dezimal(" + i + ") -> Hexadezimal: " + Integer.toHexString(i));
		System.out.println("Dezimal(" + i + ") -> Octal: " + Integer.toOctalString(i));
		
		
		System.out.println("Bitte eine Bin�rzahl eingeben");
		String st = sc.next();
		
		System.out.println("Bin�r(" + st + ") -> Dezimal: " + Integer.parseInt(st, 2));
		System.out.println("Bin�r(" + st + ") -> Hexadezimal: " + Integer.toHexString(Integer.parseInt(st, 2)));
		//System.out.println("Bin�r(" + st + ") -> Octal: " + Integer.parseInt(st, 8));
	}
}
