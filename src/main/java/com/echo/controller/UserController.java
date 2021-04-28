package com.echo.controller;

import com.echo.pojo.UserInfo;
import com.echo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/findAll")
    public String findAll(Model model){
        List<UserInfo> all = userService.findAll();
        model.addAttribute("users",all);
        return "user_list";
    }

    @GetMapping("/delete/{username}")
    public String deleteUser(@PathVariable("username") String username){
        userService.deleteUserByUserName(username);
        return "redirect:/user/findAll";
    }

    @GetMapping("/update/{username}")
    public String updateUser(@PathVariable("username")String username,Model model){
        UserInfo user = userService.getUserByName(username);
        model.addAttribute("user",user);
        return "user_update";
    }

    @PostMapping("/doUpdate")
    public String doUpdate(UserInfo userInfo){
        userService.updateUser(userInfo);
        return "redirect:/user/findAll";
    }
}
