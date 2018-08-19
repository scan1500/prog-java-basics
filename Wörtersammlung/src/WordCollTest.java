
public class WordCollTest
{
	public static void main(String[] args)
	{
		
		//String[] sentences = { "Thomas Mann, der j�ngere Bruder von Heinrich Mann (1871- 1950), war Sohn des Kaufmanns und L�becker Senators Thomas Johann Heinrich Mann.",
		//"Seine Mutter Julia (geborene da Silva-Bruhns) war m�tterlicherseits brasilianischer Herkunft. Aus der Ehe gingen noch die Kinder " };
		
		
		String[] sentences = { "Thomas Mann , der j�ngere",
		"Bruder von Heinrich Mann" };
		
		WordColl wordcoll = new WordColl(sentences);
		
		wordcoll.toString();
		
		System.out.println("Gr��e der Sammlung: " + wordcoll.size());

		System.out.println("Anzahl \"Mann\" : " + wordcoll.count("Mann"));
		
		System.out.println(wordcoll.top());
		
		wordcoll.append("LaLeLiLoLu");
		
		wordcoll.toString();
	}
}
