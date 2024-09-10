package com.template.business.user.dto;

import com.template.domain.user.entity.User;

import java.time.LocalDateTime;

public record UserResponse(
        String userId,
        String name,
        String email,
        String contactNumber,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {

    public static UserResponse from(User user) {
        return new UserResponse(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getContactNumber(),
                user.getCreatedAt(),
                user.getUpdatedAt()
        );
    }

}
