
public class Person
{
	private final String firstName;
	private String lastName;
	private final int age;

	public Person(String f, String l, int a)
	{
		firstName = f;
		lastName = l;
		age = a;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public String toString()
	{
		return firstName + " " + lastName + " " + age;
	}
}
