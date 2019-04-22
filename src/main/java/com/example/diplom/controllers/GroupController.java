package com.example.diplom.controllers;

import com.example.diplom.dal.api.GroupDao;
import com.example.diplom.dal.impl.GroupDAOimpl;
import com.example.diplom.entity.GroupsEntity;
import com.example.diplom.exception.GroupException;
import com.example.diplom.exception.StudentException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
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
    public List<GroupsEntity> getAll() {
        LOG.debug("Getting all groups");

        return groupDao.findAll();
    }


    @RequestMapping(value = "/groups/{id}", method = RequestMethod.GET)
    public Optional<GroupsEntity> getById(@PathVariable("id") String id) {
        final Optional<GroupsEntity> groupsEntity = this.groupDao.findById(Integer.valueOf(id));
        if (groupsEntity != null) {
            LOG.info("Getting group {}", id);
            return groupDao.findById(Integer.valueOf(id));
        } else
            LOG.warn("no group", id);
        throw new GroupException(id);


    }

    @RequestMapping(value = "/groups/", method = RequestMethod.DELETE)
    public void deleteAll() {
        LOG.info("Deleting all groups");
        groupDao.deleteAll();
    }

    @RequestMapping(value = "/groups/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        LOG.info("Deleting groups {}", id);
        groupDao.deleteById(Integer.decode(id));
    }

    @RequestMapping(value = "/groups", method = RequestMethod.POST)
    public GroupsEntity create(@RequestBody GroupsEntity group) {
        LOG.info("Creating groups {}", group);
        return groupDao.save(group);
    }


}
