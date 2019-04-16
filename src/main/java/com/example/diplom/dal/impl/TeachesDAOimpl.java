package com.example.diplom.dal.impl;


import com.example.diplom.dal.api.DAO;
import com.example.diplom.dal.api.TeachesDao;
import com.example.diplom.entity.TeachesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class TeachesDAOimpl extends AbstrctDAO implements DAO {
    @Autowired
    private TeachesDao teachesDao;

    @Override
    public List getBy(String fieldName, String value) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    public List<TeachesEntity> getAll() {
        return (List<TeachesEntity>) teachesDao.findAll();
    }
}
