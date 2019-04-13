package com.example.diplom.dao.impl;


import com.example.diplom.dao.api.DAO;
import com.example.diplom.dao.api.TeacherDAO;
import com.example.diplom.entity.TeacherEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class TeacherDAOimpl extends AbstrctDAO implements DAO {

    @Autowired
    private TeacherDAO teacherDAO;

    @Override
    public List getBy(String fieldName, String value) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    public List<TeacherEntity> getAll() {
        return (List<TeacherEntity>) teacherDAO.findAll();
    }
}
