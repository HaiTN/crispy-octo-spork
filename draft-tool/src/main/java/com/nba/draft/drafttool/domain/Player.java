package com.nba.draft.drafttool.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.elasticsearch.common.Nullable;

@Data
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Player {

    @Id
    @GeneratedValue
    private Long id;

    @JsonProperty("FirstName")
    private String firstName;

    @JsonProperty("LastName")
    private String lastName;

    @Nullable
    private PlayerPosition playerPosition;

    @Nullable
    private Integer rank;

    public Player() {}

    public Player(String firstName, String lastName, PlayerPosition playerPosition, Integer rank) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.playerPosition = playerPosition;
        this.rank = rank;
    }
}