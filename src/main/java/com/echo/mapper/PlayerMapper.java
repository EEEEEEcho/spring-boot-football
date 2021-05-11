package com.echo.mapper;

import com.echo.pojo.Player;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface PlayerMapper {
    //Mybatis
    public List<Player> findAllPlayerByType(@Param("type") Integer type);
}
