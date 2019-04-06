package com.example.diplom.entity;

import lombok.Data;

@Data
public class Admin {

    private long id;
    private String login;
    private String password;

    public Admin(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
