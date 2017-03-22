package com.iot.model

import com.j256.ormlite.field.DatabaseField
import com.j256.ormlite.table.DatabaseTable

/**
 * Created by JGabrielFreitas on 22/03/17.
 */

@DatabaseTable(tableName = "Devices")
class Device(model: String, operationSystem: String) {

    @DatabaseField(id = true, columnName = "id")            var id: Int         = 0
    @DatabaseField(canBeNull = false, columnName = "model") var model           = model
    @DatabaseField(canBeNull = false, columnName = "model") var operationSystem = operationSystem
}