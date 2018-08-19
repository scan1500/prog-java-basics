import java.util.Arrays;

public class CharacterUtilTest
{
	public static void main(String[] args)
	{
		char[] s = { 'S', 'O', 'R', 'T', 'B', 'Y'};
		char[] t = { 'B', 'U', 'B', 'B', 'L', 'E'};
		
		//Unvertauscht:
		
		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.toString(t));
		
		System.out.println();
		System.out.println(CharacterUtil.vertauscheRef(s, t));
		System.out.println();
		
		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.toString(t));
	}
}
