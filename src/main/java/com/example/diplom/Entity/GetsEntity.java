package com.example.diplom.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "gets", schema = "markcheck")
public class GetsEntity {

    private int id;
    private int studenTid;
    private int subjectId;
    private Date date;
    private int mark;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "studen_tid")
    public int getStudenTid() {
        return studenTid;
    }

    public void setStudenTid(int studenTid) {
        this.studenTid = studenTid;
    }

    @Basic
    @Column(name = "subject_id")
    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    @Basic
    @Column(name = "date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "mark")
    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetsEntity that = (GetsEntity) o;
        return id == that.id &&
                studenTid == that.studenTid &&
                subjectId == that.subjectId &&
                mark == that.mark &&
                Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, studenTid, subjectId, date, mark);
    }
}
