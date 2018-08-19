
public class PytDreieck 
{
	public static void main(String[] args)
	{
		int iZaehler=0;
		
		for(int iA=1; iA<=500; iA++)
		{
			for(int iB=1; iB<=500; iB++)
			{
				for(int iC=1; iC<=500; iC++)
				{
					if(Math.pow(iA, 2)+Math.pow(iB, 2) == Math.pow(iC, 2))
					{
						System.out.println(++iZaehler+": "+"a: "+iA+" b: "+iB+" c: "+iC);
					}
				}
			}
		}
	}
}
