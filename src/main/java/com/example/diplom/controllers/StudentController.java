package com.example.diplom.controllers;

import com.example.diplom.dao.api.StudentDAO;
import com.example.diplom.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class StudentController {

    @Autowired
    StudentDAO studentDAO;

    final static Logger LOG = LoggerFactory.getLogger(StudentController.class);

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public List<Student> getAll() {
        LOG.debug("Getting all students");
        return studentDAO.findAll();
    }

    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    public Student getById(@PathVariable("id") String id) {
        LOG.debug("Getting student {}", id);
        return studentDAO.getOne(Integer.getInteger(id));
    }

    @RequestMapping(value = "/student/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        LOG.debug("Deleting student {}", id);
        studentDAO.deleteById(Integer.getInteger(id));
    }

//    @RequestMapping(value = "/student", method = RequestMethod.POST)
//    public boolean create(@RequestBody Student student) {
//        LOG.debug("Creating student {}", student);
//        return studentDAO.(student);
//    }
}
