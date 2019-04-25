package com.example.diplom.controllers;

import com.example.diplom.dal.api.SubjectGroupDao;
import com.example.diplom.entity.SubjectGroupEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class SubjectGroupController {

    final static Logger LOG = LoggerFactory.getLogger(TeacherController.class);

    @Autowired
    SubjectGroupDao subjectGroupDao;


    @RequestMapping(value = "/subjectgroup", method = RequestMethod.DELETE)
    public void deleteAll() {
        LOG.info("Deleting all subjects groups");
        subjectGroupDao.deleteAll();
    }

    @RequestMapping(value = "/subjectgroup/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        LOG.info("Deleting subject and group {}", id);
        subjectGroupDao.deleteById(Integer.decode(id));
    }

    @RequestMapping(value = "/subjectgroup", method = RequestMethod.POST)
    public SubjectGroupEntity create(@RequestBody SubjectGroupEntity subjectgroup) {
        LOG.info("Creating subject and group{}", subjectgroup);
        return subjectGroupDao.save(subjectgroup);
    }
    @RequestMapping(value = "/groups_subject/subjects", method = RequestMethod.GET)
    public List<SubjectGroupEntity> getGroupSubjects(@RequestParam(value = "id") int subject_id) {
        LOG.info("Getting all group of subject{}", subject_id);
        return subjectGroupDao.getGroupSubjects(subject_id);
    }
}
