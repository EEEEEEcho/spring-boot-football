package com.echo.service;

import com.echo.pojo.Player;

import java.util.List;

public interface PlayerService {
    public List<Player> findAllPlayerByType(Integer type);
}
