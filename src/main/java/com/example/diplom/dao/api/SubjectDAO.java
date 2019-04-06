package com.example.diplom.dao.api;

import com.example.diplom.entity.Subject;

import java.util.List;

public interface SubjectDAO extends DAO<Subject> {

    boolean update(Subject subject, String id);

    boolean insert(Subject subject);


    List<Subject> subjectsearch(String searchRequest);
}
