
public class MobileTest
{
	public static void main(String[] args)
	{
		Star star2 = new Star(2);
		//Star star4 = new Star(4);
		GlitterStar glitzerstern = new GlitterStar(4);
		Star star10 = new Star(9);
		
		Wire subwire = new Wire(9, star2, glitzerstern);
		
		
		Wire mainwire = new Wire(10, subwire, star10 );
		
		mainwire.balance();
		System.out.println(subwire);
		System.out.println(mainwire);
		
		glitzerstern.decorate();
		
		subwire.balance();
		mainwire.balance();
		
		System.out.println(subwire);
		System.out.println(mainwire);
		
	}
}
