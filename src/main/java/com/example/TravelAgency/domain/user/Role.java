package com.example.TravelAgency.domain.user;

import lombok.Getter;

@Getter
public enum Role {
    USER("ROLE_USER"), ADMIN("ROLE_ADMIN");

    private String roleName;

    Role(String roleName) {
        this.roleName = roleName;
    }
}
