package com.echo.config;

import com.echo.service.impl.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//AOP
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private CustomUserDetailsService customUserDetailsService;
    //定制授权规则
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //请求授权的规则，必须要有管理员权限才可以访问
        http.authorizeRequests().antMatchers("/user/**").hasRole("admin")
                .antMatchers("/football/**").hasAnyRole("custom","admin")
        .antMatchers("/index.html").hasAnyRole("custom","admin")
        .antMatchers("/").hasAnyRole("custom","admin")
        .antMatchers("/toRegister").permitAll()
        .antMatchers("/toInsert").permitAll();

        //在前面的antMatchers中所匹配的，没有权限会到登录页面,需要开启登录的页面，并自定义登录页面
        http.formLogin().loginPage("/toLogin").
                usernameParameter("username").     //前端传递过来的input框中的 name 一定要和这里的一样！！
                passwordParameter("password").  //否则根本无法校验 就会报错 <input type="text" class="form-control" placeholder="手机号" name="phone">
                loginProcessingUrl("/login");   //                        <input type="password" class="form-control" placeholder="密码" name="password">
        //关闭csrf
        http.csrf().disable();
        //开启注销功能,注销后跳转到登录页
//        http.logout().logoutUrl("/login");
        http.logout().logoutSuccessUrl("/toLogin");
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    //定制认证规则
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //在Spring Security 5.0+中新增了很多的加密方法，用来将密码进行硬编码混淆
//        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
//                .withUser("root").password(new BCryptPasswordEncoder().encode("123456")).roles("custom","admin")
//                .and()
//                .withUser("echo").password(new BCryptPasswordEncoder().encode("123456")).roles("custom");
        //这些数据正常应该从数据库读
        //auth.jdbcAuthentication().withUser()
        auth.userDetailsService(customUserDetailsService).passwordEncoder(passwordEncoder());
    }
}
