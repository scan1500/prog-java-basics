
public class Utils<T extends Comparable<T>>
{
	public static <T> void print(T[] array)
	{
		for(T a : array)
		System.out.print(a.toString() + " ");
		
		System.out.println("\n");
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T[] sort(T[] array)
	{
		T hilf;
		for(int j=array.length-1; j>0; j--)
		{
			for(int i=0; i<j; i++)
			{
				if(((Comparable<T>) array[i]).compareTo(array[i+1]) > 0)
				{
					hilf = array[i+1];
					array[i+1] = array[i];
					array[i] = hilf;
				}
			}
		}
		
		return array;
	}
	
	public static <T> String noNull(T... varParam)
	{
		for(int i=0; i<varParam.length; i++)
		{
			if(varParam[i] != null)
			{
				return varParam[i].toString();
			}
		}
		return "null";
	}
}
