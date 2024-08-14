package com.example.web.model;

import java.util.Date;

public class Todo{

    private String user;

    private String title;

    private String content;

    private Date limit;

    public String getUser(){
        return user;
    }

    public void setUser(String user){
        this.user = user;
    }
    
    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
    
    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }
    
    public Date getLimit(){
        return limit;
    }

    public void setLimit(Date limit){
        this.limit = limit;
    }
    
}
