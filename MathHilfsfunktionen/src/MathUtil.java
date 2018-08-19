
public class MathUtil
{
	static boolean isEven(double value)
	{
		if(value%2 == 0)
			return true;
		else
			return false;
	}
	
	static int gcd(int a, int b)
	{
		int gcdvalue = a>b ? b : a;
		
		while(a%gcdvalue != 0 | b%gcdvalue != 0)
			gcdvalue--;
		
		return gcdvalue;
	}
	
	static float minimum3(float a, float b, float c)
	{
		float min = Math.min(Math.min(a, b), c);
		return min;
	}
	
	static int integerPower(int value, int exponent)
	{
		int power = (int) Math.pow(value, exponent);
		return power;
	}
	
	static String[][] intAsteriks(int n)
	{
		String[][] asteriks = new String[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				asteriks[i][j] = "*";
			}
		}
		return asteriks;
	}
	
	static double mean(double a, double b)
	{
		double value = (a+b) / 2;
		
		return value;
	}
}
