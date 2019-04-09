package com.example.diplom.dao.api;

import com.example.diplom.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentDAO extends CrudRepository<Student, Integer> {
}
