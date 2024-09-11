package com.template.http.common.exception;

import ai.han.support.exception.BusinessException;
import ai.han.support.exception.ErrorCode;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    ResponseEntity<ErrorResponse> handlerBusinessException(BusinessException exception) {
        log.warn(exception.getLoggingMessage(), exception);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(ErrorResponse.from(exception.getErrorCode()));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    ResponseEntity<ErrorResponse> handleMethodArgumentNotValidException(MethodArgumentNotValidException exception) {
        StringBuilder builder = new StringBuilder();
        exception.getBindingResult()
                .getFieldErrors()
                .forEach(fieldError -> builder.append(
                        String.format(
                                """
                                field : %s | rejectedValue : %s | message : %s
                                """,
                                fieldError.getField(),
                                fieldError.getRejectedValue(),
                                fieldError.getDefaultMessage()
                        )));
        String loggingMessage = builder.toString();
        log.warn(loggingMessage, exception);

        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(ErrorResponse.of(ErrorCode.INVALID_PARAMETER, exception.getBindingResult()));
    }

    @ExceptionHandler(Exception.class)
    ResponseEntity<ErrorResponse> handleException(Exception exception, HttpServletRequest request) {
        String loggingMessage = String.format(
                """
                method : %s
                requestURI : %s
                queryString : %s
                requestedBy : %s
                """,
                request.getMethod(),
                request.getRequestURI(),
                request.getQueryString(),
                request.getHeader("X-Forwarded-For")
        );
        log.error(loggingMessage, exception);

        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(ErrorResponse.from(ErrorCode.INTERNAL_SERVER));
    }

}
