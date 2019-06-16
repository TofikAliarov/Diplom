package com.example.diplom.dal.api;

import com.example.diplom.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentDao extends JpaRepository<StudentEntity, Integer> {
    @Query("SELECT gets FROM StudentEntity gets WHERE group_id = :id")
    List<StudentEntity> getStudentsGroup(@Param("id") int id);

    @Query("SELECT student FROM StudentEntity student WHERE login = :log AND password = :pass")
    StudentEntity login(@Param("log") String log, @Param("pass") String pass);

}
