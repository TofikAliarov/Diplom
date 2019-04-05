package com.example.diplom.DAO.impl;

import com.example.diplom.DAO.api.GetsDAO;
import com.example.diplom.Entity.Gets;

import java.util.List;

public class GetsDAOimpl extends AbstrctDAO implements GetsDAO {

    @Override
    public boolean update(Gets gets, String id) {
        return false;
    }

    @Override
    public boolean insert(Gets gets) {
        return false;
    }

    @Override
    public List<Gets> getAll() {
        return null;
    }

    @Override
    public Gets getById(Integer id) {
        return null;
    }

    @Override
    public List<Gets> getBy(String fieldName, String value) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
