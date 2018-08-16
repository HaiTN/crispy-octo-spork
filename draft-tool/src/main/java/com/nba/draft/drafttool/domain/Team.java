package com.nba.draft.drafttool.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Team {

    @Id
    @GeneratedValue
    private Long id;
    private String teamName;
    private Integer draftPosition;

    public Team() {}

    public Team(String teamName, Integer draftPosition) {
        this.teamName = teamName;
        this.draftPosition = draftPosition;
    }
}
