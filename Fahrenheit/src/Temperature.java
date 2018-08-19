
public class Temperature
{
	static float toFahrenheit(float celsius)
	{
		return (float)(((9.0/5.0) * celsius) + 32);
	}
	
	static float toCelsius(float fahrenheit)
	{
		return (float)  (5.0 / 9.0) * (fahrenheit - 32);
	}
}
