package com.example.diplom.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "groups", schema = "markcheck")
public class GroupsEntity {
    private int id;
    private String groupsName;
    private int teacherId;
    private int studentId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "groups_name")
    public String getGroupsName() {
        return groupsName;
    }

    public void setGroupsName(String groupsName) {
        this.groupsName = groupsName;
    }

    @Basic
    @Column(name = "teacher_id")
    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Basic
    @Column(name = "student_id")
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupsEntity that = (GroupsEntity) o;
        return id == that.id &&
                teacherId == that.teacherId &&
                studentId == that.studentId &&
                Objects.equals(groupsName, that.groupsName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, groupsName, teacherId, studentId);
    }
}
