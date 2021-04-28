package com.echo.service;

import com.echo.pojo.Team;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeamService {
    public List<Team> findTeamByType(Integer type);
}
