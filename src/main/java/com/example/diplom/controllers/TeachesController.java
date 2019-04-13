package com.example.diplom.controllers;

import com.example.diplom.dao.api.TeachesDAO;
import com.example.diplom.dao.impl.TeachesDAOimpl;
import com.example.diplom.entity.TeachesEntity;
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
public class TeachesController {

    @Autowired
    TeachesDAOimpl teachesDAOimpl;
    @Autowired
    TeachesDAO teachesDAO;

    @Autowired
    JdbcTemplate jdbcTemplate;

    final static Logger LOG = LoggerFactory.getLogger(TeacherController.class);

    @RequestMapping(value = "/teaches", method = RequestMethod.GET)
    public List<TeachesEntity> getAll() {
        LOG.debug("Getting all teachess");

        return (List<TeachesEntity>) teachesDAO.findAll();
    }


    @RequestMapping(value = "/teaches/{id}", method = RequestMethod.GET)
    public Optional<TeachesEntity> getById(@PathVariable("id") String id) {
        LOG.debug("Getting teaches {}", id);
        return teachesDAO.findById(Integer.decode(id));
    }

}
