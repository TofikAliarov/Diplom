package com.example.diplom.dao.impl;

import com.example.diplom.dao.api.AdminDAO;
import com.example.diplom.dao.api.DAO;
import com.example.diplom.entity.AdminEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class AdminDAOimpl extends AbstrctDAO implements DAO {

    @Autowired
    private AdminDAO adminDAO;

    @Override
    public List getBy(String fieldName, String value) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    public List<AdminEntity> getAll() {
        return (List<AdminEntity>) adminDAO.findAll();
    }

}
