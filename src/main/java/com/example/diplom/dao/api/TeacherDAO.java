package com.example.diplom.dao.api;

import com.example.diplom.entity.TeacherEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherDAO extends CrudRepository<TeacherEntity, Integer> {

}
