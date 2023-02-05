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

}
