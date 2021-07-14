package com.sdaJavaAdvanced.generics.exercise4.model;

import java.util.ArrayList;
import java.util.List;

public class MediaLibrary {

    private List<Media> mediaList=new ArrayList<>();
    private Media media;


    public List<Media> getMediaList() {
        return mediaList;
    }

    public void setMediaList(List<Media> mediaList) {
        this.mediaList = mediaList;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
        mediaList.add(media);
    }
}
