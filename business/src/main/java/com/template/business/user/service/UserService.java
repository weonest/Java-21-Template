package com.template.business.user.service;

import com.template.business.user.dto.UserCreateCommand;
import com.template.business.user.dto.UserResponse;
import com.template.domain.user.entity.User;
import com.template.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void create(UserCreateCommand command) {
        User user = command.toEntity();
        userRepository.save(user);
    }

    public List<UserResponse> getAll() {
        List<User> users = userRepository.getAll();
        return users.stream().map(UserResponse::from).toList();
    }

}
