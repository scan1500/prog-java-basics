
public class CountListTest
{
	public static void main(String[] args)
	{
		final CountList<Integer> cl = new CountList<Integer>();

		cl.add(2);
		cl.add(5);
		cl.add(2);
		cl.add(5);
		cl.add(3);
		System.out.println(cl.count(2)); // 2
		System.out.println(cl.unique()); // 3
		System.out.println(cl.counts()); //{2=2, 3=1, 5=2 }
	}
}
