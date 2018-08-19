
public class Karte implements Comparable<Karte>
{
	public static enum Farbe {Karo, Herz, Pik, Kreuz };
	public static enum Wert {Sieben, Acht, Neun, Zehn, Bauer, Dame, Koenig, Ass};

	public Farbe f;
	public Wert w;
	
	public Karte(Farbe f, Wert w)
	{
		this.f = f;
		this.w = w;
	}
	
	public String toString()
	{
		return ("Karte: " + f.toString() + ", " + w.toString());
	}

	@Override
	public int compareTo(Karte k)
	{
		if(k.f.ordinal() > this.f.ordinal())
			return -1;
		else if(k.f.ordinal() < this.f.ordinal())
			return 1;
		else
			return 0;
	}
}
