package com.letokba.curd.config;

import com.letokba.curd.CurdServiceApplication;
import com.letokba.curd.sample.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LoaderUtilsTest {
    String basePackage = "com.letokba.curd.sample";

    @Test
    void getResources() throws Exception{


        List<Class<?>> resources = LoaderUtils.getResources(basePackage);
        System.out.println(resources);
    }

    @Test
    void getArgumentType() throws Exception{
        List<Class<?>> resources = LoaderUtils.getResources(basePackage);
        for (Class<?> resource : resources) {
            Class<?> type = LoaderUtils.getArgumentType(resource, JpaRepository.class);
            System.out.println(type);
            System.out.println(LoaderUtils.beanName(resource.getSimpleName()));
        }
    }


}