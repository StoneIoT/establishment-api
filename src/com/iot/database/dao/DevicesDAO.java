package com.iot.database.dao;

import com.iot.model.Device;
import com.njkremer.Sqlite.DataConnectionException;
import com.njkremer.Sqlite.DataConnectionManager;
import com.njkremer.Sqlite.SqlStatement;

import java.util.List;

/**
 * Created by JGabrielFreitas on 22/03/17.
 */
public class DevicesDAO extends AbstractDAO<Device> {

    private static DevicesDAO ourInstance = new DevicesDAO();

    public static DevicesDAO getInstance() {
        return ourInstance;
    }

    private DevicesDAO() {
        DataConnectionManager.init("database.db");
    }

    @Override
    public void insert(Device item) {
//        try {
//            SqlStatement.insert(Device.class).execute();
//        } catch (DataConnectionException e) {
//            e.printStackTrace();
//        }

        /**
         * http://ormlite.com/javadoc/ormlite-core/doc-files/ormlite_1.html#Getting-Started
         * */
    }

    @Override
    public void delete(Device item) {
        Device device = new Device(null, null);

    }

    @Override
    public void update(Device item) {

    }

    @Override
    public Device findById(int id) {
        return null;
    }

    @Override
    public List<Device> selectAll() {
        return null;
    }

    @Override
    protected String tableName() {
        return "devices";
    }
}
