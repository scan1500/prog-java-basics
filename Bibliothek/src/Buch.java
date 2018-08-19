public class Buch
{
    String autor;
    String isbn;
    String titel;

    public Buch(String autor, String isbn, String titel) {
        this.autor = autor;
        this.isbn = isbn;
        this.titel = titel;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getAutor()
    {
    	return autor;
    }

    public String toString() {
        return "Autor: " + autor + ", ISBN: " + isbn + ", Titel: " + titel;
    }
}
