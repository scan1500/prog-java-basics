import java.util.Observable;

public class Radio extends Observable
{
	double frequency = 0;
	int volume = 0;
	boolean power = false;

	public Radio(int volume, double frequency)
	{
		this.volume = volume;
		this.frequency = frequency;
	}

	public void chooseSender(double frequency)
	{
		if (power)
		{
			this.frequency = frequency;
			this.setChanged();
			this.notifyObservers();
		}
	}

	public void on()
	{
		if (!power)
		{
			power = true;
			this.setChanged();
			this.notifyObservers();
		}
	}

	public void off()
	{
		if (power)
		{
			power = false;
			this.setChanged();
			this.notifyObservers();
		}
	}

	public void volumeMinus()
	{
		if (volume > 0 && power)
		{
			volume--;
			this.setChanged();
			this.notifyObservers();
		}
	}

	public void volumePlus()
	{
		if (volume < 25 && power)
		{
			volume++;
			this.setChanged();
			this.notifyObservers();
		}
	}

	public String toString()
	{
		String statusCode = power ? "on" : "off";
		return "Status: " + statusCode + ", Freq.: " + frequency + ", Vol.: " + volume;
	}

}
