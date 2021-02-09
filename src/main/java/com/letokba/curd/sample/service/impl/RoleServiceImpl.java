package com.letokba.curd.sample.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.letokba.curd.sample.entity.Role;
import com.letokba.curd.sample.mapper.RoleMapper;
import com.letokba.curd.sample.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Yong
 * @date 2021/2/9
 */
@Service
public class RoleServiceImpl implements RoleService {

    private RoleMapper roleMapper;

    @Autowired
    public void setRoleMapper(RoleMapper roleMapper) {
        this.roleMapper = roleMapper;
    }

    @Override
    public BaseMapper<Role> getDao() {
        return roleMapper;
    }
}
