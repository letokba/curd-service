package com.letokba.curd.sample.service;


import com.letokba.curd.core.CurdService;
import com.letokba.curd.sample.dao.RoleDao;
import com.letokba.curd.sample.entity.Role;

/**
 * @author Yong
 * @date 2021/2/8
 */
public interface RoleService extends CurdService <Role, RoleDao, Integer> {
}
