package com.example.diplom.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="no group")
public class GroupException extends RuntimeException{


    public GroupException(String message) {
        super(message);
    }

}
