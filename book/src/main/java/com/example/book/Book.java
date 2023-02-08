package com.example.book;

public class Book {
    private String bookName;
    private String authorName;
    private int pageNo;
    private double ratingBook;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public double getRatingBook() {
        return ratingBook;
    }

    public void setRatingBook(double ratingBook) {
        this.ratingBook = ratingBook;
    }
public Book(){

}
    public Book(String bookName, String authorName, int pageNo, double ratingBook) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.pageNo = pageNo;
        this.ratingBook = ratingBook;
    }
}
