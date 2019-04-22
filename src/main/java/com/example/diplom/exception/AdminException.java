package com.example.diplom.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "no admin")
public class AdminException extends RuntimeException {

    public AdminException(String message) {
        super(message);
    }

}
