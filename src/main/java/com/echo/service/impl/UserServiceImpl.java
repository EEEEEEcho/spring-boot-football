package com.echo.service.impl;

import com.echo.mapper.UserMapper;
import com.echo.pojo.UserInfo;
import com.echo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserInfo getUserByName(String username) {
        return userMapper.getUserByName(username);
    }

    @Override
    public void insertUser(UserInfo userInfo) {
        userInfo.setId(UUID.randomUUID().toString().replace("-",""));
        userInfo.setRole("custom");
        System.out.println(userInfo);
        userMapper.insertUser(userInfo);
    }

    @Override
    public Integer countUsername(String username) {
        return userMapper.countUsername(username);
    }

    @Override
    public List<UserInfo> findAll() {
        return userMapper.findAll();
    }

    @Override
    public void deleteUserByUserName(String username) {
        userMapper.deleteUserByUserName(username);
    }

    @Override
    public void updateUser(UserInfo userInfo) {
        userMapper.updateUser(userInfo);
    }
}
