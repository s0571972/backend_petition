package com.htw.berlin.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class UserPetitionPetition {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;


    public Long getId() {
        return id;
    }

    public String getFreeText() {
        return freeText;
    }

    public void setFreeText(String freeText) {
        this.freeText = freeText;
    }

    private String freeText;

    public void setId(Long id) {
        this.id = id;
    }
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private UserPetition userPetition;


    public UserPetition getUserPetition() {
        return userPetition;
    }

    @ManyToOne
    @JoinColumn(name="petition_id", nullable=false)
    private Petition petition;

    public Petition getPetition() {
        return petition;
    }

    public void setPetition(Petition petition) {
        this.petition = petition;
    }
}
