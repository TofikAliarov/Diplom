package com.example.diplom.controllers;

import com.example.diplom.dal.api.TeacherDAO;
import com.example.diplom.dal.impl.TeacherDAOimpl;
import com.example.diplom.entity.TeacherEntity;
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
public class TeacherController {

    @Autowired
    TeacherDAOimpl teacherDAOimpl;
    @Autowired
    TeacherDAO teacherDAO;

    @Autowired
    JdbcTemplate jdbcTemplate;

    final static Logger LOG = LoggerFactory.getLogger(TeacherController.class);

    @RequestMapping(value = "/teacher", method = RequestMethod.GET)
    public List<TeacherEntity> getAll() {
        LOG.debug("Getting all teachers");

        return (List<TeacherEntity>) teacherDAO.findAll();
    }


    @RequestMapping(value = "/teacher/{id}", method = RequestMethod.GET)
    public Optional<TeacherEntity> getById(@PathVariable("id") String id) {
        LOG.debug("Getting teacher {}", id);
        return teacherDAO.findById(Integer.decode(id));
    }

}
