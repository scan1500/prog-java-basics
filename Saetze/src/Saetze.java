
public class Saetze 
{
	public static void main(String[] args)
	{
		String sArticle[] = {" the" , " a" , " one" , " some" , " any"};
		String sNoun[] = {" boy" , " girl" , " dog" , " town" , " car"};
		String sVerb[] = {" drove" , " jumped" , " ran" , " walked" , " skipped"};
		String sPreposition[] = {" to" , " from" , " over" , " under" , " on"};
		int iRandom[] = new int[6];
		
		//Generate 6 random numbers: i = [0-5]
		for(int iCount=0; iCount<20; iCount++)
		{
			for(int i=0; i<iRandom.length; i++)
			{
				iRandom[i] = (int)(Math.random()*5);
			}
		
			System.out.print(sArticle[iRandom[0]]);  
			System.out.print(sNoun[iRandom[1]]);
			System.out.print(sVerb[iRandom[2]]);
			System.out.print(sPreposition[iRandom[3]]);
			System.out.print(sArticle[iRandom[4]]);  
			System.out.print(sNoun[iRandom[5]]);
			System.out.println(".");
		}
	}
}
