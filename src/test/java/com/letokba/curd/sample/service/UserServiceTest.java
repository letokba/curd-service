package com.letokba.curd.sample.service;

import com.letokba.curd.sample.dao.UserDao;
import com.letokba.curd.sample.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserService userService;


    @Test
    void findById() {
        User user = userService.findById(1);
        System.out.println(user);
    }

    @Test
    void findAllById() {
    }

    @Test
    void findOne() {
    }

    @Test
    void findAll() {
    }

    @Test
    void testFindAll() {
    }

    @Test
    void findPage() {
    }

}