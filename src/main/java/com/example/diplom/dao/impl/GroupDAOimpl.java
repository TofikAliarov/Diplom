package com.example.diplom.dao.impl;

import com.example.diplom.dao.api.GroupDAO;
import com.example.diplom.entity.Group;

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
