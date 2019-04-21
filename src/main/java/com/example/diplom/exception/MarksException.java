package com.example.diplom.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="no mark")
public class MarksException extends RuntimeException{


    public MarksException(String message) {
        super(message);
    }

}
