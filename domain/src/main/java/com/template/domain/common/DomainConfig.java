package com.template.domain.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.time.OffsetDateTime;

@Configuration
@EnableJpaAuditing
public class DomainConfig {

    @Bean
    public AuditorAware<OffsetDateTime> auditorProvider() {
        return new UTCTimeAuditor();
    }

}
