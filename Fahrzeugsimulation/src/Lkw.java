
public class Lkw extends Fahrzeug
{
	double ladung = 0;
	double maxLadung;
	double bremsverzoegerung = 5.0;

	public void beladen(double ladungInTonnen)
	{
		ladung = ladung + ladungInTonnen;
		if(istVollBeladen())
			bremsverzoegerung = 3.0;
		else
			bremsverzoegerung = 5.0;
	}
	
	void entladen(double ladungInTonnen)
	{
		ladung = ladung - ladungInTonnen;
		if(istVollBeladen() == false)
			bremsverzoegerung = 5.0;
		else
			bremsverzoegerung = 3.0;
	}
	
	public boolean istVollBeladen()
	{
		if(ladung >= maxLadung)
			return true;
		else
			return false;
	}
	
	public Lkw(double beschleunigung, double position, double geschwindigkeit, double hoechstgeschwindigkeit,
			String name, double maxLadung)
	{
		super(beschleunigung, position, geschwindigkeit, hoechstgeschwindigkeit, name);
		this.maxLadung = maxLadung;
		// TODO Auto-generated constructor stub
	}

	public double stoppen()
	{
		anhalteweg = 0.5*(Math.pow((geschwindigkeit*1000)/3600,2)/bremsverzoegerung) + ((geschwindigkeit*1000)/3600/10)*3;
		position += anhalteweg;
		return anhalteweg;
	}
}
