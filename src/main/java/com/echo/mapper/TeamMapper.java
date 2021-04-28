package com.echo.mapper;

import com.echo.pojo.Team;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TeamMapper {
    public List<Team> findTeamByType(@Param("type") Integer type);
}
