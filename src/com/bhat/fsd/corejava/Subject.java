package com.bhat.fsd.corejava;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Subject implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private long subjectId;
    private String subtitle;
	private int durationInHours; 
	private Set<Book> references =  new HashSet<Book>();

    public Subject(long id, String title, int duration, Set<Book>ref){
        this.subjectId = id;
        this.subtitle = title;
        this.durationInHours = duration;
        this.references = ref;
    }

    public long getSubjectId(){
        return this.subjectId;
    }

    public void setSubjectId(long id){
        this.subjectId = id;
    }

    public String getSubtitle(){
        return this.subtitle;
    }
    public void setSubtitle(String newTitle){
        this.subtitle = newTitle;
    }
    public int getDurationInHours(){
        return this.durationInHours;
    }
    public void setDurationInHours(int t){
        this.durationInHours = t;
    }
   
    public Set<Book> getReferences(){
        return this.references;
    }
    public void setReferences(Set<Book> newRef){
        this.references = newRef;
    }


}