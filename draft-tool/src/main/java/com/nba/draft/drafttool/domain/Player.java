package com.nba.draft.drafttool.domain;

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
    private PlayerPosition playerPosition;
    private Integer rank;

    public Player() {}

    public Player(String firstName, String lastName, PlayerPosition playerPosition, Integer rank) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.playerPosition = playerPosition;
        this.rank = rank;
    }


}