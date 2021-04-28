package com.echo.service;

import com.echo.pojo.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    public UserInfo getUserByName(String username);

    public void insertUser(UserInfo userInfo);

    public Integer countUsername(String username);

    public List<UserInfo> findAll();

    public void deleteUserByUserName(String username);

    public void updateUser(UserInfo userInfo);
}
