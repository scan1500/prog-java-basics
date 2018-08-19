
public class WurzelRekTest
{
	public static void main(String[] args)
	{
		System.out.println(zieheWurzelGanzzahlig(0, 16));
	}
	
	public static int zieheWurzelGanzzahlig(int w, int n)
	{
		if(w*w <= n)
			return zieheWurzelGanzzahlig(w+1, n);
		else 
			return w-1;
	}
}
