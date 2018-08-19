
public class Ort<E>
{
	E element;
	int ortsId;
	
	public Ort (int ortsId)
	{
		this.ortsId = ortsId;
	}
	
	public int getOrtsId()
	{
		return ortsId;
	}
	
	public void hinzufuegen(E e)
	{
		this.element = e;
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
		if(element == null)
		{
			return false;
		}
		return true;
	}
	
	public String toString()
	{
		return "ID: " + ortsId + ", Element: " + element;
	}
}
