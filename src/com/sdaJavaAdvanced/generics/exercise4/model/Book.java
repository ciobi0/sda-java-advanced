package com.sdaJavaAdvanced.generics.exercise4.model;

public class Book implements Media {
    private String name;
    private String author;
    private int nbrOfPages;
    private String bookGenre;

    public Book(String name, String author, int nbrOfPages, String bookGenre) {
        this.name = name;
        this.author = author;
        this.nbrOfPages = nbrOfPages;
        this.bookGenre = bookGenre;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    public int getNbrOfPages() {
        return nbrOfPages;
    }

    public String getBookGenre() {
        return bookGenre;
    }
}
