package org.example.expert.config;

import lombok.Getter;
import org.example.expert.domain.user.enums.UserRole;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collection;
import java.util.List;

@Getter
public class AuthUser {

    private final Long userId;
    private final String nickname;
    private final String email;
    // UserRole 이 1개가 아닐 수 있기 때문에 이렇게 설정
    private final Collection<? extends GrantedAuthority> authorities;

    public AuthUser(Long userId,String nickname, String email, UserRole role) {
        this.userId = userId;
        this.nickname = nickname;
        this.email = email;
        this.authorities = List.of(new SimpleGrantedAuthority(role.name()));
    }
}