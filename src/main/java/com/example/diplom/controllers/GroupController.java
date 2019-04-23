package com.example.diplom.controllers;

import com.example.diplom.dal.api.GroupDao;
import com.example.diplom.entity.GroupsEntity;
import com.example.diplom.exception.GroupException;
import com.example.diplom.service.GroupService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
public class GroupController {

    @Autowired
    GroupDao groupDao;

    @Autowired
    GroupService groupService;

    private final static Logger LOG = LoggerFactory.getLogger(GroupController.class);

    @RequestMapping(value = "/groups", method = RequestMethod.GET)
    public List<GroupsEntity> getAll() {
        LOG.debug("Getting all groups");

        return groupDao.findAll();
    }

    @RequestMapping(value = "/groups/{id}", method = RequestMethod.GET)
    public Optional<GroupsEntity> getById(@PathVariable("id") String id) {
        final GroupsEntity groupsEntity = this.groupDao.findById(Integer.valueOf(id)).get();
        if (groupsEntity != null) {
            LOG.info("Getting group {}", id);
            return groupDao.findById(Integer.valueOf(id));
        } else throw new GroupException(String.format("There is no group with id %s", id));
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

    @RequestMapping(value = "/groups/subjects", method = RequestMethod.GET)
    public List<GroupsEntity> getGroupsSubjects(@RequestParam(value = "id") int subject_id) {
        LOG.info("Getting all group of subject{}", subject_id);
        return groupDao.getGroupsSubjects(subject_id);
    }

    @RequestMapping(value = "/groups/subjects", method = RequestMethod.POST)
    public GroupsEntity addSubjectId(@RequestParam int groupId, int subjectId) {
        LOG.info("Adding subject {} to group {}", subjectId, groupId);
        return groupService.addSubjectToGroup(groupId, subjectId);
    }
}
