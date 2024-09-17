package org.example.login.security;

import lombok.extern.log4j.Log4j2;
import org.example.login.dto.MemberDTO;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Log4j2
public class CustomUserDetailService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        MemberDTO memberDTO = new MemberDTO();

        memberDTO.setMid(username);
        memberDTO.setMpw("$2a$12$0CQpyYK9qPj6BzIwC3u5k.kZFc28XNFNrdYE3JuKxilFSPnFLZyEy");
        memberDTO.setRoles(List.of("USER"));

        return memberDTO;
    }
}
