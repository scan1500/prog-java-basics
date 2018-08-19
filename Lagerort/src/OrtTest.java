
public class OrtTest
{
	public static void main(String[] args)
	{
		Ort<String> ort1 = new Ort<String>(1);
		Ort<String> ort2 = new Ort<String>(2);
		Ort<String> ort3 = new Ort<String>(3);
		
		ort1.hinzufuegen("Holz");
		ort2.hinzufuegen("Metall");
		ort3.hinzufuegen("Stein");
		
		System.out.println(ort1);
		System.out.println(ort2);
		System.out.println(ort3);

		
		ort1.entnehmen();
		System.out.println(ort1.istBelegt());
		
		System.out.println(ort1);
		
		ort2.entnehmen();
		System.out.println(ort2.istBelegt());
	}
}
