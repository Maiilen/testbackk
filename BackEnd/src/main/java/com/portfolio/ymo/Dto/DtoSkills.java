package com.portfolio.ymo.Dto;

import javax.validation.constraints.NotBlank;


public class DtoSkills {
    @NotBlank
    private String img;
    @NotBlank
    private int descripcionS;
    

    public DtoSkills() {
    }

    public DtoSkills(String img, int descripcionS) {
        this.img = img;
        this.descripcionS = descripcionS;
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