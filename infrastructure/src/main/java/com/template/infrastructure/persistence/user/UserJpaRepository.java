package com.template.infrastructure.persistence.user;


import com.github.f4b6a3.ulid.Ulid;
import com.template.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<User, Ulid> {
}
