package model;

import java.util.Objects;
import java.util.List;
public class Book {
    private String title;
    private String ISBN;
    private String publisher;
    private int year;
    private List<Author> author; //assume each book only has one author

    //need a constructor, setters, getters, and hash functions

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year &&
                Objects.equals(title, book.title) &&
                Objects.equals(ISBN, book.ISBN) &&
                Objects.equals(publisher, book.publisher) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, ISBN, publisher, year, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", author='" + author + '\'' +
                '}';
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public List<Author> getAuthor() {
        return author;
    }

    //go to generate, and you can create a constructor
    public Book(String title, String ISBN, String publisher, int year, List<Author> author) {
        this.title = title;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.year = year;
        this.author = author;
    }
}
