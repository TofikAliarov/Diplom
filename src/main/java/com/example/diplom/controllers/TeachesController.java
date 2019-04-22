package com.example.diplom.controllers;

import com.example.diplom.dal.api.TeachesDao;
import com.example.diplom.dal.impl.TeachesDAOimpl;
import com.example.diplom.entity.TeachesEntity;
import com.example.diplom.exception.TeachesException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
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
        LOG.info("Getting all teachess");

        return teachesDao.findAll();
    }


    @RequestMapping(value = "/teaches/{id}", method = RequestMethod.GET)
    public Optional<TeachesEntity> getById(@PathVariable("id") String id) {
        final Optional<TeachesEntity> teachesEntity = this.teachesDao.findById(Integer.valueOf(id));
        if (teachesEntity != null) {
            LOG.info("Getting teaches {}", id);
            return teachesDao.findById(Integer.valueOf(id));
        } else
            LOG.warn("no teaches", id);
        throw new TeachesException(id);


    }

    @RequestMapping(value = "/teaches/", method = RequestMethod.DELETE)
    public void deleteAll() {
        LOG.info("Deleting all teaches");
        teachesDao.deleteAll();
    }

    @RequestMapping(value = "/teaches/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        LOG.info("Deleting teaches {}", id);
        teachesDao.deleteById(Integer.decode(id));
    }

    @RequestMapping(value = "/teaches", method = RequestMethod.POST)
    public TeachesEntity create(@RequestBody TeachesEntity teaches) {
        LOG.info("Creating teaches {}", teaches);
        return teachesDao.save(teaches);
    }
}
