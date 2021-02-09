package com.letokba.curd.config;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LoaderUtilsTest {

    @Test
    void getResources() throws Exception{
        String basePackage = "com.letokba.curd.sample";

        List<Class<?>> resources = LoaderUtils.getResources(basePackage);
        System.out.println(resources);
    }
}