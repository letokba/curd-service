package com.letokba.curd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Yong
 */
@SpringBootApplication
@MapperScan(basePackages = "com.letokba.curd.sample.mapper")
@EnableAspectJAutoProxy
public class CurdServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurdServiceApplication.class, args);
    }

}
