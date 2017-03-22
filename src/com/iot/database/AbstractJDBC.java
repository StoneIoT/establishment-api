package com.iot.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by JGabrielFreitas on 22/03/17.
 */
public abstract class AbstractJDBC {

    private Connection connection;
    private Statement  statement;

    public AbstractJDBC() {
        // load the sqlite-JDBC driver using the current class loader
        try {
            Class.forName(getClassName());
            connection = DriverManager.getConnection(getDriver());
            statement  = connection.createStatement();
            statement.setQueryTimeout(10);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    protected abstract String getClassName();

    protected abstract String getDriver();

    public Connection getConnection() {
        return connection;
    }

    public Statement getStatement() {
        return statement;
    }
}
