package Exceptions.Task2;

import java.util.Objects;

public class Book {

    int id;
    String title;
    String author;
    int yearOfRelease;

    public Book(int id, String title, String author, int yearOfRelease) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return id == book.id && yearOfRelease == book.yearOfRelease && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }
}
