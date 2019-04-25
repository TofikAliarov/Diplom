package com.example.diplom.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "student_groups", schema = "markcheck")
public class GroupsEntity {
    private int id;
    private String groupsName;
    private int teacherId;
    private String subjectId;
    private String subjectGroupId;

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
    @Column(name = "subject_id")
    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    @Basic
    @Column(name = "subject_group_id")
    public String getSubjectGroupId() {
        return subjectGroupId;
    }

    public void setSubjectGroupId(String subjectGroupId) {
        this.subjectGroupId = subjectGroupId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupsEntity that = (GroupsEntity) o;
        return id == that.id &&
                teacherId == that.teacherId &&
                Objects.equals(groupsName, that.groupsName) &&
                Objects.equals(subjectId, that.subjectId) &&
                Objects.equals(subjectGroupId, that.subjectGroupId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, groupsName, teacherId, subjectId, subjectGroupId);
    }
}
