
public class Schiff 
{
	int iSchiffslaenge;
	//Standardkonstruktor
	public cSchiff(int iUebergabe_Laenge)
	{
		iSchiffslaenge = iUebergabe_Laenge;
	}
	
	
	//Schiffsl�nge festlegen
	public void setGroesse(int iUebergabe)
	{
		iSchiffslaenge = iUebergabe;
	}
	
	//Schiffsl�nge auslesen
	public int getGroesse()
	{
		return iSchiffslaenge;
	}
	
}

