package com.example.diplom.DAO.impl;


import com.example.diplom.DAO.api.SubjectDAO;
import com.example.diplom.Entity.Subject;

import java.util.List;

public class SubjectDAOimpl extends AbstrctDAO implements SubjectDAO {

    @Override
    public boolean update(Subject subject, String id) {
        return false;
    }

    @Override
    public boolean insert(Subject subject) {
        return false;
    }

    @Override
    public List<Subject> subjectsearch(String searchRequest) {
        return null;
    }

    @Override
    public List<Subject> getAll() {
        return null;
    }

    @Override
    public Subject getById(Integer id) {
        return null;
    }

    @Override
    public List<Subject> getBy(String fieldName, String value) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
