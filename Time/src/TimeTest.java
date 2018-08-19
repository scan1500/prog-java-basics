import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class TimeTest
{

	public static void main(String[] args)
	{
		Time time1 = new Time(23,59,55);
		Scanner sc = new Scanner(System.in);
		Timer timer = new Timer();

		// Time time1 = new Time(23,59,00);
		// Time time2 = new Time(time1);
		// Time time3 = new Time();

		// System.out.println("Time1: " + time1.toString());

		// time1.incrementMinute();

		// System.out.println("Time1: " + time1.toString());

		// System.out.println("Time2: " + time2.toString());
		// System.out.println("Time3: " + time3.toString());
		
		
		timer.schedule(new Sekundenzaehler(), 0, 1000);

	}

} // end class TimeTest
