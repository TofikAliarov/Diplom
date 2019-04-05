package com.example.diplom.DAO.impl;

import com.example.diplom.DAO.api.AdminDAO;
import com.example.diplom.Entity.Admin;

import java.util.List;


public class AdminDAOimpl extends AbstrctDAO implements AdminDAO {


    @Override
    public boolean update(Admin admin, String id) {
        return false;
    }

    @Override
    public boolean insert(Admin admin) {
        return false;
    }

    @Override
    public List<Admin> getAll() {
        return null;
    }

    @Override
    public Admin getById(Integer id) {
        return null;
    }

    @Override
    public List<Admin> getBy(String fieldName, String value) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
