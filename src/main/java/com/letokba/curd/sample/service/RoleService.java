package com.letokba.curd.sample.service;


import com.letokba.curd.annotation.CurdService;
import com.letokba.curd.core.SimpleService;
import com.letokba.curd.sample.dao.RoleDao;
import com.letokba.curd.sample.entity.Role;

/**
 * @author Yong
 * @date 2021/2/8
 */
@CurdService
public interface RoleService extends SimpleService<Role, RoleDao, Integer> {
}
