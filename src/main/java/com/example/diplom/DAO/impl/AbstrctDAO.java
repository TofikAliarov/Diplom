package com.example.diplom.DAO.impl;


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

