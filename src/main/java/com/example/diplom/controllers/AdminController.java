package com.example.diplom.controllers;


import com.example.diplom.dal.api.AdminDao;
import com.example.diplom.dal.impl.AdminDAOimpl;
import com.example.diplom.entity.AdminEntity;
import com.example.diplom.exception.AdminException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
public class AdminController {

    @Autowired
    AdminDAOimpl adminDAOimpl;
    @Autowired
    AdminDao adminDao;

    @Autowired
    JdbcTemplate jdbcTemplate;

    final static Logger LOG = LoggerFactory.getLogger(TeacherController.class);

    @RequestMapping(value = "/admins", method = RequestMethod.GET)
    public List<AdminEntity> getAll() {
        LOG.info("Getting all admins");

        return adminDao.findAll();
    }


    @RequestMapping(value = "/admins/{id}", method = RequestMethod.GET)
    public Optional<AdminEntity> getById(@PathVariable("id") String id) {
        final Optional<AdminEntity> adminEntity = this.adminDao.findById(Integer.valueOf(id));
        if (adminEntity  != null) {
            LOG.info("Getting admin {}", id);
            return adminDao.findById(Integer.valueOf(id));
        }
        else
            LOG.warn("no admin", id);
        throw new AdminException(id);


    }
    @RequestMapping(value = "/admins/", method = RequestMethod.DELETE)
    public void deleteAll() {
        LOG.info("Deleting all admins");
        adminDao.deleteAll();
    }

    @RequestMapping(value = "/admins/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        LOG.info("Deleting admin {}", id);
        adminDao.deleteById(Integer.decode(id));
    }

    @RequestMapping(value = "/admins", method = RequestMethod.POST)
    public AdminEntity create(@RequestBody AdminEntity admin) {
        LOG.info("Creating admin {}", admin);
        return adminDao.save(admin);
    }
}
