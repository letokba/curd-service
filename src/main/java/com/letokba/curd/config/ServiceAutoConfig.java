package com.letokba.curd.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

/**
 * @author Yong
 * @date 2021/2/9
 */
@Configuration
public class ServiceAutoConfig implements ApplicationContextAware{

    private ApplicationContext context;



    public ServiceAutoConfig() {

    }


    public void init() {

    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
