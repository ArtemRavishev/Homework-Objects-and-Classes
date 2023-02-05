package ObjectsAndClasses;

import java.util.Objects;

public class Book {

    private String titleOfTheBook;
    private Author author;
    private int yearOfPublication;

    public  Book (String titleOfTheBook, Author author, int yearOfPublication) {
        this.titleOfTheBook = titleOfTheBook;
        this.author = author;
        this.yearOfPublication=yearOfPublication;
    }

    public String getTitleOfTheBook() {
        return titleOfTheBook;
    }
    public void setTitleOfTheBook(String titleOfTheBook) {
        this.titleOfTheBook = titleOfTheBook;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public int getYearOfPublication() {
        return yearOfPublication;

    }
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;

    }

    @Override
    public String toString(){
        return "Название книги - " + this.titleOfTheBook  + this.author + ", Год издания - " + this.yearOfPublication + " год.";

    }


    @Override
    public int hashCode() {
        return Objects.hash(titleOfTheBook, author, yearOfPublication);
    }
}
