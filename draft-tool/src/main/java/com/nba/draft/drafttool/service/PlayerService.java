package com.nba.draft.drafttool.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nba.draft.drafttool.client.PlayerClientImpl;
import com.nba.draft.drafttool.domain.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class PlayerService {
    @Autowired
    private PlayerClientImpl playerClient;

    public Collection<Player> getAllPlayers() throws Exception {
        return Stream.of(playerResponse()).collect(Collectors.toList());
    }

    private Player[] playerResponse() throws Exception {
        return new ObjectMapper().readValue(playerClient.fetchNewPlayers(), Player[].class);
    }
}
