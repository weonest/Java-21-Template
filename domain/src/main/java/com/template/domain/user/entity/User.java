package com.template.domain.user.entity;

import com.template.domain.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "users")
public class User extends BaseEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = true)
    private String contactNumber;

    @Builder
    private User(String email, String name, String contactNumber) {
        this.email = email;
        this.name = name;
        this.contactNumber = contactNumber;
    }

}
