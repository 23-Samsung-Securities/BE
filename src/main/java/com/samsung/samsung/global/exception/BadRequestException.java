package com.samsung.samsung.global.exception;



import com.samsung.samsung.global.response.BaseException;
import com.samsung.samsung.global.response.ErrorCode;
import lombok.Getter;

@Getter
public class BadRequestException extends BaseException {
    private String message;

    public BadRequestException(String message) {
        super(ErrorCode._BAD_REQUEST, message);
        this.message = message;
    }

    public BadRequestException(ErrorCode errorCode) {
        super(errorCode);
    }
}
