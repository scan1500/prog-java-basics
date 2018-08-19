import java.util.Vector;

public class PairTest
{
	public static void main(String[] args)
	{
		Vector<Pair<String, Integer>> vector = new Vector<Pair<String, Integer>>();
		
		vector.add(new Pair<String, Integer>("I", 1));
		vector.add(new Pair<String, Integer>("V", 5));
		vector.add(new Pair<String, Integer>("C", 100));
		vector.add(new Pair<String, Integer>("II", 2));
		vector.add(new Pair<String, Integer>("IX", 9));
		
		System.out.println(vector);
		
	}
}
