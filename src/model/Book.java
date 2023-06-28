package model;

public class Book implements Comparable<Book>{
    private String bookID;
    private String bookTitle;
    private String author;
    private int yearPublished;

    public Book(String bookID, String bookTitle, String author, int yearPublished) {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public Book() {
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String toString() {
        return "Book [ID: " + bookID + ", Title: " + bookTitle + ", Author: " + author + ", Year Published: " + yearPublished + "]";
    }

    @Override
    public int compareTo(Book o) {
        return 0;
    }
}
