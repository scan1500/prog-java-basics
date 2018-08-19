import java.util.Scanner;

public class LogicalExpressions 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int iA, iB, iC, iD;
		boolean bResult;
		
		System.out.println("Bitte a eingeben: ");
		iA = sc.nextInt();
		
		System.out.println("Bitte b eingeben: ");
		iB = sc.nextInt();
		
		System.out.println("Bitte c eingeben: ");
		iC = sc.nextInt();
		
		System.out.println("Bitte d eingeben: ");
		iD = sc.nextInt();
		
		//Aussage 1
		if(iA > 1 || iB > 1 || iC > 1 || iD > 1)
		{
			bResult = true;
			System.out.println(bResult);
		}
		else
		{			
		bResult = false;
		System.out.println(bResult);
		}
		
		//Aussage 2
		if((iA > 1 & iB > 1 & iC > 1 & iD > 1) || (iA <= 1 & iB <= 1 & iC <= 1 & iD <= 1))
		{
			bResult = false;
			//System.out.println("Alle Zahlen größer 1 oder keine der Zahlen größer 1");
			System.out.println(bResult);
		}
		else
		{
			bResult = true;
			//System.out.println("Mindestens eine Zahl größer 1, da bei allen kleiner 0 false");
			//System.out.println("und höchstens 3, da bei alle 4 false");
			System.out.println(bResult);
		}
		
		//Aussage 3
		if((iA<0 & iB>=0 & iC>=0 & iD>=0) | (iA>=0 & iB<0 & iC>=0 & iD>=0) | (iA>=0 & iB>=0 & iC<0 & iD>=0) | (iA>=0 & iB>=0 & iC>=0 & iD<0))
		{
			bResult = true;
			System.out.println(bResult);
		}
		else
		{
			bResult = false;
			System.out.println(bResult);
		}
		
		//Aussage 4
		if(((iA > 0) & (iA > 10)) | ((iB > 0) & (iB > 10)) | ((iC > 0) & (iC > 10)) | ((iD > 0) & (iD > 10)) | (iA <= 0) & (iB <= 0) & (iC <= 0) & (iD <= 0))
		{
			bResult = true;
			System.out.println(bResult);
		}
		else
		{
			bResult = false;
			System.out.println(bResult);
		}
	}
}
