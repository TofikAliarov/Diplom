package com.example.diplom.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="no subject")
public class SubjectException extends RuntimeException{


    public SubjectException(String message) {
        super(message);
    }

}
