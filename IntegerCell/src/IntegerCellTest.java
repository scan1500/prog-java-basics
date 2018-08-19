
public class IntegerCellTest
{
	public static void main(String[] args)
	{
		Collection coll = new Collection(30);

		System.out.println(coll.isEmpty());

		coll.insert(new IntegerCell(5));

		System.out.println(coll.isEmpty());

		coll.remove(new IntegerCell(5));

		System.out.println(coll.isEmpty());
	}
}
