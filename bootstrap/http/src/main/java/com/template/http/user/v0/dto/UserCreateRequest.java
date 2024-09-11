package com.template.http.user.v0.dto;

import com.template.business.user.dto.UserCreateCommand;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.util.Optional;

public record UserCreateRequest(
        @NotNull
        @Size(min = 2, max=15, message = "닉네임은 2자 이상 15자 이하입니다.")
        @Pattern(regexp = "^[a-zA-Z0-9가-힣]+$", message = "닉네임은 숫자, 한글, 영어만 가능합니다.")
        String name,
        @Email
        String email,
        Optional<String> contactNumber
) {

    public UserCreateCommand toCommand() {
        return new UserCreateCommand(name, email, contactNumber);
    }

}
