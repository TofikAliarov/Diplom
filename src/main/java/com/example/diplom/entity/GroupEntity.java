//package com.example.diplom.entity;
//
//import javax.persistence.*;
//import java.util.Objects;
//
//@Entity
//@Table(name = "group", schema = "markcheck")
//public class GroupEntity {
//
//    private int id;
//    private String groupName;
//    private int teacherId;
//
//    @Id
//    @Column(name = "id")
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    @Basic
//    @Column(name = "group_name")
//    public String getGroupName() {
//        return groupName;
//    }
//
//    public void setGroupName(String groupName) {
//        this.groupName = groupName;
//    }
//
//    @Basic
//    @Column(name = "teacher_id")
//    public int getTeacherId() {
//        return teacherId;
//    }
//
//    public void setTeacherId(int teacherId) {
//        this.teacherId = teacherId;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        GroupEntity that = (GroupEntity) o;
//        return id == that.id &&
//                teacherId == that.teacherId &&
//                Objects.equals(groupName, that.groupName);
//    }
//
//    @Override
//    public int hashCode() {
//
//        return Objects.hash(id, groupName, teacherId);
//    }
//}
