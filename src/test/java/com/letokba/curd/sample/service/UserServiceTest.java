package com.letokba.curd.sample.service;

import com.letokba.curd.sample.dao.UserDao;
import com.letokba.curd.sample.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserService userService;


    @Test
    void findById() {
        User user = userService.getById(1);
        System.out.println(user);
        System.out.println(userService.getDao());
    }

    @Test
    void findAllById() {
        userService.listByIds(new ArrayList<>());
        System.out.println();
    }

    @Test
    void findOne() {
        User user = new User();
        User one = userService.getOne(user);
        System.out.println(one);
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