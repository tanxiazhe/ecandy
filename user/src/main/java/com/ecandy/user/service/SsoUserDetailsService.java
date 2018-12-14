package com.ecandy.user.service;

import com.ecandy.user.mapper.EUserMapper;
import com.ecandy.user.model.EUser;
import com.github.pagehelper.util.StringUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;


@Component
public class SsoUserDetailsService implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    EUserMapper eUserMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println(username);
        if(StringUtils.isEmpty(username)){
            System.out.println("name is null");
            return null;
        }
//        if(StringUtil.isNullOrZero(passsword)){
//            System.out.println("password is null");
//            return null;
//        }
        EUser euser= null;
        try {
            euser = eUserMapper.selectEUserByName(username);
        }catch(Exception e){
            e.printStackTrace();
        }
        if(euser!=null){

            return new User(username,
                passwordEncoder.encode(euser.getPassword()),
                AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER"));
        }
        return null;
    }
}
