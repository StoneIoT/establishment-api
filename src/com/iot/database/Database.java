package com.iot.database;

import java.util.List;

/**
 * Created by JGabrielFreitas on 22/03/17.
 */
public interface Database<T> {

    void insert(T item);

    void delete(T item);

    void update(T item);

    T findById(int id);

    List<T> selectAll();

}
