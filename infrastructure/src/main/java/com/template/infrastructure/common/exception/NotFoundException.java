package com.template.infrastructure.common.exception;

import ai.han.support.exception.BusinessException;
import ai.han.support.exception.ErrorCode;

public class NotFoundException extends BusinessException {

    public NotFoundException(ErrorCode errorCode) {
        super(errorCode);
    }

    public NotFoundException(ErrorCode errorCode, String loggingMessage) {
        super(errorCode, loggingMessage);
    }

}
