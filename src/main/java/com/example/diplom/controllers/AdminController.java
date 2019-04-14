package com.example.diplom.controllers;


import com.example.diplom.dal.api.AdminDao;
import com.example.diplom.dal.impl.AdminDAOimpl;
import com.example.diplom.entity.AdminEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class AdminController {

    @Autowired
    AdminDAOimpl adminDAOimpl;
    @Autowired
    AdminDao adminDAO;

    @Autowired
    JdbcTemplate jdbcTemplate;

    final static Logger LOG = LoggerFactory.getLogger(TeacherController.class);

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public List<AdminEntity> getAll() {
        LOG.debug("Getting all admins");

        return (List<AdminEntity>) adminDAO.findAll();
    }


    @RequestMapping(value = "/admin/{id}", method = RequestMethod.GET)
    public Optional<AdminEntity> getById(@PathVariable("id") String id) {
        LOG.debug("Getting admin {}", id);
        return adminDAO.findById(Integer.decode(id));
    }

}
