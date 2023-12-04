package com.samsung.samsung.global.exception;


import com.samsung.samsung.global.response.BaseException;
import com.samsung.samsung.global.response.ErrorCode;
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
