package com.example.diplom.dao.api;


import com.example.diplom.entity.TeachesEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeachesDAO extends CrudRepository <TeachesEntity, Integer> {

}
