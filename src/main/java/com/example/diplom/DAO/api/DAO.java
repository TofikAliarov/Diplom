package com.example.diplom.DAO.api;

import java.util.List;


public interface DAO<T> {
    public List<T> getAll();

    public T getById(Integer id);

    public List<T> getBy(String fieldName, String value);

    public boolean delete(Integer id);
}