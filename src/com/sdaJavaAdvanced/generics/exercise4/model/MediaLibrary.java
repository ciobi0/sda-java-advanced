package com.sdaJavaAdvanced.generics.exercise4.model;

public class MediaLibrary implements Media {
    private String name;
    private String author;

    public MediaLibrary(String name, String author) {
        this.name = name;
        this.author = author;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAuthor() {
        return author;
    }
}
