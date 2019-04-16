package com.example.diplom.controllers;

import com.example.diplom.dal.api.GroupDao;
import com.example.diplom.dal.impl.GroupDAOimpl;
import com.example.diplom.entity.GroupEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GroupController {

    @Autowired
    GroupDAOimpl groupDAOimpl;
    @Autowired
    GroupDao groupDao;

    @Autowired
    JdbcTemplate jdbcTemplate;

    final static Logger LOG = LoggerFactory.getLogger(TeacherController.class);

    @RequestMapping(value = "/groups", method = RequestMethod.GET)
    public List<GroupEntity> getAll() {
        LOG.debug("Getting all groups");

        return groupDao.findAll();
    }


    @RequestMapping(value = "/groups/{id}", method = RequestMethod.GET)
    public Optional<GroupEntity> getById(@PathVariable("id") String id) {
        LOG.debug("Getting group {}", id);
        return groupDao.findById(Integer.decode(id));
    }

    @RequestMapping(value = "/groups/", method = RequestMethod.DELETE)
    public void deleteAll() {
        LOG.debug("Deleting all groups");
        groupDao.deleteAll();
    }

    @RequestMapping(value = "/groups/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        LOG.debug("Deleting groups {}", id);
        groupDao.deleteById(Integer.decode(id));
    }

    @RequestMapping(value = "/groups", method = RequestMethod.POST)
    public GroupEntity create(@RequestBody GroupEntity group) {
        LOG.debug("Creating groups {}", group);
        return groupDao.save(group);
    }
}
