package com.nba.draft.drafttool;

import com.nba.draft.drafttool.domain.Player;
import com.nba.draft.drafttool.domain.Team;
import com.nba.draft.drafttool.jparepository.PlayerJpaRepository;

import com.nba.draft.drafttool.domain.PlayerPosition;
import com.nba.draft.drafttool.jparepository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final PlayerJpaRepository playerJpaRepository;
    private final TeamRepository teamRepository;

    @Autowired
    public DatabaseLoader(PlayerJpaRepository playerJpaRepository, TeamRepository teamRepository) {
        this.playerJpaRepository = playerJpaRepository;
        this.teamRepository = teamRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
//        this.playerJpaRepository.save(new Player("Yao", "Ming", PlayerPosition.C, 5));
//        this.playerJpaRepository.save(new Player("Kevin", "Love", PlayerPosition.PF, 6));
//        this.playerJpaRepository.save(new Player("Lebron", "James", PlayerPosition.SF, 2));
//        this.playerJpaRepository.save(new Player("Kevin", "Durant", PlayerPosition.SF, 50));
//        this.playerJpaRepository.save(new Player("Damian", "Lillard", PlayerPosition.PG, 1));
//        this.playerJpaRepository.save(new Player("Javale", "McGee", PlayerPosition.C, 3));
//
//        this.teamRepository.save(new Team("Hai's Team", 1));
//        this.teamRepository.save(new Team("Eric's Team", 2));
    }
}