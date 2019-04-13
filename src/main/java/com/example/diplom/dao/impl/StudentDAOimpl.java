package com.example.diplom.dao.impl;


import com.example.diplom.dao.api.DAO;
import com.example.diplom.dao.api.StudentDAO;
import com.example.diplom.entity.StudentEntity;
import com.example.diplom.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class StudentDAOimpl extends AbstrctDAO implements DAO {

    @Autowired
    private StudentDAO studentDAO;

    @Override
    public List getBy(String fieldName, String value) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    public List<StudentEntity> getAll() {
        return (List<StudentEntity>) studentDAO.findAll();
    }
}
