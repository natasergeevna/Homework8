public class Start {
    public Start() {
        Autor autor1 = new Autor("Alexander", "Pushkin");
        Book book1 = new Book("Eugene Onegin", autor1, 1833);

        Autor autor2 = new Autor("Lev", "Tolstoy");
        Book book2 = new Book("War and Peace", autor2, 1833);
        System.out.println(book1.toString());
        System.out.println(book2.toString());

        System.out.println(autor1.equals(autor2));
        System.out.println(book1.equals(book2));

        book2.setYearBook(1955);
        System.out.println("---Поменяем год выпуска у книги---");
        System.out.println(book2.toString());


    }
}
