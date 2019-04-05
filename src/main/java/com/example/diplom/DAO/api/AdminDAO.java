package com.example.diplom.DAO.api;

import com.example.diplom.Entity.Admin;


public interface AdminDAO extends DAO<Admin> {
    boolean update(Admin admin, String id);

    boolean insert(Admin admin);

}
