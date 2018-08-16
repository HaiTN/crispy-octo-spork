package com.nba.draft.drafttool.web;

import com.nba.draft.drafttool.domain.Team;
import com.nba.draft.drafttool.jparepository.TeamRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TeamController {
    private TeamRepository teamRepository;

    public TeamController(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @GetMapping("/teams/all-teams")
    @CrossOrigin(origins = "http://localhost:3000")
    public ArrayList<Team> getAllTeams() {
        return new ArrayList<>(teamRepository.findAll());
    }

    @GetMapping("/teams/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public Team getTeamById(@PathVariable("id") String id) {
        return teamRepository.getOne(Long.parseLong(id));
    }
}
