package com.iot.database;

/**
 * Created by JGabrielFreitas on 22/03/17.
 */
public class DatabaseJDBC extends AbstractJDBC {

    public DatabaseJDBC() {
    }

    @Override
    protected String getClassName() {
        return "org.sqlite.JDBC";
    }

    @Override
    protected String getDriver() {
        return "jdbc:sqlite:database.sqlite";
    }
}
