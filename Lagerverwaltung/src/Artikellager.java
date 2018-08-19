public class Artikellager<E>
{
	Ort<E>[] orte;

	@SuppressWarnings("unchecked")
	public Artikellager(int AnzahlOrte)
	{
		orte = new Ort[AnzahlOrte];

		for (int i = 0; i < orte.length; i++)
		{
			orte[i] = new Ort<E>(i);
		}
	}

	public boolean einlagern(E e)
	{
		for (Ort<E> o : orte)
		{
			if (o.istBelegt() == false)
			{
				o.hinzufuegen(e);
				return true;
			}
		}
		return false;
	}

	public E auslagern(String artikelnummer)
	{
		for (Ort<E> o : orte)
		{
			if (o.getEingelagertesElement().toString().contains(artikelnummer))
			{
				o.entnehmen();
				return o.getEingelagertesElement();
			}
		}
		return null;
	}

	public int bestandSuchen(String artikelnummer)
	{
		int counter = 0;
		for (Ort<E> o : orte)
		{
			if (o.istBelegt() && o.getEingelagertesElement().toString().contains(artikelnummer))
			{
				counter++;
			}
		}
		return counter;
	}

	public String toString()
	{
		String ausgabe = new String();

		for (Ort<E> o : orte)
		{
			if (o.istBelegt())
				ausgabe += o.toString() + "\n";
		}
		return ausgabe;
	}
}
