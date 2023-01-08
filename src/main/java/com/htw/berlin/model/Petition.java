package com.htw.berlin.model;


import jakarta.persistence.*;

import java.sql.Date;
import java.util.Set;

@Entity
public class Petition {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    public String getPetitionName() {
        return petitionName;
    }

    public void setPetitionName(String petitionName) {
        this.petitionName = petitionName;
    }

    public String getPetitionTheme() {
        return petitionTheme;
    }

    public void setPetitionTheme(String petitionTheme) {
        this.petitionTheme = petitionTheme;
    }

    public Date getPetitionDate() {
        return petitionDate;
    }

    public void setPetitionDate(Date petitionDate) {
        this.petitionDate = petitionDate;
    }

    public int getPetitionDuration() {
        return petitionDuration;
    }

    public void setPetitionDuration(int petitionDuration) {
        this.petitionDuration = petitionDuration;
    }

    private String petitionName;
    private String petitionTheme;
    private Date petitionDate;
    private int petitionDuration;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    private  int userId;

    public Petition() {

    }
    public Petition(Long id, String name) {

        this.id = id;
        this.petitionName = name;

    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }



}

