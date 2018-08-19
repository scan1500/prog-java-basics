import java.util.TimerTask;

class Sekundenzaehler extends TimerTask
{
	
	Time time1 = new Time(23,59,55);
	
	@Override
	public void run()
	{	
		time1.tick();
		System.out.println(time1.toString());
	}
}