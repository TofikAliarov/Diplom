package com.example.diplom.dal.impl;


import com.example.diplom.dal.api.DAO;
import com.example.diplom.dal.api.SubjectDAO;
import com.example.diplom.entity.SubjectEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class SubjectDAOimpl extends AbstrctDAO implements DAO {

    @Autowired
    private SubjectDAO subjectDAO;

    @Override
    public List getBy(String fieldName, String value) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    public List<SubjectEntity> getAll() {
        return (List<SubjectEntity>) subjectDAO.findAll();
    }
}
