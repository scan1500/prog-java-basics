
public class PersonTest
{
	public static void main(String[] args)
	{
		Student aStudent = new Student("Peter", "M�ller", "Hauptstrasse", "4a", 96450, "Coburg", 455555, 1000 );
		Dozent aDozent = new Dozent("Hans", "Meyer", "Jenaerstrasse", "21", 96450, "Coburg", "Betriebssysteme", 1000 );
		
		Person[] personArray = new Person[2];
		
		personArray[0] = aStudent;
		personArray[1] = aDozent;
		
		//Vollst�ndige Ausgabe
		for(Person p : personArray)
			System.out.println(p);
		
		//Gehalt Ausgabe
		for(Person p : personArray)
			System.out.println(p.gehalt);
	}
}
