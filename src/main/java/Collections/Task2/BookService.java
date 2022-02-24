package Collections.Task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class BookService {
    private final List<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void removeBook(Book book) {
        bookList.remove(book);
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public List<Book> getFantasyBooks() {
        return bookList.stream()
                .filter(book -> book.getGenre().equals(Genre.FANTASY))
                .collect(Collectors.toList());
    }

    public List<Book> getReleasedBefore(int year) {
        return bookList.stream()
                .filter(book -> book.getYearOfRelease() < year)
                .collect(Collectors.toList());
    }

    public Book getMostExpensiveBook() {
        return bookList.stream()
                .max(Comparator.comparing(Book::getYearOfRelease))
                .orElseThrow(NoSuchElementException::new);
    }

    public Book getCheapestBook() {
        return bookList.stream()
                .min(Comparator.comparing(Book::getPrice))
                .orElseThrow(NoSuchElementException::new);
    }

    public Book getBookWrittenByThreeAuthors() {
        for (Book book : bookList
        ) {
            if (book.getAuthors().size() == 3) {
                return book;
            }
        }
        return null;
    }

    public boolean isBookOnTheList(Book book){
         return bookList.contains(book);
    }

    public List<Book> getListOfBooksWrittenBySpecificAuthor(Author author){
        return bookList.stream()
                .filter(book -> book.getAuthors().contains(author))
                .collect(Collectors.toList());
    }
}
