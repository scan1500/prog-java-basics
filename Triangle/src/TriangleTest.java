import java.util.Scanner;

public class TriangleTest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Triangle tri1 = new Triangle();
		
		System.out.println("a:");
		double a = sc.nextDouble();
		System.out.println("b:");
		double b = sc.nextDouble();
		
		System.out.println("c:" + tri1.hypothenuse(a, b));
	}
}
