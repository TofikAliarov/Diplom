package com.example.diplom.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "subject", schema = "markcheck")
public class SubjectEntity {
    private int subjectid;
    private String subjectname;

    @Id
    @Column(name = "Subjectid")
    public int getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(int subjectid) {
        this.subjectid = subjectid;
    }

    @Basic
    @Column(name = "subjectname")
    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubjectEntity that = (SubjectEntity) o;
        return subjectid == that.subjectid &&
                Objects.equals(subjectname, that.subjectname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(subjectid, subjectname);
    }
}
