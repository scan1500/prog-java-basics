import java.util.Comparator;

public class BibliothekTest {
    public static void main(String[] args)
    {
        Bibliothek bib = new Bibliothek();

        Buch book1 = new Buch("Berndi", "99999", "Das Haus");
        Buch book2 = new Buch("Andi", "12345", "Der Baum");
        Buch book3 = new Buch("Ceasar", "454545", "Die Orange");
        Buch book4 = new Buch("Ceasar", "234567", "Der Apfel");
        Buch book5 = new Buch("Ceasar", "543216", "Die Banane");

        Comparator<Buch> cAutor = (b1, b2) -> b1.autor.compareTo(b2.autor);
        Comparator<Buch> cTitel = (b1, b2) -> b1.titel.compareTo(b2.titel);
        Comparator<Buch> cIsbn = (b1, b2) -> b1.isbn.compareTo(b2.isbn);
    
        bib.einfügen(book1);
        bib.einfügen(book2);
        bib.einfügen(book3);
        bib.einfügen(book4);
        bib.einfügen(book5);

        System.out.println(bib);

        System.out.println(bib.sucheNachAutor("Andi"));
        System.out.println(bib.sucheNachISBN("99999"));

        System.out.println("Sortiert nach Autor: " + bib.bestandSortierenNach(cAutor));
        System.out.println("Sortiert nach ISBN: " + bib.bestandSortierenNach(cIsbn));
        System.out.println("Sortiert nach Titel: " + bib.bestandSortierenNach(cTitel));

        System.out.println();

        System.out.println(bib.bestandNachAutor());


    }

}
