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
    @JsonProperty("playerId")
    private Integer playerId;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("teamId")
    private String teamId;
    @Nullable
    private String position;
    @Nullable
    private Integer rank;
}