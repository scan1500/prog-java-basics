import java.util.Scanner;

public class Zeichenzaehler 
{
	public static void main(String[] args)
	{
		
		char cNochmal='j';
		
		while(cNochmal == 'j')
		{	
		Scanner sc = new Scanner(System.in);
		int iVoCount=0, iKoSoCount=0;
		int iA=0, iE=0, iI=0, iO=0, iU=0;
		
		System.out.println("Bitte Text eingeben: ");
		String sText = sc.nextLine();
		System.out.println(sText);
		
		for(int i=0; i<=sText.length()-1; i++ )
		{
			switch(sText.charAt(i))
			{
				case 'a': iA++;iVoCount++;
					break;
				case 'e': iE++;iVoCount++;
					break;
				case 'i': iI++;iVoCount++;
					break;
				case 'o': iO++;iVoCount++;
					break;
				case 'u': iU++;iVoCount++;
					break;
				default: iKoSoCount++;
					break;
			}
		}
		System.out.println("a:" + iA);
		System.out.println("e:" + iE);
		System.out.println("i:" + iI);
		System.out.println("o:" + iO);
		System.out.println("u:" + iU);
		System.out.println("Kons. u Sonderz.:" + iKoSoCount);
		System.out.println("Nochmal? (j/n)");
		cNochmal = sc.next().charAt(0);
		
		}
	}
}
