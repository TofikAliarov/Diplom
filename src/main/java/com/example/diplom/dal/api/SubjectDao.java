package com.example.diplom.dal.api;

import com.example.diplom.entity.SubjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectDao extends JpaRepository<SubjectEntity, Integer> {

}
