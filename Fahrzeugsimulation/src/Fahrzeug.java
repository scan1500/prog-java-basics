
public class Fahrzeug
{
	double anhalteweg;
	double beschleunigung;
	double position;
	double geschwindigkeit;
	double hoechstgeschwindigkeit;
	String name;
	
	public Fahrzeug(double beschleunigung, double position, double geschwindigkeit, double hoechstgeschwindigkeit, String name)
	{
		this.beschleunigung = beschleunigung;
		this.position = position;
		this.geschwindigkeit = geschwindigkeit;
		this.hoechstgeschwindigkeit = hoechstgeschwindigkeit;
		this.name = name;
	}
	
	public double beschleunigen(double sekunden)
	{
		//Als Resultat wird die Position des Fahrzeugs in KM zurückgeliefert.
		if((beschleunigung * sekunden) >= (hoechstgeschwindigkeit*1000)/3600)
		{	//Hoechstgeschwindigkeit wird erreicht
			
			double sekundenBisHoechst = ((hoechstgeschwindigkeit*1000)/3600)/beschleunigung; 
			//Sekunden bis zur Hoechstgeschwindigkeit
			//Danach mit konstanter Geschwindigkeit weiter fahren.
			
			position = position + (0.5*(beschleunigung)*(Math.pow(sekundenBisHoechst, 2)));
			
			sekunden = sekunden - sekundenBisHoechst;
			
			//Mit Hoechstgeschwindigkeit weiterfahren
			geschwindigkeit = hoechstgeschwindigkeit;
			fahren(sekunden/60);
			return position;
			
		}
		else
		{//Hoechstgeschwindigkeit wird nicht erreicht
			geschwindigkeit = (beschleunigung * sekunden)*3.6;
			position = position + (0.5*(beschleunigung)*(Math.pow(sekunden, 2)));
			return position;
		}
	}
	
	public double hoechstGeschwindgkeit()
	{
		return hoechstgeschwindigkeit;
	}
	
	public double fahren(double minuten)
	{
		position = position + (minuten*60)*((geschwindigkeit*1000)/3600);
		return position;
	}
	
	public String toString()
	{
		return "Name: " + name + ", Geschwindigkeit: " + geschwindigkeit + " km/h, Position: " + position/1000 + " km";
	}
	
	public double stoppen()
	{
		return 0;
	}
	
}
