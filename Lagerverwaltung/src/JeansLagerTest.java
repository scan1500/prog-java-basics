

public class JeansLagerTest
{
	public static void main(String[] args)
	{
		Jeans j1 = new Jeans(36,Jeans.Farbe.SCHWARZ, "Jeans Levis 501",340);
		System.out.println(j1);
		// 567407361 schwarz Jeans Levis 501 340
		
		Jeans j2 = new Jeans(36,Jeans.Farbe.SCHWARZ, "Jeans Wrangler 50",380);
		System.out.println(j2);
		
		// 56740736 schwarz Jeans Wrangler 50 380
		Jacke jac = new Jacke(40,Jeans.Farbe.BLAU, "Fleece Jacke Roos",1000);
		System.out.println(jac);
		
		// 77777740 blau Fleece Jacke Roos 380
		
		
		Artikellager<Jeans> jeansLager = new Artikellager<Jeans>(10); 
		jeansLager.einlagern(j1); 
		jeansLager.einlagern(j2); 
		
		
		System.out.println(jeansLager.bestandSuchen("56740736")); 
		
		System.out.println(jeansLager);
		
		Jeans j = jeansLager.auslagern("56740736"); 
		System.out.println(jeansLager.bestandSuchen("56740736"));
		// 1

	}
}
