package com.sdaJavaAdvanced.generics.exercise4.repository;

import com.sdaJavaAdvanced.generics.exercise4.model.Media;

import java.util.ArrayList;
import java.util.List;

public class MediaRepository <T extends Media>{
    protected List<T> mediaItems = new ArrayList<>();
    public void addMedia (T item){mediaItems.add(item);}
    public T getMediaByName(String name){
        for (T item : mediaItems){
            if (item.getName().equals(name)){
                return item;
            }
        }
        return null;
    }
    public T getMediaByAuthor (String author){
        for (T item : mediaItems){
            if (item.getAuthor().equals(author)){
                return item;
            }
        }
        return null;
    }

    public List<T> getMediaItems() {
        return mediaItems;
    }
}
