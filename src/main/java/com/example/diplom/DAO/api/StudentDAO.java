package com.example.diplom.DAO.api;

import com.example.diplom.Entity.Student;

import java.util.List;

public interface StudentDAO extends DAO<Student> {
    boolean update(Student student, String id);

    boolean insert(Student student);


    List<Student> studentsearch(String searchRequest);
}
