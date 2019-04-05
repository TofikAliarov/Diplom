package com.example.diplom.DAO.api;

import com.example.diplom.Entity.Teacher;

import java.util.List;

public interface TeacherDAO extends DAO<Teacher> {

    boolean update(Teacher teacher, String id);

    boolean insert(Teacher teacher);


    List<Teacher> teachersearch(String searchRequest);
}
