package com.echo.controller;

import com.echo.pojo.UserInfo;
import com.echo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @GetMapping("/toLogin")
    public String login(){
        return "login_football";
    }

    @GetMapping("/toRegister")
    public String register(){
        return "register_football";
    }

    @PostMapping("/toInsert")
    public String insert(UserInfo userInfo){
        System.out.println(userInfo);
        userService.insertUser(userInfo);
        return "redirect:/toLogin";
    }

    @GetMapping("/checkUsername/{username}")
    @ResponseBody
    public Map<String,Integer> checkUsername(@PathVariable("username") String username){
        Integer integer = userService.countUsername(username);
        Map<String,Integer> map = new HashMap<>();
        map.put("count",integer);
        return map;
    }
}
