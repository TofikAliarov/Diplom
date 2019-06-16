package com.example.diplom.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED, reason = "No such user")
public class LoginException extends RuntimeException{

    public LoginException(String message) {
        super(message);
    }
}
