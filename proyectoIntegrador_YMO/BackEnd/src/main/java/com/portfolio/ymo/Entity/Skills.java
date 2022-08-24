package com.portfolio.ymo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skills {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int id;
    private String img;
    private int descripcionS;


    public Skills() {
    }

    public Skills(String img, int descripcionS) {
        this.img = img;
        this.descripcionS = descripcionS;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getDescripcionS() {
        return descripcionS;
    }

    public void setDescripcionS(int descripcionS) {
        this.descripcionS = descripcionS;
    }
    
}