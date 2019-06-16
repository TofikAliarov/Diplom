package com.example.diplom.dal.api;


import com.example.diplom.entity.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDao extends JpaRepository<AdminEntity, Integer> {

    @Query("SELECT admin FROM AdminEntity admin WHERE login = :log AND password = :pass")
    AdminEntity login(@Param("log") String log, @Param("pass") String pass);
}
