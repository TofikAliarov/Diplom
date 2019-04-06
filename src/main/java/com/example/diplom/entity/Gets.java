package com.example.diplom.entity;


import java.util.Date;

import lombok.Data;

@Data
public class Gets  {

    private int studentid;

    private int subjectid;

    private Date DOB;

    private int Mark;

    public Gets(int studentid, int subjectid, Date DOB, int mark) {
        this.studentid = studentid;
        this.subjectid = subjectid;
        this.DOB = DOB;
        Mark = mark;
    }


}
