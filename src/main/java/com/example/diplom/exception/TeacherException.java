package com.example.diplom.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="no teacher")
public class TeacherException extends RuntimeException{


    public TeacherException(String message) {
        super(message);
    }

}
