package com.example.diplom.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "student")
public class Student  {

    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Basic
    @Column(name = "login", nullable = false)
    private String login;

    @Basic
    @Column(name = "password", nullable = false)
    private String password;

    @Basic
    @Column(name = "name", nullable = false)
    private String name;

    @Basic
    @Column(name = "lastName", nullable = false)
    private String lastName;

    @Basic
    @Column(name = "patronomic")
    private String patronymic;

    @Basic
    @Column(name = "groupname", nullable = false)
    private String groupName;

    public Student(String login, String password, String name, String lastName, String patronymic, int studentid, String groupname){
        this.login = login;
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.groupName = groupname;
        this.password = password;

    }

}
