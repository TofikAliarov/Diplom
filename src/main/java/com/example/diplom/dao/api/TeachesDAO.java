package com.example.diplom.dao.api;


import com.example.diplom.entity.Teaches;


public interface TeachesDAO extends DAO<Teaches> {
    boolean update(Teaches gets, String id);

    boolean insert(Teaches teaches);

    boolean delete(Teaches teaches);
}
