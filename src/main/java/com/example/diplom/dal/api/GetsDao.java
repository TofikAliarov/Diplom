package com.example.diplom.dal.api;


import com.example.diplom.entity.GetsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GetsDao extends JpaRepository<GetsEntity, Integer> {

    @Query("SELECT gets FROM GetsEntity gets WHERE student_id = :id")
    public List<GetsEntity> getByStudentId(@Param("id") int id);

    @Query("SELECT gets FROM GetsEntity gets WHERE student_id = :studentId AND subject_id = :subjectId")
    public List<GetsEntity> getByStudentAndSubject(@Param("studentId") int studentId,
                                                   @Param("subjectId") int subjectId);
}
