package com.example.diplom.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "no student")
public class StudentException extends RuntimeException {

    public StudentException(String message) {
        super(message);
    }


}
