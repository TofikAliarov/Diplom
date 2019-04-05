package com.example.diplom.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Subject  {

    private long id;
    private String subjectname;

    public Subject(long id, String subjectname) {
        this.id = id;
        this.subjectname = subjectname;
    }
}
