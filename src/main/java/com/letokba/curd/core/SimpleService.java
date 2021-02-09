package com.letokba.curd.core;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Yong
 * @date 2021/2/8
 */
public interface SimpleService<T, D extends JpaRepository<T,ID>, ID> extends QueryService<T, ID> {

    /**
     * save a entity
     * @param t a not null Object of T
     */
    default void save(T t) {
        getDao().save(t);
    }

    /**
     * remove a entity
     * @param t a not null Object of T
     */
    default void remove(T t) {
        getDao().delete(t);
    }

    /**
     * update a entity
     * @param t a not null Object of T
     */
    default void update(T t) {
        save(t);
    }



}
