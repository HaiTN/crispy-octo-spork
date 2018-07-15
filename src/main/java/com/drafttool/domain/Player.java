package com.drafttool.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Player {

    private @Id @GeneratedValue Long id;
    private String firstName;
    private String lastName;
    private Position position;
    private Integer rank;

    private Player() { }

    public Player(String firstName, String lastName, Position position, Integer rank) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.rank = rank;
    }
}
