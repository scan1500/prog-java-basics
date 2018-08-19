import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("serial")
public class CountList<E> extends ArrayList<E>
{
	int count(E element)
	{
		int counter = 0;
		for(Object e : super.toArray())
		{
			if(e == element)
				counter++;
		}
		return counter;
	}
	
	public int unique()
	{
		int counter = 0;
		ArrayList<Integer> al = new ArrayList<>();
		
		for(Object e : super.toArray())
		{
			if(!al.contains(e))
				al.add((Integer) e);
		}
		return al.size();	
	}
	
	public Map<E, Integer> counts()
	{
		Map<E, Integer> map = new HashMap<E, Integer>();
		
		for(Object e : super.toArray())
		{
			if(!map.containsKey(e))
			{
				map.put((E) e, count((E) e));
			}
		}
		
		return map;
		
	}
}
