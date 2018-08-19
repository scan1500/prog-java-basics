
public class PiRek
{
	static double nenner = 1;
	static int counter = 0;

	public static double piRsub(double pi)
	{
		if (pi < 3.1416)
		{
			return pi;
		} 
		else
		{
			pi -= (4 / (nenner += 2));
			return piRadd(pi);
		}
	}

	public static double piRadd(double pi)
	{
		counter++;
		pi += (4 / (nenner += 2));

		return piRsub(pi);
	}

	public static void main(String[] args)
	{
		double piapprox = piRsub(4);
		System.out.println(piapprox);
		System.out.println(counter);
	}
}
