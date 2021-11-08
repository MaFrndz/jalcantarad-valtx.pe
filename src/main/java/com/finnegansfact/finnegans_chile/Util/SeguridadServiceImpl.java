package com.finnegansfact.finnegans_chile.Util;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SeguridadServiceImpl implements UserDetailsService {

      
    @Override
    public UserDetails loadUserByUsername(String usuario) throws UsernameNotFoundException {
        
        return new User(usuario,"123",new ArrayList<>()); 
    }

}
