package com.template.business.user.dto;

import com.github.f4b6a3.ulid.Ulid;
import com.template.domain.user.entity.User;

import java.time.OffsetDateTime;

public record UserResponse(
        Ulid userId,
        String name,
        String email,
        String contactNumber,
        OffsetDateTime createdAt,
        OffsetDateTime updatedAt
) {

    public static UserResponse from(User user) {
        return new UserResponse(
                user.getUserId(),
                user.getName(),
                user.getEmail(),
                user.getContactNumber(),
                user.getCreatedAt(),
                user.getUpdatedAt()
        );
    }

}
