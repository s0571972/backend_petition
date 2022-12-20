package com.htw.berlin.model;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class UserSignPetition {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    public void setPetition(Petition petition) {
        this.petitionItem = petition;
    }

    private Long userId;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="petitionId")
    private Petition petitionItem;

    public List<UserPetition> getUsers() {
        return userPetitions;
    }

    public void setUsers(List<UserPetition> userPetitions) {
        this.userPetitions = userPetitions;
    }

    @OneToMany
    @JoinColumn(name="user_id", referencedColumnName="userId", nullable = false)
    private List<UserPetition> userPetitions;

    public UserSignPetition() {

    }
    public UserSignPetition(Long id, Long userId, Long petitionId) {

        this.id = id;


    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /*
    public Long getPetition() {
        return petitionId;
    }

     */

    public Petition getPetitionItem() {
        return petitionItem;
    }
    /*
    public void setPetition(Long petition) {
        this.petitionId = petition;
    }
    *
     */
}

