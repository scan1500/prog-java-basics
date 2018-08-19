
public class Zaehler
{
	public int einerstelle;
	public int zehnerstelle;

	public Zaehler(int einer, int zehner)
	{
		einerstelle = einer;
		zehnerstelle = zehner;
		System.out.print(zehner);
		System.out.print(einer + "\n");
	}

	public void erhoeheUmEins()
	{
		einerstelle++;
	}

	public void erhoeheUmZehn()
	{
		zehnerstelle++;
	}

	public void zaehlen()
	{
		try
		{
			erhoeheUmEins();
			if (einerstelle == 10)
			{
				throw new UeberlaufException();
			}
		}
		catch (UeberlaufException e1)
		{
			System.err.println("!");
			einerstelle = 0;

			try
			{
				erhoeheUmZehn();
				if (zehnerstelle == 10)
				{
					throw new UeberlaufException();
				}
			}
			catch (UeberlaufException e2)
			{
				System.err.println(e2.getMessage());
				einerstelle = 0;
				zehnerstelle = 0;
			}
		}

	}

	public String toString()
	{
		return zehnerstelle + "" + einerstelle;
	}

}
