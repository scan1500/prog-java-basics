import java.util.Arrays;
import java.util.Comparator;

public class WriterCastingsTest
{
	public static void main(String[] args)
	{

		Comparator<Integer> comp = (zahl1, zahl2) -> zahl1.compareTo(zahl2);

		Writer w1;
		Drucker d1;
		PipedWriter p1;
		Writer w2;// = new Writer(); //Fehler: Von abstrakten Klassen können keien Objekte erzeugt werden!
		DateiWriter da = new DateiWriter();
		DruckerWriter d2;// = new Drucker(); //Fehler: Von einem Interface kann kein Objekt erzeugt werden außerdem Type mismatch.
		PipedWriter p2 = new PipedWriter();
		
		
		w2 = da; //Geht da Writer eine Mutterklasse von DateiWriter ist.
		w1 = (Writer) da; //Geht da Writer eine Mutterklasse von DateiWriter ist. (explz. typecast erlaubt)
		p1 = p2; //Geht da gleicher Typ.
		//p2 = (PipedWriter) w1; //Geht NICHT: ClassCastException, da Writer eine Mutterklasse von PipedWriter ist.
		//In general, you cannot cast parents classes to children classes. Is like forcing to cast an Animal to a Dog. A Dog is an animal, 
		//but the other way is not always true, so Java compiler will not allow you to do that.
		
		d2 = new DruckerWriter(); //Geht natürlich
		d1 = d2; // Geht: When you define a new interface, you are defining a new reference data type. 
		//You can use interface names anywhere you can use any other data type name. If you define a reference variable whose type is an interface, 
		//any object you assign to it must be an instance of a class that implements the interface.
		//p2 = d2; //Geht NICHT, Type mismatch
		w1.write("Testausgabe in Datei"); //Geht da DateiWriter alle ELemente von Writer kennt, wurde gecastet.
		d2.druckenAbbrechen(); //Geht natürlich
	}

}

abstract class Writer
{
	public abstract void write(String s);
}

interface Drucker
{
	public void druckenAbbrechen();
}

class DateiWriter extends Writer
{
	public void write(String s)
	{
	};
}

class DruckerWriter extends Writer implements Drucker
{
	public void write(String s)
	{
	};

	public void druckenAbbrechen()
	{
	};
}

class PipedWriter extends Writer
{
	public void write(String s)
	{
	};
}
