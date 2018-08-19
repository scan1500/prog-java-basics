
public class Person
{
	String vorname;
	String nachname;
	String strasse;
	String ort;
	String hausnr;
	int plz;
	float gehalt;
	
	public String toString()
	{
		return vorname +" "+ nachname +" "+ strasse +" "+ ort +" "+ hausnr +" "+ plz +" "+ gehalt; 
	}
	
	public float gehalt() 
	{
		return gehalt;
	}
	
}
