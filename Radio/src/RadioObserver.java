import java.util.Observable;
import java.util.Observer;

public class RadioObserver implements Observer
{
	public RadioObserver(Radio r)
	{
		r.addObserver(this);
	}

	@Override
	public void update(Observable sender, Object object)
	{
		//Radio r2 = (Radio) sender;
		//Neues Objekt erstellen, damit Zugriff auf geupdatete Daten möglich ist
		System.out.println(sender);
	}
}
