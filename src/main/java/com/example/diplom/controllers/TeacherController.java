package com.example.diplom.controllers;

import com.example.diplom.dal.api.TeacherDao;
import com.example.diplom.dal.impl.TeacherDAOimpl;
import com.example.diplom.entity.TeacherEntity;
import com.example.diplom.exception.TeacherException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
public class TeacherController {

    @Autowired
    TeacherDAOimpl teacherDAOimpl;
    @Autowired
    TeacherDao teacherDao;

    @Autowired
    JdbcTemplate jdbcTemplate;

    final static Logger LOG = LoggerFactory.getLogger(TeacherController.class);

    @RequestMapping(value = "/teachers", method = RequestMethod.GET)
    public List<TeacherEntity> getAll() {
        LOG.info("Getting all teachers");

        return teacherDao.findAll();
    }


    @RequestMapping(value = "/teachers/{id}", method = RequestMethod.GET)
    public Optional<TeacherEntity> getById(@PathVariable("id") String id) {
        final Optional<TeacherEntity> teacherEntity = this.teacherDao.findById(Integer.valueOf(id));
        if (teacherEntity  != null) {
            LOG.info("Getting teacher {}", id);
            return teacherDao.findById(Integer.valueOf(id));
        }
        else
            LOG.warn("no teacher", id);
        throw new TeacherException(id);


    }

    @RequestMapping(value = "/teachers/", method = RequestMethod.DELETE)
    public void deleteAll() {
        LOG.info("Deleting all teachers");
        teacherDao.deleteAll();
    }

    @RequestMapping(value = "/teachers/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        LOG.info("Deleting teacher {}", id);
        teacherDao.deleteById(Integer.decode(id));
    }

    @RequestMapping(value = "/teachers", method = RequestMethod.POST)
    public TeacherEntity create(@RequestBody TeacherEntity teacher) {
        LOG.info("Creating teacher {}", teacher);
        return teacherDao.save(teacher);
    }
}
