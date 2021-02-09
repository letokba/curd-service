package com.letokba.curd.sample.service;


import com.letokba.curd.core.CurdService;
import com.letokba.curd.sample.dao.UserDao;
import com.letokba.curd.sample.entity.User;

/**
 * @author Yong
 * @date 2021/2/8
 */
public interface UserService extends CurdService<User, UserDao, Integer> {


}
