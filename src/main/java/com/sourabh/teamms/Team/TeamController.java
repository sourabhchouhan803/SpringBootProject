package com.sourabh.teamms.Team;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamController {

    private TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }
   // default one used while /teams
    @GetMapping
    public List<Team> getAllTeams(){

        return teamService.getAllTeams();
    }

     @PutMapping("/{id}")
    public String updateTeam(@PathVariable Long id , @RequestBody Team team){

        Boolean b= teamService.updateTeam(id, team);
        if(b){

            return "succes";
        }else{
            return "failed";
        }

     }

     @PostMapping("/create")
    public String CreateTeam(@RequestBody Team team){

        teamService.createTeam(team);

        return "success";
     }

}
