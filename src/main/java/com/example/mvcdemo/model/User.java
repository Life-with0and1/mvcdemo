package com.example.mvcdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    private int id;

    private String name;
    private String email;

    public User(){
        this.id=id;
        this.email=email;
        this.name=name;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
