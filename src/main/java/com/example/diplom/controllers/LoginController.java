package com.example.diplom.controllers;

import com.example.diplom.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    final LoginService loginService;

    @Autowired
    AuthenticationManager authenticationManager;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public boolean setLoginService(@RequestParam String login,
                                   @RequestParam String password) {
        try {
            Authentication authentication =
                    authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(login, password));

            boolean isAuthenticated = authentication.isAuthenticated();
            if (isAuthenticated) {
                SecurityContextHolder.getContext().setAuthentication(authentication);

                return true;
            }
        } catch (AuthenticationException ex){}
        return false;
    }
}
