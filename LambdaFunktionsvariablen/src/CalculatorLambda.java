import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

import java.util.Scanner;

public class CalculatorLambda
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		IntBinaryOperator add = (a, b) -> a + b;
		IntBinaryOperator sub = (a, b) -> a - b;
		IntBinaryOperator mult = (a, b) -> a * b;
		IntBinaryOperator div = (a, b) -> a / b;
		IntUnaryOperator inc = (a) -> (++a);
		IntUnaryOperator dec = (a) -> (--a);
		
		System.out.print("Erste Zahl:");
		int zahl1 = sc.nextInt();
		System.out.print("Zweite Zahl");
		int zahl2 = sc.nextInt();
		
		System.out.println(zahl1 + " + " + zahl2 + " = " + add.applyAsInt(zahl1, zahl2));
		System.out.println(zahl1 + " - " + zahl2 + " = " + sub.applyAsInt(zahl1, zahl2));
		System.out.println(zahl1 + " * " + zahl2 + " = " + mult.applyAsInt(zahl1, zahl2));
		System.out.println(zahl1 + " / " + zahl2 + " = " + div.applyAsInt(zahl1, zahl2));
		System.out.println("Ink. erste Zahl: " + inc.applyAsInt(zahl1));
		System.out.println("Dek. zweite Zahl: " + dec.applyAsInt(zahl2));
		
		
	}
}
