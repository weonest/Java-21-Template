package com.template.business.user.dto;

import com.template.domain.user.entity.User;

import java.util.Optional;

public record UserCreateCommand(
        String name,
        String email,
        Optional<String> contactNumber
){

    public User toEntity() {
        return User.builder()
                .name(name)
                .email(email)
                .contactNumber(contactNumber.orElse(null))
                .build();
    }

}
