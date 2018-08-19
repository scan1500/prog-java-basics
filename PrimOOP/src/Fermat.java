import java.util.Random;

public class Fermat
{
	final static Random rng = new Random();

	public static int pow(final int a, int k, final int b)
	{
		long x = a;
		long z = 1;
		while (k > 0)
			if (k % 2 == 0)
			{
				k /= 2;
				x = x * x % b;
			}
			else
			{
				k--;
				z = z * x % b;
			}
		return (int) z;
	}

	public static boolean fermatTest(final int n, final int a)
	{
		if (pow(a, n - 1, n) % n == 1)
			return true;
		else
			return false;
	}

	public static boolean isPrime(final int n)
	{
		boolean fermattest = true;
		for(int i=0; i<100; i++)
		{
			if(Fermat.fermatTest(n, (int)(Math.random()*n)+1) == false)
			{
				fermattest = false;
				break;
			}
		}
		return fermattest;
		
	}

	public static int randomPrime()
	{
		return rng.nextInt();
	}
}