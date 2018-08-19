
public class Schiff 
{
	int iSchiffslaenge;
	//Standardkonstruktor
	public cSchiff(int iUebergabe_Laenge)
	{
		iSchiffslaenge = iUebergabe_Laenge;
	}
	
	
	//Schiffslänge festlegen
	public void setGroesse(int iUebergabe)
	{
		iSchiffslaenge = iUebergabe;
	}
	
	//Schiffslänge auslesen
	public int getGroesse()
	{
		return iSchiffslaenge;
	}
	
}

