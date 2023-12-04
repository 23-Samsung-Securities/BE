package com.samsung.samsung.global.exception;


import com.example.hicardi.global.exception.base.BaseException;
import com.example.hicardi.global.exception.base.ErrorCode;
import lombok.Getter;

@Getter
public class InvalidProviderException extends BaseException {

    private String message;

    public InvalidProviderException(String message){
        super(ErrorCode.INVALID_PROVIDER, message);
        this.message = message;
    }

    public InvalidProviderException(ErrorCode errorCode) {
        super(errorCode);
    }
}
