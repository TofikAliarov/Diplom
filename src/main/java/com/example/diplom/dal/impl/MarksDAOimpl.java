package com.example.diplom.dal.impl;

import com.example.diplom.dal.api.DAO;
import com.example.diplom.dal.api.MarksDao;
import com.example.diplom.entity.MarksEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class MarksDAOimpl extends AbstrctDAO implements DAO {

    @Autowired
    private MarksDao marksDao;

    @Override
    public List getBy(String fieldName, String value) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    public List<MarksEntity> getAll() {
        return (List<MarksEntity>) marksDao.findAll();
    }
}
