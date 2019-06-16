package com.example.diplom.service;

import com.example.diplom.dal.api.AdminDao;
import com.example.diplom.dal.api.StudentDao;
import com.example.diplom.dal.api.TeacherDao;
import com.example.diplom.exception.LoginException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    StudentDao studentDao;

    @Autowired
    TeacherDao teacherDao;

    @Autowired
    AdminDao adminDao;

    public Object login(final String login, final String password) {
        Object loggedUser = studentDao.login(login, password);

        if (loggedUser == null) {
            loggedUser = teacherDao.login(login, password);

            if (loggedUser == null) {
                loggedUser = adminDao.login(login, password);

                if (loggedUser == null) {
                    throw new LoginException("Wrong username or password");
                }
            }

        }

        return loggedUser;
    }
}
