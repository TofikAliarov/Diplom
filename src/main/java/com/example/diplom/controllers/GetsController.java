package com.example.diplom.controllers;

import com.example.diplom.dal.api.GetsDao;
import com.example.diplom.dal.impl.GetsDAOimpl;
import com.example.diplom.entity.GetsEntity;
import com.example.diplom.exception.GetsException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
public class GetsController {

    @Autowired
    GetsDAOimpl getsDAOimpl;

    @Autowired
    GetsDao getsDao;

    final static Logger LOG = LoggerFactory.getLogger(TeacherController.class);

    @RequestMapping(value = "/gets", method = RequestMethod.GET)
    public List<GetsEntity> getAll() {
        LOG.info("Getting all gets");

        return getsDao.findAll();
    }


    @RequestMapping(value = "/gets/{id}", method = RequestMethod.GET)
    public Optional<GetsEntity> getById(@PathVariable("id") String id) {
        final Optional<GetsEntity> studentEntity = this.getsDao.findById(Integer.valueOf(id));
        if (studentEntity != null) {
            LOG.info("Getting student {}", id);
            return getsDao.findById(Integer.valueOf(id));
        } else
            LOG.warn("no student", id);
        throw new GetsException(id);
    }

    @RequestMapping(value = "/gets/", method = RequestMethod.DELETE)
    public void deleteAll() {
        LOG.info("Deleting all gets");
        getsDao.deleteAll();
    }

    @RequestMapping(value = "/gets/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        LOG.info("Deleting gets {}", id);
        getsDao.deleteById(Integer.decode(id));
    }

    @RequestMapping(value = "/gets", method = RequestMethod.POST)
    public GetsEntity create(@RequestBody GetsEntity gets) {
        LOG.info("Creating gets {}", gets);
        return getsDao.save(gets);
    }

    @RequestMapping(value = "/gets/students", method = RequestMethod.GET)
    public List<GetsEntity> getGetsByStudentId(@RequestParam (value = "id") int studentId) {
        LOG.info("Getting all gets for student {}", studentId);
        return getsDao.getByStudentId(studentId);
    }
}
