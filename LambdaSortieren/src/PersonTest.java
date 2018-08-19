import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;

public class PersonTest
{
	public static void main(String... args)
	{
		Person[] people = new Person[]
		{ 
				new Person("Ted", "Neward", 41), 
				new Person("Charlotte", "Neward", 41), 
				new Person("Michael", "Neward", 19),
				new Person("Matthew", "Neward", 13), 
				new Person("Adam", "Pfeiffer", 43) 
		};

		ArrayList<Person> persList = new ArrayList<>(Arrays.asList((people)));
		System.out.println("Unsortiert: " + persList);


		//Verwendung eines Comparators ohne Lambda Anweisung
		Comparator<Person> c1 = new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getFirstName().compareTo(p2.getFirstName());
			}
		};
		Collections.sort(persList, c1);

		System.out.println("Sort/Normal: " + persList);

		//Verwundung eines Comparators mittels Lambda Anweisung
		Comparator<Person> c2 = (p1 ,p2) -> p1.getFirstName().compareTo(p2.getFirstName());
		Collections.sort(persList, c2);

		System.out.println("Sort/Lambda: " + persList);

	}
}
