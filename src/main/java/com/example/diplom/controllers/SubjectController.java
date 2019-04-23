package com.example.diplom.controllers;

import com.example.diplom.dal.api.SubjectDao;
import com.example.diplom.dal.impl.SubjectDAOimpl;
import com.example.diplom.entity.SubjectEntity;
import com.example.diplom.exception.SubjectException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
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
        LOG.info("Getting all subjects");

        return subjectDao.findAll();
    }


    @RequestMapping(value = "/subjects/{id}", method = RequestMethod.GET)
    public Optional<SubjectEntity> getById(@PathVariable("id") String id) {
        final Optional<SubjectEntity> subjectEntity = this.subjectDao.findById(Integer.valueOf(id));
        if (subjectEntity != null) {
            LOG.info("Getting subject {}", id);
            return subjectDao.findById(Integer.valueOf(id));
        } else
            LOG.warn("no subject", id);
        throw new SubjectException(id);
    }

    @RequestMapping(value = "/subjects", method = RequestMethod.DELETE)
    public void deleteAll() {
        LOG.info("Deleting all subjects");
        subjectDao.deleteAll();
    }

    @RequestMapping(value = "/subjects/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        LOG.info("Deleting subject {}", id);
        subjectDao.deleteById(Integer.decode(id));
    }

    @RequestMapping(value = "/subjects", method = RequestMethod.POST)
    public SubjectEntity create(@RequestBody SubjectEntity subject) {
        LOG.info("Creating subject {}", subject);
        return subjectDao.save(subject);
    }

    @RequestMapping(value = "/subjects/teacher", method = RequestMethod.GET)
    public List<SubjectEntity> getTeachersSubjects(@RequestParam(value = "id") int teacher_id) {
        LOG.info("Getting all subjects of teacher {}", teacher_id);
        return subjectDao.getTeachersSubjects(teacher_id);
    }
}
