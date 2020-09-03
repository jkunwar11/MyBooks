package model;

import java.util.Objects;

//This is from feature B

public class Author {
    private String name;
    private int numOfBooks;
    private String nationality;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return numOfBooks == author.numOfBooks &&
                Objects.equals(name, author.name) &&
                Objects.equals(nationality, author.nationality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numOfBooks, nationality);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", numOfBooks=" + numOfBooks +
                ", nationality='" + nationality + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfBooks() {
        return numOfBooks;
    }

    public void setNumOfBooks(int numOfBooks) {
        this.numOfBooks = numOfBooks;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Author(String name, int numOfBooks, String nationality) {
        this.name = name;
        this.numOfBooks = numOfBooks;
        this.nationality = nationality;
    }
}
