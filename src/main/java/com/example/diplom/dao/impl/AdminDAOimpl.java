package com.example.diplom.dao.impl;

import com.example.diplom.dao.api.AdminDAO;
import com.example.diplom.entity.Admin;

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
    public List<Admin> getBy(String fieldName, String value) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
