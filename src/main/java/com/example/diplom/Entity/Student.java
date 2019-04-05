package com.example.diplom.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Student  {

    private long id;
    private String login;
    private String password;
    private String name;
    private String lastName;
    private String patronymic;
    private String groupname;




    public Student(String login, String password, String name, String lastName, String patronymic, int studentid, String groupname){
        this.login = login;
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.groupname = groupname;
        this.password = password;

    }

}
