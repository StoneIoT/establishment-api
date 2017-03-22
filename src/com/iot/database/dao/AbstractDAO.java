package com.iot.database.dao;

import com.iot.database.Database;

/**
 * Created by JGabrielFreitas on 22/03/17.
 */
public abstract class AbstractDAO<T> implements Database<T> {

    protected abstract String tableName();
}
