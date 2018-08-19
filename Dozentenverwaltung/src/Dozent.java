
public class Dozent extends Person
{
	String lehrgebiet;
	
	public Dozent(String vorname, String nachname, String strasse, String hausnr, int plz, String ort, String lehrgebiet,
			int gehalt)
	{
		this.vorname = vorname;
		this.nachname = nachname;
		this.strasse = strasse;
		this.hausnr = hausnr;
		this.plz = plz;
		this.ort = ort;
		this.lehrgebiet = lehrgebiet;
		this.gehalt = gehalt;
	}
	
	public String toString()
	{
		return super.toString() +" "+ lehrgebiet;
	}
}
