package com.example.diplom.DAO.api;

import com.example.diplom.Entity.Group;

import java.util.List;


public interface GroupDAO extends DAO<Group>{
    boolean update(Group group, String id);

    boolean insert(Group group);

    List<Group> groupsearch(String searchRequest);
}
