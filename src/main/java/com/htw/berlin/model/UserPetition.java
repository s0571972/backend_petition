package com.htw.berlin.model;


import jakarta.persistence.*;

@Entity
public class UserPetition {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long id;

    private String firstName;
    private String lastName;

    private String email;


    public UserPetition() {

    }
    public UserPetition(Long id, String firstName) {

        this.id = id;
        this.firstName = firstName;

    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

