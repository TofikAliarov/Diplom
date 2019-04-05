package com.example.diplom.DAO.api;

import com.example.diplom.Entity.Subject;

import java.util.List;

public interface SubjectDAO extends DAO<Subject> {

    boolean update(Subject subject, String id);

    boolean insert(Subject subject);


    List<Subject> subjectsearch(String searchRequest);
}
