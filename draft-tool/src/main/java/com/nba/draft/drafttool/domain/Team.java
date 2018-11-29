package com.nba.draft.drafttool.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Team {

    @Id
    @GeneratedValue
    private Long id;
    @JsonProperty("teamId")
    private Integer teamId;
    @JsonProperty("abbreviation")
    private String abbreviation;
    @JsonProperty("teamName")
    private String teamName;
    @JsonProperty("simpleName")
    private String simpleName;
    @JsonProperty("location")
    private String location;
}
