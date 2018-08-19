
public class Student extends Person
{
	int matrikelnr;

	public Student(String vorname, String nachname, String strasse, String hausnr, int plz, String ort, int matrikelnr,
			int gehalt)
	{
		this.vorname = vorname;
		this.nachname = nachname;
		this.strasse = strasse;
		this.hausnr = hausnr;
		this.plz = plz;
		this.ort = ort;
		this.matrikelnr = matrikelnr;
		this.gehalt = gehalt;
	}

	
	public String toString()
	{
		return super.toString() +" "+ matrikelnr;
	}
}
