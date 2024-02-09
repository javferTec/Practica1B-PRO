package com.fpmislata.dawprogeval2prac1.business.entity;

public class Book {
    private int id;
    private String title;
    private String author;
    private String summary;
    private String image = "no-image.png";
    public Book() {}

    public Book(int id, String title, String author, String summary, String image) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.summary = summary;
        this.image = image;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getSummary() {
        return summary;
    }
    public String getImage() {
        return image;
    }
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", summary='" + summary + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
