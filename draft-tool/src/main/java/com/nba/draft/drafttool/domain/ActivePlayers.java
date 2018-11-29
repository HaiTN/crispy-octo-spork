package com.nba.draft.drafttool.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ActivePlayers {

    @JsonProperty("playerentry")
    private List<PlayerEntry> playerEntryList;
}
