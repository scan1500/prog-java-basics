import java.util.Arrays;

public class CharacterUtil
{
	public static boolean vertauscheRef(char[] a, char b[])
	{
		if (a.length == b.length)
		{
			char[] hilf = new char[a.length];

			// Vertauschen MIT derefferenzierung
			for (int i = 0; i < a.length; i++)
			{
				hilf[i] = a[i];
				a[i] = b[i];
				b[i] = hilf[i];
			}

			return true;
		}
		else
		{
			return false;
		}
	}

	public static boolean vertauscheNoRef(char[] a, char b[])
	{
		if (a.length == b.length)
		{
			char[] c = new char[a.length];

			c = a;

			a = b;

			b = c;

			return true;
		}
		else
		{
			return false;
		}
	}
}
