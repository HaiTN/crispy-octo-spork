package com.nba.draft.drafttool;

import com.nba.draft.drafttool.player.Player;
import com.nba.draft.drafttool.player.PlayerRepository;

import com.nba.draft.drafttool.player.PlayerPosition;
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
        this.playerRepository.save(new Player("Yao", "Ming", PlayerPosition.C, 5));
        this.playerRepository.save(new Player("Kevin", "Love", PlayerPosition.PF, 6));
        this.playerRepository.save(new Player("Lebron", "James", PlayerPosition.SF, 2));
        this.playerRepository.save(new Player("Kevin", "Durant", PlayerPosition.SF, 50));
        this.playerRepository.save(new Player("Damian", "Lillard", PlayerPosition.PG, 1));
        this.playerRepository.save(new Player("Javale", "McGee", PlayerPosition.C, 3));
    }
}