package com.example.sbb_test1;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "엔티티가 비어있음")
public class NoDataException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public NoDataException(String message) {
        super(message);
    }
}