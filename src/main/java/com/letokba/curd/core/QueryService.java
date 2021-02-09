package com.letokba.curd.core;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * @author Yong
 * @date 2021/2/8
 */
public interface QueryService<T, ID> {
    /**
     * query a entity by it's ID
     * @param id the entity's id
     * @return null or one Object
     */
    default T findById(ID id) {
        return getDao().findById(id).orElse(null);
    }


    /**
     * query more entities by more ids
     * @param ids a series of id
     * @return null or List
     */
    default List<T> findAllById(Iterable<ID> ids) {
        return getDao().findAllById(ids);
    }

    /**
     * query a entity by one or more conditions.
     * @param t if attribute of t is not null, it will be condition.
     * @return  null or one Object.
     */
    default T findOne(T t){
        return getDao().findOne(Example.of(t)).orElse(null);
    }

    /**
     * query more entities by one or more conditions.
     * @param t if attribute of t is not null, it will be condition.
     * @return list
     */
    default List<T> findAll(T t) {
        return getDao().findAll(Example.of(t));
    }

    /**
     * query more entities
     * @return list
     */
    default List<T> findAll() {
        return getDao().findAll();
    }

    /**
     * simple page-query by one or more conditions.
     * @param t if attribute of t is not null, it will be condition.
     * @param page which page
     * @param size the size of a page
     * @return list
     */
    default List<T> findPage(T t, int page, int size) {
        return getDao().findAll(PageRequest.of(page, size)).getContent();
    }



    /**
     * 获取 Dao
     * @return {@link Repository}
     */
    JpaRepository<T, ID> getDao();


}
