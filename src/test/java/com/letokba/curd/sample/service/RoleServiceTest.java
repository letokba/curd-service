package com.letokba.curd.sample.service;

import com.letokba.curd.sample.entity.Role;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RoleServiceTest {

    private RoleService service;

    @Autowired
    public void setService(RoleService service) {
        this.service = service;
    }


    @Test
    void findById() {
        Role role = service.getById(2);
        System.out.println(role);
    }
}