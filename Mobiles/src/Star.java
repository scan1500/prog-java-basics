public class Star implements Mobile
{
	double gewicht;
	
	
	public Star(double gewicht)
	{
		try
		{
			if(gewicht < 0)
				throw new IllegalArgumentException();
			else
					this.gewicht = gewicht;
		}
		catch(IllegalArgumentException e)
		{
			System.err.println("Falsche Eingabe!");
		}
	}


	@Override
	public double weight()
	{
		return gewicht;
	}


	@Override
	public void balance()
	{
		// TODO Auto-generated method stub
		
	}
}
