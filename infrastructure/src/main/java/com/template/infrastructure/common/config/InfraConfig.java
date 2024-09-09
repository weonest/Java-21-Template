package com.template.infrastructure.common.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "com.template.domain")
@EnableJpaRepositories(basePackages = "com.template.infrastructure")
@ComponentScan(basePackages = "com.template.infrastructure", lazyInit = true)
public class InfraConfig {
}
