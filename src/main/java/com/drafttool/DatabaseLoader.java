package com.drafttool.crispyoctospork;

import com.drafttool.domain.Player;
import com.drafttool.domain.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final PlayerRepository repository;

    @Autowired
    public DatabaseLoader(PlayerRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Player("Lebron", "James", 2));
    }
}