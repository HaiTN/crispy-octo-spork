package com.nba.draft.drafttool.web;

import com.nba.draft.drafttool.client.PlayerClient;
import com.nba.draft.drafttool.domain.ActivePlayers;
import com.nba.draft.drafttool.domain.Player;
import com.nba.draft.drafttool.domain.PlayerPosition;
import com.nba.draft.drafttool.jparepository.PlayerJpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class PlayerController {
    private PlayerJpaRepository playerJpaRepository;
    private PlayerClient playerClient;

    public PlayerController(PlayerJpaRepository playerJpaRepository, PlayerClient playerClient) {
        this.playerJpaRepository = playerJpaRepository;
        this.playerClient = playerClient;
    }

    @GetMapping("/players/good-players")
    @CrossOrigin(origins = "http://localhost:3000")
    public Collection<Player> goodPlayers() {
        return playerJpaRepository.findAll().stream()
                .filter(this::isGreat)
                .collect(Collectors.toList());
    }

    @GetMapping("/players/all-players")
    @CrossOrigin(origins = "http://localhost:3000")
    public ArrayList<Player> allPlayers() {
        return new ArrayList<>(playerJpaRepository.findAll());
    }

    @GetMapping("/players/bitch-players")
    @CrossOrigin(origins = "http://localhost:3000")
    public Collection<Player> getBitchPlayers() {
        return playerJpaRepository.findAll().stream()
                .filter(this::isBitch)
                .collect(Collectors.toList());
    }

    @GetMapping("/players/get-players")
    @CrossOrigin(origins = "http://localhost:3000")
    public String getActivePlayers() {
        return playerClient.fetchPlayers();
    }

    private boolean isGreat(Player player) {
        return player.getFirstName().equals("Lebron") || player.getRank().equals(1) || player.getPlayerPosition().equals(PlayerPosition.C);
    }

    private boolean isBitch(Player player) {
        return player.getFirstName().equals("Kevin") && player.getLastName().equals("Durant");
    }
}