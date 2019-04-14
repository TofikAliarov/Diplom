package com.example.diplom.dal.api;

import java.util.List;


public interface DAO<T> {

    public List<T> getBy(String fieldName, String value);

    public boolean delete(Integer id);
}