
public class Ort<E>
{
	E element;
	int ortsId;

	public Ort(int ortsId)
	{
		this.ortsId = ortsId;
	}

	public int getOrtsId()
	{
		return ortsId;
	}

	public void hinzufuegen(E e)
	{
		if (!istBelegt())
		{
			this.element = e;
		}
	}

	public void entnehmen()
	{
		element = null;
	}

	public E getEingelagertesElement()
	{
		return element;
	}

	public boolean istBelegt()
	{
		if (element == null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public String toString()
	{
		return "" + element;
	}
	
}
