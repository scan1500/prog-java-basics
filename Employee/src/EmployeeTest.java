
public class EmployeeTest
{
	public static void main(String[] args)
	{	
		Employee employee1 = new Employee("Andreas", "Schwarzmann");
		System.out.println(employee1.toString());
		
		Employee employee2 = new Employee("Heinz", "Michel");
		System.out.println(employee2.toString());
		
		Employee employee3 = new Employee("Gustav", "Gans");
		System.out.println(employee3.toString());
	}
}
