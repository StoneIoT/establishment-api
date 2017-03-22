package com.iot.model

import com.google.gson.annotations.SerializedName
import com.njkremer.Sqlite.Annotations.AutoIncrement
import com.njkremer.Sqlite.Annotations.PrimaryKey

/**
 * Created by JGabrielFreitas on 22/03/17.
 */
class Device(model: String, operationSystem: String) {

    @AutoIncrement @PrimaryKey var id: Int = 0
    var model = model
    @SerializedName("operation_system") var operationSystem = operationSystem
}