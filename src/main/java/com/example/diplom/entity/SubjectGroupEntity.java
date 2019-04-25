package com.example.diplom.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "subject_group", schema = "markcheck", catalog = "")
public class SubjectGroupEntity {
    private int groupId;
    private int subjectId;
    private int id;

    @Basic
    @Column(name = "group_id")
    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
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
        SubjectGroupEntity that = (SubjectGroupEntity) o;
        return groupId == that.groupId &&
                subjectId == that.subjectId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(groupId, subjectId);
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
