package com.example.diplom.dao.api;

import com.example.diplom.entity.Admin;


public interface AdminDAO extends DAO<Admin> {
    boolean update(Admin admin, String id);

    boolean insert(Admin admin);

}
