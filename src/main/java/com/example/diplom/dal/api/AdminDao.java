package com.example.diplom.dal.api;


import com.example.diplom.entity.AdminEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDao extends CrudRepository<AdminEntity,Integer> {


}
