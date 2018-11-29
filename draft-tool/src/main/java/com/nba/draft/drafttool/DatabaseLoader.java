package com.nba.draft.drafttool;

import com.nba.draft.drafttool.domain.Player;
import com.nba.draft.drafttool.jparepository.PlayerJpaRepository;

import com.nba.draft.drafttool.jparepository.TeamRepository;
import com.nba.draft.drafttool.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class DatabaseLoader implements CommandLineRunner {

    @Autowired
    private PlayerJpaRepository playerJpaRepository;

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private PlayerService playerService;

    @Override
    public void run(String... strings) throws Exception {
        List<Player> playerList = new ArrayList<>(playerService.getAllPlayers());
        playerList.forEach(player -> playerJpaRepository.save(player));
    }
}