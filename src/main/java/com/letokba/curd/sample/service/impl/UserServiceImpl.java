package com.letokba.curd.sample.service.impl;

import com.letokba.curd.sample.dao.UserDao;
import com.letokba.curd.sample.entity.User;
import com.letokba.curd.sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * @author Yong
 * @date 2021/2/9
 */
@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public JpaRepository<User, Integer> getDao() {
        return userDao;
    }
}
