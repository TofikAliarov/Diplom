package com.example.diplom.dal.impl;

import com.example.diplom.dal.api.DAO;
import com.example.diplom.dal.api.GroupDao;
import com.example.diplom.entity.GroupsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class GroupDAOimpl extends AbstrctDAO implements DAO {

    @Autowired
    private GroupDao groupDao;

    @Override
    public List getBy(String fieldName, String value) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    public List<GroupsEntity> getAll() {
        return (List<GroupsEntity>) groupDao.findAll();
    }

}
