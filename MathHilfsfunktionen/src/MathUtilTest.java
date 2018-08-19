import java.util.Arrays;

public class MathUtilTest
{
	public static void main(String[] args)
	{
		for(String[] row : MathUtil.intAsteriks(5))
				System.out.println(Arrays.toString(row));
	}
}
