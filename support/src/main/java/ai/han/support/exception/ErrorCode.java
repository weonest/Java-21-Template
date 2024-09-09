package ai.han.support.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {
    // PERSISTENCE
    NOT_FOUND_ENTITY("PER_01", "해당 데이터를 찾을 수 없습니다.");

    private final String code;
    private final String message;

    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

}
