package com.drafttool.crispyoctospork;

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
    private Integer rank;

    private Player() { }

    public Player(String firstName, String lastName, Integer rank) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rank = rank;
    }
}
