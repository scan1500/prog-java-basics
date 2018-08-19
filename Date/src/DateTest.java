
public class DateTest
{
	public static void main(String[] args)
	{

		
		Date date1 = new Date(21,2,1992);
		Date date2 = new Date("Februar", 21, 1992);
		Date date3 = new Date(2, 1992);
		
		
		System.out.println(date1.toString());
		System.out.println(date2.toString());
		System.out.println(date3.toString());
	}
}
