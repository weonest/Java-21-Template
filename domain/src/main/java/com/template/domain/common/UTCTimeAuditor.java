package com.template.domain.common;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Optional;

@Component
public class UTCTimeAuditor implements AuditorAware<OffsetDateTime> {

    @Override
    public Optional<OffsetDateTime> getCurrentAuditor() {
        return Optional.of(OffsetDateTime.now(ZoneOffset.UTC));
    }

}
