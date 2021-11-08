package com.finnegansfact.finnegans_chile.Util;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;

public class FilterToken  extends OncePerRequestFilter {
    // @Autowired
    // private SeguridadServiceImpl seguridadServicio;
    @Value("${spring.security.user.password}")
    private String us;
    
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
                String  usuario = request.getHeader("Authorization");
                if(usuario.equals("Basic dXNlcjoxMjN0")){

                SeguridadServiceImpl s = new SeguridadServiceImpl();
                UserDetails userDetails =  s.loadUserByUsername("arg0"); //seguridadServicio.loadUserByUsername("x");

                UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(userDetails,null, userDetails.getAuthorities());
                authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(authToken);
                filterChain.doFilter(request,response);
            }
    }

}
