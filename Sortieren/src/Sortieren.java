
public class Sortieren 
{
	public static void main(String[] args)
	{
		int[] iArray = { 2000, 2, 45, 34, 100000, 345, 56, 78, 99 ,756, 999, 0, 666, 2345, 7492, 22 };
		int iHilf=0;
		
		System.out.println("Unsortiert:");
		for(int i=0; i<iArray.length; i++)
		{
			System.out.println(iArray[i]);
		}
		
		//BubbleSort Aufsteigend
		
		for(int j=iArray.length-1; j>0; j--)
		{
			for(int i=0; i<j; i++)
			{
				if(iArray[i]>iArray[i+1])
				{
					iHilf = iArray[i+1];
					iArray[i+1] = iArray[i];
					iArray[i] = iHilf;
				}
			}
		}
		
		System.out.println("\nSortiert Aufsteigend:");
		for(int i=0; i<iArray.length; i++)
		{
			System.out.println(iArray[i]);
		}
		
		//BubbleSort Absteigend
		for(int j=iArray.length-1; j>0; j--)
		{
			for(int i=0; i<j; i++)
			{
				if(iArray[i]<iArray[i+1])
				{
					iHilf = iArray[i+1];
					iArray[i+1] = iArray[i];
					iArray[i] = iHilf;
				}
			}
		}
		
		System.out.println("\nSortiert Absteigend:");
		for(int i=0; i<iArray.length; i++)
		{
			System.out.println(iArray[i]);
		}
		
		
	}
}
