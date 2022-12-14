public class Book {
    private String name;
    private Autor autor;
    private int year;

    public Book(String name, Autor autor, int year) {
        this.name = name;
        this.year = year;
        this.autor = autor;
    }

    public String getNameBook() {
        return name;
    }

    public  int getYearBook() {
        return year;
    }

    public void setYearBook(int year) {
        this.year = year;
    }

    public String getAutor() {
        return autor.nameAutor + " " + autor.surnameAutor;
    }

    public String toString() {
        return "Книга: " + name + " год: " + year + autor.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        if (year != book.year) return false;
        if (!autor.equals(autor)) return false;
        return name.equals(book.name);
    }

    public int hashCode() {
        return java.util.Objects.hash(name, year, autor.hashCode());
    }

}
