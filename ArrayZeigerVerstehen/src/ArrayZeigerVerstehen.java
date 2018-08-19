import java.util.Arrays;

public class ArrayZeigerVerstehen
{
	public static void main(String[] args)
	{
		char[] cA = {'A','B','C','D','E','F'};
		char[] cB = {'F','G','H'};
		char[] cC = new char[10];
		int i = 0;
		
		//Der Zeiger B zeigt nun auf die Adresse von Zeiger A;
		cB = cA;
		
		//Für jedes Char im ArrayB weise ArrayC die Werte von B zu
		for(char c : cB)
			cC[i++] = c;
		
		//Gebe ArrayC aus: Werte von ArrayB und 4 leere Felder da ArrayC die Länge 10 hat
		System.out.println(Arrays.toString(cC));
		
		//Der Zeiger´´ C zeigt nun auf den Zeiger B (Zeiger B zeigt auf die Adresse von Zeiger A)
		cC = cB;
		
		//Der Zeiger A verliert nun seine Referenz und zeigt auf NULL
		cA = null;
		
		//B zeigt immernoch auf die ehemalige Adresse von Zeiger A
		//Ausgabe der Werte von ArrayA
		System.out.println(Arrays.toString(cC));
		
	}
}
