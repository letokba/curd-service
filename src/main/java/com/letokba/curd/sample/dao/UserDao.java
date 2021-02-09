package com.letokba.curd.sample.dao;

import com.letokba.curd.sample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Yong
 * @date 2021/2/1
 */
public interface UserDao extends JpaRepository<User, Integer> {

    User findByUsername(String username);

    User findByMail(String mail);

    User findByPhone(String phone);


}
