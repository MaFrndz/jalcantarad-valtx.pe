package com.finnegansfact.finnegans_chile.Util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
 
    // @Override
    // protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    // 	PasswordEncoder encoder = 
    //       PasswordEncoderFactories.createDelegatingPasswordEncoder();
    // 	auth
    //       .inMemoryAuthentication()
    //       .withUser("user")
    //       .password(encoder.encode("password"))
    //       .roles("USER");
    // }
    // @Autowired
    // private SeguridadServiceImpl serv;
    // @Autowired
    // private  FilterToken jwt;

    // @Override
    // protected void configure(AuthenticationManagerBuilder auth) throws Exception {        
    //     auth.userDetailsService(serv).passwordEncoder(NoOpPasswordEncoder.getInstance());
    // }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        // http.csrf().disable().authorizeRequests().antMatchers("/**/token").permitAll()
        //         .anyRequest().authenticated().and()
        //         .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        // FilterToken jwt = new FilterToken();
        // http.addFilterBefore(jwt, UsernamePasswordAuthenticationFilter.class);
    }
    
    
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/v2/api-docs/**");
        web.ignoring().antMatchers("/swagger.json");
        web.ignoring().antMatchers("/swagger-ui.html");
        web.ignoring().antMatchers("/swagger-resources/**");
        web.ignoring().antMatchers("/webjars/**");
    }
}