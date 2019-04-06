package com.example.diplom.dao.impl;


import com.example.diplom.dao.api.DAO;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class StudentDAOimpl extends AbstrctDAO implements DAO {

    final private JdbcTemplate jdbcTemplate = getJdbcTemplate();

    public StudentDAOimpl() {
    }

    @Override
    public List getBy(String fieldName, String value) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
