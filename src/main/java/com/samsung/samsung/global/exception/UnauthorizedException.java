package com.samsung.samsung.global.exception;


import com.samsung.samsung.global.response.BaseException;
import com.samsung.samsung.global.response.ErrorCode;
import lombok.Getter;


@Getter
public class UnauthorizedException extends BaseException {

    String message;

    public UnauthorizedException(String message) {
        super(ErrorCode._UNAUTHORIZED, message);
        this.message = message;
    }

    public UnauthorizedException(ErrorCode errorCode) {
        super(errorCode);
    }
}
