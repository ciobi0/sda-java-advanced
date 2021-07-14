package com.sdaJavaAdvanced.generics.exercise4.model;

public class Video implements Media{
    private String name;
    private String author;
    private double size;
    private String type;

    public Video(String name, String author, double size, String type){
        this.name=name;
        this.author=author;
        this.size=size;
        this.type=type;
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
