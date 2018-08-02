package com.nba.draft.drafttool.player;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class PlayerController {
    private PlayerRepository playerRepository;

    public PlayerController(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @GetMapping("/good-players")
    @CrossOrigin(origins = "http://localhost:3000")
    public Collection<Player> goodPlayers() {
        return playerRepository.findAll().stream()
                .filter(this::isGreat)
                .collect(Collectors.toList());
    }

    @GetMapping("/all-players")
    @CrossOrigin(origins = "http://localhost:3000")
    public ArrayList<Player> allPlayers() {
        return new ArrayList<>(playerRepository.findAll());
    }

    private boolean isGreat(Player player) {
        return player.getFirstName().equals("Lebron") || player.getRank().equals(1) || player.getPlayerPosition().equals(PlayerPosition.C);
    }
}