package com.nba.draft.drafttool.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ActivePlayers {
    @JsonProperty("activeplayers")
    private PlayerEntry playerEntry;
}
