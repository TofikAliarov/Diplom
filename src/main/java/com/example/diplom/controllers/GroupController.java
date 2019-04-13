package com.example.diplom.controllers;

import com.example.diplom.dao.api.GroupDAO;
import com.example.diplom.dao.impl.GroupDAOimpl;
import com.example.diplom.entity.GroupEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class GroupController {

    @Autowired
    GroupDAOimpl groupDAOimpl;
    @Autowired
    GroupDAO groupDAO;

    @Autowired
    JdbcTemplate jdbcTemplate;

    final static Logger LOG = LoggerFactory.getLogger(TeacherController.class);

    @RequestMapping(value = "/group", method = RequestMethod.GET)
    public List<GroupEntity> getAll() {
        LOG.debug("Getting all groups");

        return (List<GroupEntity>) groupDAO.findAll();
    }


    @RequestMapping(value = "/group/{id}", method = RequestMethod.GET)
    public Optional<GroupEntity> getById(@PathVariable("id") String id) {
        LOG.debug("Getting group {}", id);
        return groupDAO.findById(Integer.decode(id));
    }
}
