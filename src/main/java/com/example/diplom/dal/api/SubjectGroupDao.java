package com.example.diplom.dal.api;

import com.example.diplom.entity.SubjectGroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SubjectGroupDao extends JpaRepository<SubjectGroupEntity, Integer> {

    @Query("SELECT groupId FROM SubjectGroupEntity WHERE subject_id = :id")
    public List<SubjectGroupEntity> getSubjectGroup(@Param("id") int id);
}
