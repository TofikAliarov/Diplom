package com.example.diplom.controllers;

import com.example.diplom.dal.api.GetsDao;
import com.example.diplom.dal.impl.GetsDAOimpl;
import com.example.diplom.entity.GetsEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GetsController {

    @Autowired
    GetsDAOimpl getsDAOimpl;
    @Autowired
    GetsDao getsDao;

    @Autowired
    JdbcTemplate jdbcTemplate;

    final static Logger LOG = LoggerFactory.getLogger(TeacherController.class);

    @RequestMapping(value = "/gets", method = RequestMethod.GET)
    public List<GetsEntity> getAll() {
        LOG.debug("Getting all gets");

        return getsDao.findAll();
    }


    @RequestMapping(value = "/gets/{id}", method = RequestMethod.GET)
    public Optional<GetsEntity> getById(@PathVariable("id") String id) {
        LOG.debug("Getting gets {}", id);
        return getsDao.findById(Integer.decode(id));
    }

    @RequestMapping(value = "/gets/", method = RequestMethod.DELETE)
    public void deleteAll() {
        LOG.debug("Deleting all gets");
        getsDao.deleteAll();
    }

    @RequestMapping(value = "/gets/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        LOG.debug("Deleting gets {}", id);
        getsDao.deleteById(Integer.decode(id));
    }

    @RequestMapping(value = "/gets", method = RequestMethod.POST)
    public GetsEntity create(@RequestBody GetsEntity gets) {
        LOG.debug("Creating gets {}", gets);
        return getsDao.save(gets);
    }
}
