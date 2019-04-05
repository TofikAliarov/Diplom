package com.example.diplom.DAO.impl;

import com.example.diplom.DAO.api.GroupDAO;
import com.example.diplom.Entity.Group;

import java.util.List;

public class GroupDAOimpl extends AbstrctDAO implements GroupDAO {

    @Override
    public boolean update(Group group, String id) {
        return false;
    }

    @Override
    public boolean insert(Group group) {
        return false;
    }

    @Override
    public List<Group> groupsearch(String searchRequest) {
        return null;
    }

    @Override
    public List<Group> getAll() {
        return null;
    }

    @Override
    public Group getById(Integer id) {
        return null;
    }

    @Override
    public List<Group> getBy(String fieldName, String value) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
