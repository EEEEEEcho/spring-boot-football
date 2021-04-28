package com.echo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/football")
public class HelloController {
    @GetMapping("/index")
    public String index(){
        return "index_football_back";
    }

    @GetMapping("/match")
    public String match(){
        return "match_list";
    }

    @GetMapping("/score")
    public String score(){
        return "team_list";
    }
    @GetMapping("/player")
    public String player(){
        return "player_list";
    }
}
