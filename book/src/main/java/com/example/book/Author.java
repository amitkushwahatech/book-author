package com.example.book;

public class Author {
    private String authorName;
    private String gender;
    private int age;
    private int ratingAuthor;

    public Author(String authorName, String gender, int age, int ratingAuthor) {
        this.authorName = authorName;
        this.gender = gender;
        this.age = age;
        this.ratingAuthor = ratingAuthor;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRatingAuthor() {
        return ratingAuthor;
    }

    public void setRatingAuthor(int ratingAuthor) {
        this.ratingAuthor = ratingAuthor;
    }

    public Author() {
    }
}
