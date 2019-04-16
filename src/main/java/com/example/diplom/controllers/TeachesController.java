package com.example.diplom.controllers;

import com.example.diplom.dal.api.TeachesDao;
import com.example.diplom.dal.impl.TeachesDAOimpl;
import com.example.diplom.entity.TeachesEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TeachesController {

    @Autowired
    TeachesDAOimpl teachesDAOimpl;
    @Autowired
    TeachesDao teachesDao;

    @Autowired
    JdbcTemplate jdbcTemplate;

    final static Logger LOG = LoggerFactory.getLogger(TeacherController.class);

    @RequestMapping(value = "/teaches", method = RequestMethod.GET)
    public List<TeachesEntity> getAll() {
        LOG.debug("Getting all teachess");

        return teachesDao.findAll();
    }


    @RequestMapping(value = "/teaches/{id}", method = RequestMethod.GET)
    public Optional<TeachesEntity> getById(@PathVariable("id") String id) {
        LOG.debug("Getting teaches {}", id);
        return teachesDao.findById(Integer.decode(id));
    }
    @RequestMapping(value = "/teaches/", method = RequestMethod.DELETE)
    public void deleteAll() {
        LOG.debug("Deleting all teaches");
        teachesDao.deleteAll();
    }

    @RequestMapping(value = "/teaches/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        LOG.debug("Deleting teaches {}", id);
        teachesDao.deleteById(Integer.decode(id));
    }

    @RequestMapping(value = "/teaches", method = RequestMethod.POST)
    public TeachesEntity create(@RequestBody TeachesEntity teaches) {
        LOG.debug("Creating teaches {}", teaches);
        return teachesDao.save(teaches);
    }
}
