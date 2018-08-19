
public class Wire implements Mobile
{
	double knotenabstand1;
	double knotenabstand2;
	double laenge;
	Mobile mobileleft;
	Mobile mobileright;

	public Wire(double laenge, Mobile mobileleft, Mobile mobileright)
	{
		this.laenge = laenge;
		this.mobileleft = mobileleft;
		this.mobileright = mobileright;
		
		balance();
	}

	@Override
	public double weight()
	{
		return mobileleft.weight() + mobileright.weight();
	}

	@Override
	public void balance()
	{
		for (double i = 1; i < laenge; i++)
		{
			if (i * mobileleft.weight() == (laenge-i) * mobileright.weight())
			{
				knotenabstand1 = i;
				knotenabstand2 = laenge-i;
			}
		}
	}

	public String toString()
	{
		return "Linkes Gewicht: " + mobileleft.weight() + ", Rechts Gewicht: " + mobileright.weight() + ", Knotenabstand 1: " + knotenabstand1 + ", Knotenabstand 2: " + knotenabstand2;
	}

}
