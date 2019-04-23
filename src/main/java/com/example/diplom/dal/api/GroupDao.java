package com.example.diplom.dal.api;

import com.example.diplom.entity.GroupsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupDao extends JpaRepository<GroupsEntity, Integer> {
    @Query("SELECT gets FROM GroupsEntity gets WHERE subject_id = :id")
    public List<GroupsEntity> getGroupsSubjects(@Param("id") int id);
}
