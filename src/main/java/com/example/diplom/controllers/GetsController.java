package com.example.diplom.controllers;

import com.example.diplom.dao.api.GetsDAO;
import com.example.diplom.dao.impl.GetsDAOimpl;
import com.example.diplom.entity.GetsEntity;
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
public class GetsController {

    @Autowired
    GetsDAOimpl getsDAOimpl;
    @Autowired
    GetsDAO getsDAO;

    @Autowired
    JdbcTemplate jdbcTemplate;

    final static Logger LOG = LoggerFactory.getLogger(TeacherController.class);

    @RequestMapping(value = "/gets", method = RequestMethod.GET)
    public List<GetsEntity> getAll() {
        LOG.debug("Getting all gets");

        return (List<GetsEntity>) getsDAO.findAll();
    }


    @RequestMapping(value = "/gets/{id}", method = RequestMethod.GET)
    public Optional<GetsEntity> getById(@PathVariable("id") String id) {
        LOG.debug("Getting gets {}", id);
        return getsDAO.findById(Integer.decode(id));
    }
}
