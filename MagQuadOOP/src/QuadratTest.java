import java.util.Arrays;

public class QuadratTest
{
	public static void main(String[] args)
	{
		/*
		Quadrat quadrat1 = new Quadrat(5);
		
		quadrat1 = quadrat1.erzeugeMagicQuadrat(5);
		
		for(int[] zeile : quadrat1.quad)
			System.out.println(Arrays.toString(zeile));
		
		System.out.println();
		
		int[][] q = quadrat1.quad;
		
		Quadrat quadrat2 = new Quadrat(q);
		
		for(int[] zeile : quadrat2.quad)
			System.out.println(Arrays.toString(zeile));
		
		System.out.println(quadrat2.zeilenSumme(0));
		System.out.println(quadrat2.spaltenSumme(0));
		System.out.println(quadrat2.diagonalSummeOToU());
		System.out.println(quadrat2.diagonalSummeUToO());
		*/
		
		int[][] a1 = { {2,2,2,2}, {2,2,2,2}, {2,2,2,0},{2,2,2,2}};
		int[][] a2 = { {2,2,2,2}, {2,2,2,2}, {2,2,2,2},{2,2,2,2}};
		int[][] a3 = { {2,7,6}, {9,5,1}, {4,3,8,}};
		int[][] a4 = { {2,3,3,4}, {2,2,5,2}, {5,7,2,2},{4,7,9,2}};
		int[][] a5 = { {1,3,3,1}, {3,2,2,2}, {5,3,3,2},{4,7,9,4}};
		
		Quadrat q1 = new Quadrat(a1);
		Quadrat q2 = new Quadrat(a2);
		Quadrat q3 = new Quadrat(a3);
		Quadrat q4 = new Quadrat(a4);
		Quadrat q5 = new Quadrat(a5);
		
		System.out.println(q3.diagonalSummeOToU());
		System.out.println(q5.zeilenSumme(1));
		System.out.println(q4.diagonalSummeUToO());
		System.out.println(q1.spaltenSumme(3));
		
		
		System.out.println(q5.isMagic());
		
		Quadrat qMagisch = new Quadrat(5);
		
		qMagisch = qMagisch.erzeugeMagicQuadrat(5);
		
		System.out.println(qMagisch.isMagic());
	}
}
