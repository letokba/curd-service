package com.letokba.curd.sample.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.letokba.curd.sample.entity.Role;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Yong
 * @date 2021/2/9
 */
@Mapper
public interface RoleMapper extends BaseMapper<Role> {
}
