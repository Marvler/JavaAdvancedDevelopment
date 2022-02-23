package Exceptions.Task2;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private final List<Book> listOfBooks = new ArrayList<>();

    public void addBook(Book book) {
        listOfBooks.add(book);
    }

    public void removeBook(Book book) {
        for (Book booky : listOfBooks) {
            if (book.equals(booky)) {
                listOfBooks.remove(book);
                return;
            }
        }
    }

    public void removeBookById(int id) throws BookNotFoundException {
        if (extracted(id)) {
            listOfBooks.removeIf(book -> book.getId() == id);
        } else {
            throw new BookNotFoundException(String.format("Book with name %d not found", id));
        }
    }

    public void searchByTitle(String title) throws BookNotFoundException {
        for (Book book : listOfBooks
        ) {
            if (book.getTitle().equals(title)) {
                System.out.println(book);
                return;
            }
        }
        throw new BookNotFoundException(String.format("Book with name %s not found", title));
    }

    public void searchById(int id) throws BookNotFoundException {
        if (!extracted(id)) {
            throw new BookNotFoundException(String.format("Book with name %d not found", id));
        }
    }

    private boolean extracted(int id) {
        for (Book book : listOfBooks
        ) {
            if (book.getId() == id) {
                System.out.println(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "BookRepository{" +
                "listOfBooks=" + listOfBooks +
                '}';
    }
}
