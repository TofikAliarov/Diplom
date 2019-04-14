package com.example.diplom.dal.api;


import com.example.diplom.entity.GetsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GetsDAO extends CrudRepository <GetsEntity, Integer> {
}
