package com.echo.mapper;

import com.echo.pojo.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    public UserInfo getUserByName(@Param("username") String username);

    public void insertUser(UserInfo userInfo);

    public Integer countUsername(@Param("username") String username);

    public List<UserInfo> findAll();

    public void deleteUserByUserName(@Param("username") String username);

    public void updateUser(UserInfo userInfo);
}
