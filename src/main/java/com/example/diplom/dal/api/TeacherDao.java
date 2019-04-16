package com.example.diplom.dal.api;

import com.example.diplom.entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherDao extends JpaRepository<TeacherEntity, Integer> {

}
