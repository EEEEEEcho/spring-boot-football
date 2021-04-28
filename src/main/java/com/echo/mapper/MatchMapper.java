package com.echo.mapper;

import com.echo.pojo.Match;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface MatchMapper {
    public List<Match> findAllMatchesByType(@Param("type")Integer type);
}
