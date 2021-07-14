package com.sdaJavaAdvanced.generics.exercise4.model;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Media book1 = new Book("Inception", "Arthur C.", 220, "S.F.");
        Media book2 = new Book("Blue eye", "Penelope C.", 421, "Romance");
        Media video1 = new Video("top gun", "Steven S.", 2.55, "movie");
        Media newspaper1=new Newspaper("times","ldd international",16,"Happiness");
        MediaLibrary mediaLibrary = new MediaLibrary();
        mediaLibrary.setMedia(book1);
        mediaLibrary.setMedia(book2);
        mediaLibrary.setMedia(video1);
        mediaLibrary.setMedia(newspaper1);
        for (Media media : mediaLibrary.getMediaList()) {
            System.out.println("" + media.getClass().getSimpleName() + ": " + media.getAuthor() + " - " + media.getName());
        }
    }
}
