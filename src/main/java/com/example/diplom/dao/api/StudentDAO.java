package com.example.diplom.dao.api;

import com.example.diplom.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentDAO extends CrudRepository<StudentEntity, Integer> {
}
