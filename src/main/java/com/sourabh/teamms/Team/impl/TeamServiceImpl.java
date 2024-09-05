package com.sourabh.teamms.Team.impl;


import com.sourabh.teamms.Team.Team;
import com.sourabh.teamms.Team.TeamRepo;
import com.sourabh.teamms.Team.TeamService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service

public class TeamServiceImpl implements TeamService {



    private TeamRepo teamRepo;

    public TeamServiceImpl(TeamRepo teamRepo) {
        this.teamRepo = teamRepo;
    }

    @Override
    public List<Team> getAllTeams() {
        return teamRepo.findAll();
    }

    @Override
    public Boolean updateTeam(Long id, Team team) {
        Optional<Team> teamOptional = teamRepo.findById(id);

        if(teamOptional.isPresent()){

            Team t= teamOptional.get();
            t.setName(team.getName());
            t.setCategory(team.getCategory());

            teamRepo.save(t);

            return true;
        }

        return false;
    }

    @Override
    public Boolean createTeam(Team team) {
        teamRepo.save(team);

        return true;
    }
}
