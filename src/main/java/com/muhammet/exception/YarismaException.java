package com.muhammet.exception;

import lombok.Getter;

@Getter
public class YarismaException extends RuntimeException{
    private final EErrorType EErrorType;

    /**
     * Runtime dan miras aldığımız için hata mesajının kendisine iletilmesi gereklidir.
     * @param EErrorType
     */
    public YarismaException(EErrorType EErrorType){
        super(EErrorType.getMessage());
        this.EErrorType = EErrorType;
    }

    public YarismaException(EErrorType EErrorType, String message){
        super(message);
        this.EErrorType = EErrorType;
    }
}
