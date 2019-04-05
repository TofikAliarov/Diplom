package com.example.diplom.DAO.impl;


import com.example.diplom.DAO.api.TeachesDAO;
import com.example.diplom.Entity.Teaches;

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
    public List<Teaches> getAll() {
        return null;
    }

    @Override
    public Teaches getById(Integer id) {
        return null;
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
