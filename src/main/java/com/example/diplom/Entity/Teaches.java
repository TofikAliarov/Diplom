package com.example.diplom.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

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
