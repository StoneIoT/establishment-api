package com.iot.database.dao;

import com.iot.database.DatabaseJDBC;
import com.iot.model.Device;

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
        super(new DatabaseJDBC());
    }


    @Override
    public void insert(Device item) {

    }

    @Override
    public void delete(Device item) {

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
}
