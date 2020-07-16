package com.example.recyclerview.data;

public class Setting {
    private int image;
    private String title;
    private String meaning;

    public Setting(int image, String title, String meaning) {
        this.image = image;
        this.title = title;
        this.meaning = meaning;
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

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
}
