
public abstract class Kleidungsst�ck implements Artikel
{
	enum Farbe
	{
		SCHWARZ, GR�N, ROT, BLAU, GRAU
	};

	protected final int groesse;
	protected final Farbe farbe;
	protected String bezeichnung;
	protected String artNr;

	protected Kleidungsst�ck(int groesse, Farbe f, String bezeichnung)
	{
		this.farbe = f;
		this.groesse = groesse;
		this.bezeichnung = bezeichnung;
	}

	public String bezeichnung()
	{
		return this.bezeichnung;
	}

	public int getGroesse()
	{
		return groesse;
	}

	public Farbe getFarbe()
	{
		return farbe;
	}

	public String toString()
	{
		return "" + bezeichnung + " " + groesse + " " + farbe;

	}

}
