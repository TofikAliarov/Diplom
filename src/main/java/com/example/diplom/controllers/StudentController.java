package com.example.diplom.controllers;

import com.example.diplom.dao.api.StudentDAO;
import com.example.diplom.dao.impl.StudentDAOimpl;
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

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public List<StudentEntity> getAll() {
        LOG.debug("Getting all students");
//        final List<Student> asdsa = new ArrayList<>();
//        asdsa.add(new Student("sdasd",
//                "sdasdas",
//                "sddasd",
//                "asdasd",
//                "asdasds",
//                1,
//                "asdasd"));
//        return  asdsa;

        return (List<StudentEntity>) studentDAO.findAll();
        }


    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    public Optional<StudentEntity> getById(@PathVariable("id") String id) {
        LOG.debug("Getting student {}", id);
        return studentDAO.findById(Integer.decode(id));
    }

//    @RequestMapping(value = "/student/{id}", method = RequestMethod.DELETE)
//    public void delete(@PathVariable("id") String id) {
//        LOG.debug("Deleting student {}", id);
//        studentDAO.deleteById(Integer.getInteger(id));
//    }
//
//    @RequestMapping(value = "/student", method = RequestMethod.POST)
//    public boolean create(@RequestBody Student student) {
//        LOG.debug("Creating student {}", student);
//        return studentDAO.(student);
//    }
}
