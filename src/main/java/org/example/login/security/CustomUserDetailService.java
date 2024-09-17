package org.example.login.security;

import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class CustomUserDetailService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        log.info("loadUserByUsername ----------------------- ");

        UserDetails userDetails = User.builder()
                .username(username)
                .password("$2a$12$0CQpyYK9qPj6BzIwC3u5k.kZFc28XNFNrdYE3JuKxilFSPnFLZyEy")  // BCrypt 해시된 상태
                .authorities("ROLE_USER") // 권한 설정
                .build();

        return userDetails;
    }
}
