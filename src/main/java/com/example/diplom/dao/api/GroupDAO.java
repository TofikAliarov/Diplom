package com.example.diplom.dao.api;

import com.example.diplom.entity.Group;

import java.util.List;


public interface GroupDAO extends DAO<Group>{
    boolean update(Group group, String id);

    boolean insert(Group group);

    List<Group> groupsearch(String searchRequest);
}
