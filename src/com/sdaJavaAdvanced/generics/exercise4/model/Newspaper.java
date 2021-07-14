package com.sdaJavaAdvanced.generics.exercise4.model;

public class Newspaper implements Media{
   private String name;
   private String author;
   private int nbrPages;
   private String mainArticle;
   public Newspaper(String name, String author, int nbrPages, String mainArticle){
       this.name=name;
       this.author=author;
       this.nbrPages=nbrPages;
       this.mainArticle=mainArticle;
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
