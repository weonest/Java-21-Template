package com.template.business.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.template.business", lazyInit = true)
public class BusinessConfig {
}
