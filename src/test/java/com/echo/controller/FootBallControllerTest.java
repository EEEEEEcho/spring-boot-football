package com.echo.controller;

import com.echo.pojo.Team;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class FootBallControllerTest {

    @Autowired
    private FootballController footballController;

    @Test
    void testController(){
        List<Team> allTeamsJson = footballController.getAllTeamsJson(82);
        System.out.println(allTeamsJson);
    }
}
