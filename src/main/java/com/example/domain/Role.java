package com.example.domain;
import org.springframework.security.core.GrantedAuthority;
public enum Role implements GrantedAuthority {
    USER, ADMIN, SELLER, HOLDER;
    @Override
    public String getAuthority() {
        return name();
    }
}
