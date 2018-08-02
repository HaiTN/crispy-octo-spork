package com.nba.draft.drafttool.player;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class PlayerController {
    private PlayerRepository playerRepository;

    public PlayerController(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @GetMapping("/good-players")
    public Collection<Player> goodPlayers() {
        return playerRepository.findAll().stream()
                .filter(this::isGreat)
                .collect(Collectors.toList());
    }

    private boolean isGreat(Player player) {
        return player.getFirstName().equals("Lebron") || player.getRank().equals(1);
    }
}