package com.echo.service.impl;

import com.echo.pojo.UserInfo;
import com.echo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 要从数据库读取用户信息进行身份认证需要实现UserDetailService接口并重写loadUserByUserName
 */
@Component
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserService userService;

    /* 需要新建配置类注册一个指定的加密方式bean,或在下一步security配置类中注册指定 */
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfo user = userService.getUserByName(username);
        if (user == null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        //用户角色
        String role = user.getRole();

        //角色集合
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_" + role));
        return new User(user.getUsername(),passwordEncoder.encode(user.getPassword()),authorities);
    }
}
