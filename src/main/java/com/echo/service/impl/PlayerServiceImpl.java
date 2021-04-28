package com.echo.service.impl;

import com.echo.mapper.PlayerMapper;
import com.echo.pojo.Player;
import com.echo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {
    @Autowired
    private PlayerMapper playerMapper;

    @Override
    public List<Player> findAllPlayerByType(Integer type) {
        return playerMapper.findAllPlayerByType(type);
    }
}
