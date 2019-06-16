package com.example.diplom.controllers;

import com.example.diplom.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping
    public Object login(@RequestHeader(value="login") String login,
                        @RequestHeader(value="password") String password) {
        return loginService.login(login, password);
    }
}
