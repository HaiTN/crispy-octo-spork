package com.nba.draft.drafttool.client;

import com.nba.draft.drafttool.domain.PlayerResource;

public interface PlayerClient {
    PlayerResource fetchPlayers();
    String fetchNewPlayers();
}
