package com.example.diplom.dao.impl;


import com.example.diplom.dao.api.TeachesDAO;
import com.example.diplom.entity.Teaches;

import java.util.List;

public class TeachesDAOimpl extends AbstrctDAO implements TeachesDAO {

    @Override
    public boolean update(Teaches gets, String id) {
        return false;
    }

    @Override
    public boolean insert(Teaches teaches) {
        return false;
    }

    @Override
    public boolean delete(Teaches teaches) {
        return false;
    }

    @Override
    public List<Teaches> getBy(String fieldName, String value) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}