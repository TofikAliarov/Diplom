package com.example.diplom.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "subject", schema = "markcheck")
public class SubjectEntity {
    private int subjectId;
    private String subjectName;

    @Id
    @Column(name = "Subjectid")
    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    @Basic
    @Column(name = "subjectName")
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubjectEntity that = (SubjectEntity) o;
        return subjectId == that.subjectId &&
                Objects.equals(subjectName, that.subjectName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(subjectId, subjectName);
    }
}
