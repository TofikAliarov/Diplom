package com.example.diplom.dal.impl;

import com.example.diplom.dal.api.DAO;
import com.example.diplom.dal.api.GetsDAO;
import com.example.diplom.entity.GetsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class GetsDAOimpl extends AbstrctDAO implements DAO {


    @Autowired
    private GetsDAO getsDAO;

    @Override
    public List getBy(String fieldName, String value) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    public List<GetsEntity> getAll() {
        return (List<GetsEntity>) getsDAO.findAll();
    }

}
