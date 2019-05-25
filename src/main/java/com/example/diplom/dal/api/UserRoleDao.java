package com.example.diplom.dal.api;

import com.example.diplom.entity.UserRoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleDao extends JpaRepository<UserRoleEntity, Integer> {

    @Query("SELECT userRole FROM UserRoleEntity userRole WHERE id = :roleId")
    String getRoleNameById(@Param("roleId") int roleId);
}
