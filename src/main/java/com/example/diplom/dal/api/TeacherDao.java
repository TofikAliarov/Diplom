package com.example.diplom.dal.api;

import com.example.diplom.entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherDao extends JpaRepository<TeacherEntity, Integer> {

    @Query("SELECT teacher FROM TeacherEntity teacher WHERE login = :log AND password = :pass")
    TeacherEntity login(@Param("log") String log, @Param("pass") String pass);
}
