package com.sourabh.teamms.Team;

import java.util.List;

public interface TeamService {

    List<Team>getAllTeams();
    Boolean updateTeam(Long id , Team team);
    Boolean createTeam(Team team);

}
