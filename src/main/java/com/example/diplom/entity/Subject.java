package com.example.diplom.entity;

import lombok.Data;

@Data
public class Subject  {

    private long id;
    private String subjectname;

    public Subject(long id, String subjectname) {
        this.id = id;
        this.subjectname = subjectname;
    }
}
