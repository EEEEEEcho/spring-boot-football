package com.echo.service;

import com.echo.pojo.Match;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface MatchService {
    public List<Match> findAllMatchesByType(Integer type);

    public Map<String,Integer> getMatchDate(Integer type);
}
