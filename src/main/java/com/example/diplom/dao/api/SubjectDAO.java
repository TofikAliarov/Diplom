package com.example.diplom.dao.api;

import com.example.diplom.entity.SubjectEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectDAO extends CrudRepository <SubjectEntity, Integer> {

}
