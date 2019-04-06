package com.example.diplom.entity;

import lombok.Data;

@Data
public class Teaches {
    private int teacherid;
    private int subjectid;
    private String Groupname;

    public Teaches(int teacherid, int subjectid, String groupname) {
        this.teacherid = teacherid;
        this.subjectid = subjectid;
        Groupname = groupname;
    }


}
