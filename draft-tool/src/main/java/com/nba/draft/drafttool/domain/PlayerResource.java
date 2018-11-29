package com.nba.draft.drafttool.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PlayerResource {

    @JsonProperty("activeplayers")
    private ActivePlayers activePlayers;
}
