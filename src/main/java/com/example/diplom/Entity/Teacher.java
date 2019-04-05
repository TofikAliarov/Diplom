package com.example.diplom.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Teacher {

    private long id;
    private String login;
    private String password;
    private String name;
    private String lastName;
    private String patronymic;


    public Teacher(String login, String password, String name, String lastName, String patronymic) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }


}
