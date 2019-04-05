package com.example.diplom.DAO.api;

import com.example.diplom.Entity.Gets;


public interface GetsDAO extends DAO<Gets> {
    boolean update(Gets gets, String id);

    boolean insert(Gets gets);

}
