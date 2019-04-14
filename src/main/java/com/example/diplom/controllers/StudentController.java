package com.example.diplom.controllers;

import com.example.diplom.dal.api.StudentDAO;
import com.example.diplom.dal.impl.StudentDAOimpl;
import com.example.diplom.entity.StudentEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
public class StudentController {

    @Autowired
    StudentDAOimpl studentDAOimpl;

    @Autowired
    StudentDAO studentDAO;

    @Autowired
    JdbcTemplate jdbcTemplate;

    final static Logger LOG = LoggerFactory.getLogger(StudentController.class);

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public List<StudentEntity> getAll() {
        LOG.debug("Getting all students");
        return studentDAO.findAll();
        }


    @RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
    public Optional<StudentEntity> getById(@PathVariable("id") String id) {
        LOG.debug("Getting student {}", id);
        return studentDAO.findById(Integer.decode(id));
    }

    @RequestMapping(value = "/students/", method = RequestMethod.DELETE)
    public void deleteAll() {
        LOG.debug("Deleting all students");
        studentDAO.deleteAll();
    }

    @RequestMapping(value = "/students/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        LOG.debug("Deleting student {}", id);
        studentDAO.deleteById(Integer.decode(id));
    }

    @RequestMapping(value = "/students", method = RequestMethod.POST)
    public StudentEntity create(@RequestBody StudentEntity student) {
        LOG.debug("Creating student {}", student);
        return studentDAO.save(student);
    }
}
