


public class Jeans extends Kleidungsst�ck{ 
	
	private static String  typId="567407";
	protected int schrittl�nge;

	
	public static String typNummer() {
		return typId;
	}
	
	public Jeans(int groesse, Farbe f, String bezeichnung, int schrittl�nge) {
		super(groesse,f,bezeichnung);
		artNr = typId + super.groesse;
	}
	
	public String artikelNummer() {
		return artNr;
	}

	public String toString() {
		return artNr +  " " + super.toString();
	}
}
