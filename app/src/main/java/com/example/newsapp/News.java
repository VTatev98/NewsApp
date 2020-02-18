package com.example.newsapp;

public class News {

    private String title;
    private String author;
    private String date;
    private int seenCount;
    private String description;

    public News(String title, String author, String date, int seenCount, String description) {
        this.title = title;
        this.author = author;
        this.date = date;
        this.seenCount = seenCount;
        this.description = description;
    }

    public News() {
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getSeenCount() {
        return seenCount;
    }

    public void setSeenCount(int seenCount) {
        this.seenCount = seenCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
