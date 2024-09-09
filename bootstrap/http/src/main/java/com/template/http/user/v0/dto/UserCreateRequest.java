package com.template.http.user.v0.dto;

import com.template.business.user.dto.UserCreateCommand;

import java.util.Optional;

public record UserCreateRequest(
        String name,
        String email,
        Optional<String> contactNumber
) {

    public UserCreateCommand toCommand() {
        return new UserCreateCommand(name, email, contactNumber);
    }

}
