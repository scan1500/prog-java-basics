
public class Sparkonto extends Konto {
	
	public Sparkonto(int kontoStand)throws KontoException  {
		super(kontoStand);
		if (kontoStand <= 0 )
			throw new KontoException();
	}
	
	public void auszahlen (int betrag) throws KontoException {
		if ((this.kontoStand - betrag ) >= 0)
		{
			super.auszahlen(betrag);
			this.setChanged();
			this.notifyObservers();
		}
		else
			throw new KontoException();
	}
	
	public void einzahlen(int betrag) throws KontoException
	{
		if (betrag < 0)
			throw new KontoException();
		oldKontoStand = kontoStand;
		kontoStand += betrag;
		this.setChanged();
		this.notifyObservers();
		
	}
	
}
