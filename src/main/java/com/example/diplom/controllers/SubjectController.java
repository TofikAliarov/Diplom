package com.example.diplom.controllers;

import com.example.diplom.dao.api.SubjectDAO;
import com.example.diplom.dao.impl.SubjectDAOimpl;
import com.example.diplom.entity.SubjectEntity;
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
public class SubjectController {
    @Autowired
    SubjectDAOimpl subjectDAOimpl;
    @Autowired
    SubjectDAO subjectDAO;

    @Autowired
    JdbcTemplate jdbcTemplate;

    final static Logger LOG = LoggerFactory.getLogger(TeacherController.class);

    @RequestMapping(value = "/subject", method = RequestMethod.GET)
    public List<SubjectEntity> getAll() {
        LOG.debug("Getting all subjects");

        return (List<SubjectEntity>) subjectDAO.findAll();
    }


    @RequestMapping(value = "/subject/{id}", method = RequestMethod.GET)
    public Optional<SubjectEntity> getById(@PathVariable("id") String id) {
        LOG.debug("Getting subject {}", id);
        return subjectDAO.findById(Integer.decode(id));
    }
}
