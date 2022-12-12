public class Start {
    public Start() {
        Autor autor1 = new Autor("Alexander", "Pushkin");
        Book book1 = new Book("Eugene Onegin", autor1, 1833);

        Autor autor2 = new Autor("Lev", "Tolstoy");
        Book book2 = new Book("War and Peace", autor2, 1873);
        System.out.println("book: " + book1.getNameBook() + "\nautor: " + book1.getAutor() + "\nyear: " + book1.getYearBook() + "\n");
        System.out.println("book: " + book2.getNameBook() + "\nautor: " + book2.getAutor() + "\nyear: " + book2.getYearBook() + "\n");

        book2.setYearBook(1995);
        System.out.println("---Поменяем год выпуска у книги---");
        System.out.println("book: " + book2.getNameBook() + "\nautor: " + book2.getAutor() + "\nyear: " + book2.getYearBook() + "\n");
    }
}
