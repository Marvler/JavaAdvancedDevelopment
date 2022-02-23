package Exceptions.Task2;

public class Main {

    public static void main(String[] args) throws BookNotFoundException {
        Book book1 = new Book(12, "Lord of the rings", "Tolkien", 1990);
        Book book2 = new Book(5, "Hobbit", "Tolkien", 1978);
        Book book3 = new Book(3, "Silmarillion", "Tolkien", 1988);
        Book book4 = new Book(3, "Silmarillion", "Tolkien", 1988);

        BookRepository bookRepository = new BookRepository();
        bookRepository.addBook(book1);
        bookRepository.addBook(book2);
        bookRepository.addBook(book3);

        bookRepository.removeBookById(12);
        System.out.println(bookRepository);
        bookRepository.removeBook(book4);
        System.out.println(bookRepository);

    }
}
