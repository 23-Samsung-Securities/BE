package com.samsung.samsung.global.exception;

import com.example.hicardi.global.exception.base.BaseException;
import com.example.hicardi.global.exception.base.ErrorCode;
import lombok.Getter;


@Getter
public class TokenExpiredException extends BaseException {

    private String message;

    public TokenExpiredException(String message){
        super(ErrorCode.TOKEN_EXPIRED, message);
        this.message = message;
    }

    public TokenExpiredException(ErrorCode errorCode) {
        super(errorCode);
    }
}
