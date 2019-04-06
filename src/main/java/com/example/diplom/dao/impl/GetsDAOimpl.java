package com.example.diplom.dao.impl;

import com.example.diplom.dao.api.GetsDAO;
import com.example.diplom.entity.Gets;

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
