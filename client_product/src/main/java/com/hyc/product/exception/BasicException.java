package com.hyc.product.exception;

import lombok.Data;

@Data
public class BasicException extends RuntimeException{

    private static final long serialVersionUID = -3152614393562772529L;

    private String code;


    public BasicException(String message) {
        super(message);
    }

    public BasicException(String code,String message) {
        super(message);
        this.code = code;
    }
}
