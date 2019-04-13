package com.example.diplom.dao.impl;

import com.example.diplom.dao.api.DAO;
import com.example.diplom.dao.api.GroupDAO;
import com.example.diplom.entity.GroupEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class GroupDAOimpl extends AbstrctDAO implements DAO {

    @Autowired
    private GroupDAO groupDAO;

    @Override
    public List getBy(String fieldName, String value) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    public List<GroupEntity> getAll() {
        return (List<GroupEntity>) groupDAO.findAll();
    }

}
