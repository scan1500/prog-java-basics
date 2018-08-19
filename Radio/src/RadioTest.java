public class RadioTest
{
	public static void main(String[] args)
	{
		Radio radio = new Radio(0, 0.0);
		RadioObserver ro = new RadioObserver(radio);
	
		radio.on();
		
		for (int i = 0; i < 5; i++)
			radio.volumePlus();

		radio.chooseSender(223.5);

		System.out.println(radio);
	}
}
