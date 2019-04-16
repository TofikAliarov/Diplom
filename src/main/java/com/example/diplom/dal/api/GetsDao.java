package com.example.diplom.dal.api;


import com.example.diplom.entity.GetsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GetsDao extends JpaRepository<GetsEntity, Integer> {
}
