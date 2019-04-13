package com.example.diplom.dao.api;


import com.example.diplom.entity.AdminEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDAO extends CrudRepository<AdminEntity,Integer> {


}
