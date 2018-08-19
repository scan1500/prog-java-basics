
public class UtilsTest
{
	public static void main(String[] args)
	{
		Integer[] keys = { 2000, 2, 99, 756, 999,0, 666, 2345, 7492, 22 };
		String[] article = { "the", "a ", "one ", "some ","anton","ymca" };
		
		Utils.print(keys);
		
		Utils.print(Utils.sort(keys));
		
		Utils.print(article);
		
		Utils.print(Utils.sort(article));
		
		System.out.println(Utils.noNull(null, 23, 45, 56, null));
		System.out.println(Utils.noNull()); 
		System.out.println(Utils.noNull(null, "Hello", "WoW"));
	}
}
