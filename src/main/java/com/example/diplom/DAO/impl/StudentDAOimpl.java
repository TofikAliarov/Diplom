package com.example.diplom.DAO.impl;


import com.example.diplom.DAO.api.StudentDAO;
import com.example.diplom.Entity.Student;

import java.util.List;

public class StudentDAOimpl extends AbstrctDAO implements StudentDAO {

    @Override
    public boolean update(Student student, String id) {
        return false;
    }

    @Override
    public boolean insert(Student student) {
        return false;
    }

    @Override
    public List<Student> studentsearch(String searchRequest) {
        return null;
    }

    @Override
    public List<Student> getAll() {
        return null;
    }

    @Override
    public Student getById(Integer id) {
        return null;
    }

    @Override
    public List<Student> getBy(String fieldName, String value) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
