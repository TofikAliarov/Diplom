package com.example.diplom.dal.api;


import com.example.diplom.entity.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDao extends JpaRepository<AdminEntity, Integer> {


}
