package com.template.domain.user.repository;

import com.github.f4b6a3.ulid.Ulid;
import com.template.domain.user.entity.User;

import java.util.List;

public interface UserRepository {

    User save(User user);

    List<User> getAll();

    User getByUserId(Ulid userId);

}
