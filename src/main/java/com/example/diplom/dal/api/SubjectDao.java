package com.example.diplom.dal.api;

import com.example.diplom.entity.SubjectEntity;
import com.example.diplom.entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectDao extends JpaRepository<SubjectEntity, Integer> {
    @Query("SELECT gets FROM SubjectEntity gets WHERE teacher_id = :id")
    public List<SubjectEntity> getTeachersSubjects(@Param("id") int id);

    @Query("SELECT gets FROM SubjectEntity gets WHERE group_id = :id")
    public List<SubjectEntity> getGroupsSubjects(@Param("id") int id);

}
