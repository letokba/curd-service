package com.letokba.curd.core2;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * @author Yong
 * @date 2021/2/9
 */
public interface QueryService<T> {
    /**
     * query a entity by it's ID
     * @param id the entity's id
     * @return null or one Object
     */
    default T getById(Serializable id) {
        return getDao().selectById(id);
    }


    /**
     * query more entities by more ids
     * @param ids a series of id
     * @return null or List
     */
    default List<T> listByIds(Collection<? extends Serializable> ids) {
        return getDao().selectBatchIds(ids);
    }

    /**
     * query a entity by one or more conditions.
     * @param t if attribute of t is not null, it will be condition.
     * @return  null or one Object.
     */
    default T getOne(T t){
        return getDao().selectOne(new QueryWrapper<>(t));
    }

    /**
     * query more entities by one or more conditions.
     * @param t if attribute of t is not null, it will be condition.
     * @return list
     */
    default List<T> listAll(T t) {
        return getDao().selectList(new QueryWrapper<>(t));
    }

    /**
     * query more entities
     * @return list
     */
    default List<T> listAll() {
        return getDao().selectList(new QueryWrapper<>());
    }

    /**
     * simple page-query by one or more conditions.
     * @param t if attribute of t is not null, it will be condition.
     * @param page which page
     * @param size the size of a page
     * @return list
     */
    default List<T> getPage(T t, int page, int size) {
        return getDao().selectPage(new Page<T>(page, size), new QueryWrapper<>(t)).getRecords();
    }

    /**
     * 获取 Mapper
     * @return {@link BaseMapper}
     */
    BaseMapper<T> getDao();

}
