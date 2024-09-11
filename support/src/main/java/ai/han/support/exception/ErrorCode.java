package ai.han.support.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {
    // SERVER
    INTERNAL_SERVER("SEV_01", "Internal Server Exception"),
    INVALID_PARAMETER("SEV_02", "요청 매개변수가 올바르지 않습니다."),

    // PERSISTENCE
    NOT_FOUND_ENTITY("PER_01", "해당 데이터를 찾을 수 없습니다.");

    private final String code;
    private final String message;

    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

}
