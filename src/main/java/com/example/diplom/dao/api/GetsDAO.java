package com.example.diplom.dao.api;

import com.example.diplom.entity.Gets;


public interface GetsDAO extends DAO<Gets> {
    boolean update(Gets gets, String id);

    boolean insert(Gets gets);

}
