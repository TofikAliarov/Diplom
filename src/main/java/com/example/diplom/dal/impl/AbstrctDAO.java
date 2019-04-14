package com.example.diplom.dal.impl;


import com.example.diplom.dal.api.DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstrctDAO {
    @Autowired
    private JdbcTemplate getJdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return getJdbcTemplate;
    }
}

