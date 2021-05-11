package com.echo.controller;

import com.echo.pojo.Match;
import com.echo.pojo.Player;
import com.echo.pojo.Team;
import com.echo.service.MatchService;
import com.echo.service.PlayerService;
import com.echo.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
@RequestMapping("/football")
public class FootballController {
    @Autowired
    private PlayerService playerService;
    @Autowired
    private TeamService teamService;
    @Autowired
    private MatchService matchService;

    @GetMapping("/player/{type}")//RestFul风格，
    public String getAllPlayers(@PathVariable("type") Integer type, Model model){
        List<Player> players = playerService.findAllPlayerByType(type);
        model.addAttribute("players",players);
        model.addAttribute("type",type);
        return "player_list";
    }

    @GetMapping("/api/player/{type}")
    @ResponseBody
    public List<Player> getPlayerDataJson(@PathVariable("type")Integer type){
        return playerService.findAllPlayerByType(type);
    }

    @GetMapping("/team/{type}")
    public String getAllTeams(@PathVariable("type")Integer type,Model model){
        List<Team> teams = teamService.findTeamByType(type);
        model.addAttribute("teams",teams);
        model.addAttribute("type",type);
        return "team_list";
    }

    @GetMapping("/api/team/{type}")
    @ResponseBody
    public List<Team> getAllTeamsJson(@PathVariable("type")Integer type){
        return teamService.findTeamByType(type);
    }
    @GetMapping("/match/{type}")
    public String getAllMatches(@PathVariable("type")Integer type,Model model){
        List<Match> matches = matchService.findAllMatchesByType(type);
        model.addAttribute("matches",matches);
        model.addAttribute("type",type);
        return "match_list";
    }

    @GetMapping("/api/match/{type}")
    @ResponseBody
    public List<Map<String,Integer>> getMatchDate(@PathVariable("type")Integer type){
        Map<String, Integer> matchDate = matchService.getMatchDate(type);
        List<Map<String,Integer>> result = new ArrayList<>();
        Collection<String> keySet = matchDate.keySet();
        List<String> keySetList = new ArrayList<>(keySet);
        Collections.sort(keySetList);
        for (String key : keySetList){
            HashMap<String,Integer> hashMap = new HashMap<>();
            hashMap.put(key,matchDate.get(key));
            result.add(hashMap);
        }
        return result;
    }


}
