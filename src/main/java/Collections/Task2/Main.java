package Collections.Task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookService();
        bookService.addBook(new Book("Hello", 125.90,1922, List.of(new Author("Kamil","Dróżdż",Gender.MALE),new Author("Michał","Dróżdż",Gender.MALE)),Genre.HISTORY));
        bookService.addBook(new Book("Odyseja", 325.90,1622, List.of(new Author("Kamil","Dróżdż",Gender.MALE),new Author("Michał","Dróżdż",Gender.MALE)),Genre.FANTASY));
        bookService.addBook(new Book("Biohacking", 225.90,1422, List.of(new Author("Kamil","Dróżdż",Gender.MALE),new Author("Michał","Dróżdż",Gender.MALE)),Genre.ACTION));
        bookService.addBook(new Book("Troja", 25.90,-2000, List.of(new Author("Kamil","Dróżdż",Gender.MALE),new Author("Michał","Dróżdż",Gender.MALE),new Author("Kamil","Dróżdż",Gender.MALE)),Genre.FANTASY));


        System.out.println(bookService.getBookWrittenByThreeAuthors());
    }
}
