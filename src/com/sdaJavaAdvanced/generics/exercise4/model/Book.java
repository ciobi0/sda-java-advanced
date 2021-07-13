package com.sdaJavaAdvanced.generics.exercise4.model;

public class Book extends MediaLibrary{
    private int nbrOfPages;
    private String bookGenre;

    public Book(String name, String author, int nbrOfPages, String bookGenre) {
        super(name, author);
        this.nbrOfPages=nbrOfPages;
        this.bookGenre=bookGenre;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getAuthor() {
        return super.getAuthor();
    }

    public int getNbrOfPages() {
        return nbrOfPages;
    }

    public String getBookGenre() {
        return bookGenre;
    }
}
