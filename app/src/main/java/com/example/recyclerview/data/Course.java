package com.example.recyclerview.data;

public class Course {
    static int currentIdCount = 0;
    private int id;
    private int image;
    private String title;

    // Not in database
    private int numberOfWords = 0;

    public Course(int id, int image, String title) {
        this.id = id;
        this.image = image;
        this.title = title;
    }

    public Course(int image, String title) {
        this.id = currentIdCount++;
        this.image = image;
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfWords() {
        return numberOfWords;
    }

    public void setNumberOfWords(int numberOfWords) {
        this.numberOfWords = numberOfWords;
    }
}