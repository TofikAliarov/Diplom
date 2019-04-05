package com.example.diplom.DAO.api;


import com.example.diplom.Entity.Teaches;


public interface TeachesDAO extends DAO<Teaches> {
    boolean update(Teaches gets, String id);

    boolean insert(Teaches teaches);

    boolean delete(Teaches teaches);
}
