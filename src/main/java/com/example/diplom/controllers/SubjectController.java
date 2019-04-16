package com.example.diplom.controllers;

import com.example.diplom.dal.api.SubjectDao;
import com.example.diplom.dal.impl.SubjectDAOimpl;
import com.example.diplom.entity.SubjectEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SubjectController {
    @Autowired
    SubjectDAOimpl subjectDAOimpl;
    @Autowired
    SubjectDao subjectDao;

    @Autowired
    JdbcTemplate jdbcTemplate;

    final static Logger LOG = LoggerFactory.getLogger(TeacherController.class);

    @RequestMapping(value = "/subjects", method = RequestMethod.GET)
    public List<SubjectEntity> getAll() {
        LOG.debug("Getting all subjects");

        return subjectDao.findAll();
    }


    @RequestMapping(value = "/subjects/{id}", method = RequestMethod.GET)
    public Optional<SubjectEntity> getById(@PathVariable("id") String id) {
        LOG.debug("Getting subject {}", id);
        return subjectDao.findById(Integer.decode(id));
    }

    @RequestMapping(value = "/subjects/", method = RequestMethod.DELETE)
    public void deleteAll() {
        LOG.debug("Deleting all subjects");
        subjectDao.deleteAll();
    }

    @RequestMapping(value = "/subjects/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        LOG.debug("Deleting subject {}", id);
        subjectDao.deleteById(Integer.decode(id));
    }

    @RequestMapping(value = "/subjects", method = RequestMethod.POST)
    public SubjectEntity create(@RequestBody SubjectEntity subject) {
        LOG.debug("Creating subject {}", subject);
        return subjectDao.save(subject);
    }
}
