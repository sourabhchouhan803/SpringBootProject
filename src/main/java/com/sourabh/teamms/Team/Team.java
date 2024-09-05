package com.sourabh.teamms.Team;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Team {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
   private Long id;
   private String name;
   private String category;


   // one team can have many player's
 // mapped by will get rid of team+player table in db



  // private List<Review>reviews;
    public Team() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    }
