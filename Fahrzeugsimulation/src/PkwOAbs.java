
public class PkwOAbs extends Pkw
{

	public PkwOAbs(double beschleunigung, double position, double geschwindigkeit, double hoechstgeschwindigkeit,
			String name)
	{
		super(beschleunigung, position, geschwindigkeit, hoechstgeschwindigkeit, name);
		// TODO Auto-generated constructor stub
	}
	
	public double stoppen()
	{
		anhalteweg = Math.pow(((geschwindigkeit/3.6)/10),2) + ((geschwindigkeit/3.6)/10)*3;
		position += anhalteweg;
		return anhalteweg;
	}

}
