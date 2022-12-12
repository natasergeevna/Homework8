public class Book {
    String name;
    Autor autor;
    int year;

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

    public int setYearBook(int year) {
        this.year = year;
        return this.year;
    }

    public String getAutor() {
        return autor.nameAutor + " " + autor.surnameAutor;
    }

}
