package com.template.domain.common;

import com.github.f4b6a3.ulid.UlidCreator;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PostLoad;
import jakarta.persistence.Transient;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.domain.Persistable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity implements Persistable<String> {

    @Id
    private String id = String.valueOf(UlidCreator.getUlid());

    @CreatedDate
    @Column(name = "created_at", updatable = false, columnDefinition = "TIMESTAMP(6)")
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "updated_at", insertable = false, columnDefinition = "TIMESTAMP(6)")
    private LocalDateTime updatedAt;

    @Transient
    private boolean _isNew = true;

    @Override
    public boolean isNew() {
        return _isNew;
    }

    @PostLoad
    @PostConstruct
    protected void init() {
        _isNew = false;
    }

}
