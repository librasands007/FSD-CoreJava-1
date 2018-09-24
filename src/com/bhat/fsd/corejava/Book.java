package com.bhat.fsd.corejava;

import java.io.Serializable;
import java.time.LocalDate;

public class Book implements Serializable{

	private static final long serialVersionUID = 1L;
	private long bookId;
    private String title;
    private Double price;
    private int volume;
    private LocalDate publishDate;

    public Book(){

    }
    public Book(long id, String title, Double priceToSet, int vol, LocalDate dt){
        this.bookId = id;
        this.title = title;
        this.price = priceToSet;
        this.volume = vol;
        this.publishDate = dt;
    }
   public long getBookId(){
       return this.bookId;
   } 
   public void setBookId(long id){
       this.bookId = id;
   }
    public void setTitle(String t){
       this.title = t;
    }
    public String getTitle(){
        return this.title;
    }
    public Double getPrice(){
        return this.price;
    }
    public void setPrice(Double p){
        this.price =  p;
    }
    public int getVolume(){
        return this.volume;
    }
    public void setVolume(int v){
        this.volume = v;
    }
    public LocalDate getPublishDate(){
        return this.publishDate;
    }
    public void setPublishDate(LocalDate dt){
        this.publishDate = dt;
    }
}