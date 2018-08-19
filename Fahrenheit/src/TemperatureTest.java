
public class TemperatureTest
{
	public static void main(String[] args)
	{
		Temperature temp1 = new Temperature();
		
		System.out.println(temp1.toCelsius(10));
		System.out.println(temp1.toFahrenheit(16.5f));
		
	}
}
