package com.example.diplom.dal.api;


import com.example.diplom.entity.TeachesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeachesDao extends JpaRepository<TeachesEntity, Integer> {

}
