package com.template.http;

import com.template.business.config.BusinessConfig;
import com.template.domain.common.DomainConfig;
import com.template.infrastructure.common.config.InfraConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(value = {
        BusinessConfig.class,
        DomainConfig.class,
        InfraConfig.class,
})
@SpringBootApplication
public class Java21TemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(Java21TemplateApplication.class, args);
    }

}
