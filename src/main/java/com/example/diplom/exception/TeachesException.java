package com.example.diplom.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "no")
public class TeachesException extends RuntimeException {


    public TeachesException(String message) {
        super(message);
    }

}
