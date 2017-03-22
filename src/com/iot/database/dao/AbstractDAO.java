package com.iot.database.dao;

import com.iot.database.Database;
import com.iot.database.DatabaseJDBC;

/**
 * Created by JGabrielFreitas on 22/03/17.
 */
public abstract class AbstractDAO<T> implements Database<T> {

    private DatabaseJDBC jdbc;

    public AbstractDAO(DatabaseJDBC jdbc) {
        this.jdbc = jdbc;
    }

    public DatabaseJDBC getJdbc() {
        return jdbc;
    }
}
