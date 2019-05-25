package com.example.diplom.service;

import com.example.diplom.dal.api.StudentDao;
import com.example.diplom.dal.api.UserRoleDao;
import com.example.diplom.entity.StudentEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginService implements UserDetailsService {

    private final static Logger LOG = LoggerFactory.getLogger(LoginService.class);

    @Autowired
    UserRoleDao userRoleDao;

    @Autowired
    StudentDao studentDao;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        final StudentEntity student = studentDao.getStudentByLogin(login);

        if (student == null) {
            LOG.error("User not found: ", login);
            throw new UsernameNotFoundException(String.format("User %s login wasn't found", login));
        }

        LOG.info(String.format("Found user: %s", login));

        String userRole = userRoleDao.getRoleNameById(student.getUserRole());

        List<GrantedAuthority> grantList = new ArrayList<>();

        if (userRole != null) {
            GrantedAuthority authority = new SimpleGrantedAuthority(userRole);
            grantList.add(authority);
        }
//
        return new User(student.getLogin(), student.getPassword(), grantList);
    }
}
