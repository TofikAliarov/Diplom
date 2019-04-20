package com.example.diplom.dal.api;

import com.example.diplom.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface StudentDao extends JpaRepository<StudentEntity, Integer> {

}
