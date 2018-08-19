
public class FahrzeugSimulation
{
	public static void main(String[] args)
	{
		/*
		Pkw pkw1 = new Pkw(2.0, 0.0, 0.0, 160.0, "BMW");
		Pkw pkw2 = new Pkw(2.0, 0.0, 0.0, 160.0, "Mercedes");
		Pkw pkwOabs = new Pkw(2.0, 0.0, 0.0, 140.0, "Audi");
		Lkw lkw = new Lkw(0.5, 0.0, 0.0, 105.0, "MAN", 300);
		
		pkw1.beschleunigen(15);
		pkw2.beschleunigen(15);
		pkwOabs.beschleunigen(15);
		lkw.beschleunigen(30);
		
		System.out.println(pkw1.toString());
		System.out.println(pkw2.toString());
		System.out.println(pkwOabs.toString());
		System.out.println(lkw.toString());
		
		System.out.println("-----------");
		
		pkw1.fahren(20); //45 Sekunden
		pkw2.fahren(20);
		pkwOabs.fahren(20);
		lkw.fahren(20); //30 Sekunden
		
		System.out.println(pkw1.toString());
		System.out.println(pkw2.toString());
		System.out.println(pkwOabs.toString());
		System.out.println(lkw.toString());
		
		System.out.println("-----------");
		
		Pkw pkw3 = new Pkw(2.0, 0.0, 0.0, 160.0, "BMW");
		Pkw pkwOabs1 = new Pkw(2.0, 0.0, 0.0, 140.0, "Audi");
		
		pkw3.beschleunigen(30);
		pkwOabs1.beschleunigen(30);
		
		System.out.println("Bremsweg:");
		System.out.println(pkw3.stoppen());
		System.out.println(pkwOabs1.stoppen());
		
		Lkw lkwNichtBeladen = new Lkw(0.5, 0.0, 0.0, 105.0, "MAN", 200);
		Lkw lkwBeladen = new Lkw(0.5, 0.0, 0.0, 105.0, "MAN", 500);
		
		lkwBeladen.beladen(10);

		lkwNichtBeladen.beschleunigen(10);
		lkwBeladen.beschleunigen(10);
		
		System.out.println("Bremsweg (LKWs):");
		System.out.println(lkwNichtBeladen.stoppen());
		System.out.println(lkwBeladen.stoppen());
		
		*/
		//---------------------------------------------------------
		

		Pkw auto1 = new Pkw(2.0, 0.0, 0.0, 160.0, "VWGOLF");
		PkwOAbs auto2 = new PkwOAbs(2.0, 0.0, 0.0, 160.0, "TRABBI");
		Pkw auto3 = new Pkw(2.0, 0.0, 0.0, 160.0, "BMW");
		Lkw laster1 = new Lkw(0.5, 0.0, 0.0, 105.0, "MAN", 500);
		Lkw laster2 = new Lkw(0.5, 0.0, 0.0, 105.0, "MEZZEDES", 200);
		
		auto1.beschleunigen(60);
		auto2.beschleunigen(15);
		auto3.beschleunigen(120);
		laster1.beschleunigen(90);
		laster2.beladen(200);
		laster2.beschleunigen(90);

		System.out.println(auto1);
		System.out.println(auto2);
		System.out.println(auto3);
		System.out.println(laster1);
		System.out.println(laster2);
		System.out.println();

		auto1.fahren(20);
		auto2.fahren(20);
		auto3.fahren(20);
		laster1.fahren(20);
		laster2.fahren(20);

		System.out.println(auto1);
		System.out.println(auto2);
		System.out.println(auto3);
		System.out.println(laster1);
		System.out.println(laster2);
		System.out.println();

		auto1.stoppen();
		auto2.stoppen();
		auto3.stoppen();
		System.out.println(laster1.stoppen());
		System.out.println(laster2.stoppen());

		System.out.println(auto1);
		System.out.println(auto2);
		System.out.println(auto3);
		System.out.println(laster1);
		System.out.println(laster2);
		System.out.println();

		
		
	}
}
