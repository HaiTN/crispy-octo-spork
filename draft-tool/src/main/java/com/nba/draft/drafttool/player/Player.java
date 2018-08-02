package com.nba.draft.drafttool.player;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Player {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String position;
    private Integer rank;

    public Player() {}

    public Player(String firstName, String lastName, String position, Integer rank) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.rank = rank;
    }


}