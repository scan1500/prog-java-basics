
public class Employee
{
	String firstName="";
	String lastName="";
	static int counter;
	
	public Employee(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		counter++;
	}
	
	public int getCount()
	{
		return counter;
	}
	
	public String getFirstname()
	{
		return firstName;
	}
	
	public String getLastname()
	{
		return lastName;
	}
	
	public void setFirstname(String firstName)
	{
		this.firstName = firstName;
	}
	
	public void setLastname(String lastName)
	{
		this.lastName = lastName;
	}
	
	public String toString()
	{
		return "ID"+getCount() + " " + getFirstname() + " " + getLastname();
	}
}
