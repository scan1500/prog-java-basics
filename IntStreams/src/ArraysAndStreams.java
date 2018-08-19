import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArraysAndStreams
{
	
	void irgendwas()
	{
		
	}
	
	public static void main(String[] args) {
		Integer[] values = { 2, 9, 5, 0, 3, 7, 1, 4, 8, 6 };
		// display original values
		
		int[] intValues = { 2, 9, 5, 0, 3, 7, 1, 4, 8, 6 };
		
		//Mit IntStream-Funktionen
		
		IntStream.of(intValues).sorted().forEach(i -> System.out.print(i + " "));
		
		System.out.println();
		
		IntStream.of(intValues).filter(p -> p > 4).forEach(i -> System.out.print(i + " "));
		
		System.out.println();
		
		IntStream.of(intValues).sorted().filter(p -> p > 4).forEach(i -> System.out.print(i + " "));
		
		System.out.println();
		

		
		
		
		
		System.out.printf("Original values: %s%n", Arrays.asList(values));
		
		// Ausgabe aller Werte von values in aufsteigender Reihenfolge

		
		System.out.printf("Sortiert Aufsteigend: %s%n", Arrays.asList(values).stream().sorted((z1, z2) -> z1 - z2).collect(Collectors.toList()));
		System.out.printf("Sortiert Absteigend: %s%n", Arrays.asList(values).stream().sorted((z1, z2) -> z2 - z1).collect(Collectors.toList()));
		
		
		// Ausgabe aller Werte in values, die größer als 4 sind
		
		System.out.printf("Werte größer 4: %s%n", Arrays.asList(values).stream().filter(z -> z > 4).collect(Collectors.toList()));

		// Filtern von allen Werten in values, die größer als 4 sind, und // sortierte diese anschließend
	
		
		System.out.printf("Werte größer 4 und sortiert: %s%n", Arrays.asList(values).stream().filter(z -> z > 4).sorted((z1, z2) -> z1 - z2).collect(Collectors.toList()));
		}
} 

