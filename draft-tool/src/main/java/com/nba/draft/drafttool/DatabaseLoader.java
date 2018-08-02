package com.nba.draft.drafttool;

import com.nba.draft.drafttool.player.Player;
import com.nba.draft.drafttool.player.PlayerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final PlayerRepository playerRepository;

    @Autowired
    public DatabaseLoader(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.playerRepository.save(new Player("Lebron", "James", "SF", 2));
        this.playerRepository.save(new Player("Kevin", "Durant", "SF", 50));
        this.playerRepository.save(new Player("Damian", "Lillard", "PG", 1));
        this.playerRepository.save(new Player("Javale", "McGee", "C", 3));
    }
}