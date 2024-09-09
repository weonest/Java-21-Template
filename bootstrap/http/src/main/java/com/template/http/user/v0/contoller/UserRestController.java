package com.template.http.user.v0.contoller;

import com.template.business.user.dto.UserResponse;
import com.template.business.user.service.UserService;
import com.template.http.user.v0.dto.UserCreateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v0/users")
public class UserRestController {

    private final UserService userService;

    @GetMapping("")
    public ResponseEntity<?> getUsers() {
        List<UserResponse> response = userService.getAll();
        return ResponseEntity.ok(response);
    }

    @PostMapping("")
    public ResponseEntity<Void> createUser(@RequestBody UserCreateRequest request) {
        userService.create(request.toCommand());
        return ResponseEntity.ok().build();
    }
}
