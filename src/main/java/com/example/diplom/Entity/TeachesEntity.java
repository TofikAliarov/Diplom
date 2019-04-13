package com.example.diplom.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "teaches", schema = "markcheck", catalog = "")
public class TeachesEntity {


    private int teacherId;
    private String groupName;
    private int subjectId;

    @Basic
    @Column(name = "teacher_id")
    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Basic
    @Column(name = "group_name")
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Basic
    @Column(name = "subject_id")
    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeachesEntity that = (TeachesEntity) o;
        return teacherId == that.teacherId &&
                subjectId == that.subjectId &&
                Objects.equals(groupName, that.groupName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(teacherId, groupName, subjectId);
    }

    private int id;

    @Id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
