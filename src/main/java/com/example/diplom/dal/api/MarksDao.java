package com.example.diplom.dal.api;


import com.example.diplom.entity.MarksEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarksDao extends JpaRepository<MarksEntity, Integer> {

    @Query("SELECT gets FROM MarksEntity gets WHERE student_id = :id")
    public List<MarksEntity> getByStudentId(@Param("id") int id);

    @Query("SELECT gets FROM MarksEntity gets WHERE student_id = :studentId AND subject_id = :subjectId")
    public List<MarksEntity> getBySubjectIdAndStudentId(@Param("studentId") int studentId,
                                                        @Param("subjectId") int subjectId);

    @Query("SELECT gets FROM MarksEntity gets WHERE role = :role AND subject_id = :subjectId AND student_id = :studentId")
    public List<MarksEntity> getBySubjectIdAndRoleId(@Param("role") int role,
                                                        @Param("subjectId") int subjectId,
                                                        @Param("studentId") int studentId);

}
