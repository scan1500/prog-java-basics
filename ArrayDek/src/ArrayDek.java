import java.text.*;

public class ArrayDek 
{
	public static void main(String[] args)
	{
		//Format deklarieren:
		DecimalFormat f = new DecimalFormat("#0.0");
		
		//Konstantendeklaration (final)
		final int iArraySize = 10;
		double dTotal=0;
		float fFractions[] = new float[iArraySize];
		
		for(int i=0; i<iArraySize; i++)
		{
			fFractions[i] = 0;
		}
		
		fFractions[3] = (float) 4.5;
		fFractions[iArraySize-1] = (float) 5.3;
	
		
		
		for(int i=0; i<iArraySize; i++)
		{
			System.out.println("fFractions["+i+"] = " + fFractions[i]);
			dTotal = dTotal + fFractions[i];
		}
		
		System.out.println("Total: " + f.format(dTotal));
	}
}
