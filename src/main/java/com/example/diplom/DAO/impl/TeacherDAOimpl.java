package com.example.diplom.DAO.impl;


import com.example.diplom.DAO.api.TeacherDAO;
import com.example.diplom.Entity.Teacher;

import java.util.List;

public class TeacherDAOimpl extends AbstrctDAO implements TeacherDAO {

    @Override
    public boolean update(Teacher teacher, String id) {
        return false;
    }

    @Override
    public boolean insert(Teacher teacher) {
        return false;
    }

    @Override
    public List<Teacher> teachersearch(String searchRequest) {
        return null;
    }

    @Override
    public List<Teacher> getAll() {
        return null;
    }

    @Override
    public Teacher getById(Integer id) {
        return null;
    }

    @Override
    public List<Teacher> getBy(String fieldName, String value) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
