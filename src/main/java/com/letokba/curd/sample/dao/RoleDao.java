package com.letokba.curd.sample.dao;


import com.letokba.curd.sample.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Yong
 * @date 2021/1/23
 */
@Repository
public interface RoleDao extends JpaRepository<Role, Integer> {


}
