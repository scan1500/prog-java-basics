public class Jacke extends Kleidungsst�ck {
	
	private static String typId="777777";
	protected int wassersaeule;

	
	public static String typNummer() {
		return typId;
	}
	
	
	public Jacke(int groesse, Farbe f, String bezeichnung,int wassersaeule) {
		super(groesse,f,bezeichnung);
		this.wassersaeule = wassersaeule;
		this.artNr = typId + super.groesse;
	}
	
	public  String artikelNummer() {
		return this.artNr;
	}

	public String toString() {
		return "" + this.artNr + " " + super.toString() + " " + wassersaeule;
	}
	
	

}
