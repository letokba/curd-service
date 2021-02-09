package com.letokba.curd.sample.service;


import com.letokba.curd.core.SimpleService;
import com.letokba.curd.sample.dao.UserDao;
import com.letokba.curd.sample.entity.User;

/**
 * @author Yong
 * @date 2021/2/8
 */
public interface UserService extends SimpleService<User, UserDao, Integer> {


}
