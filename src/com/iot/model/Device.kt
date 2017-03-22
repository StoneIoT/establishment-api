package com.iot.model

import com.google.gson.annotations.SerializedName

/**
 * Created by JGabrielFreitas on 22/03/17.
 */
class Device(var model: String, @SerializedName("operation_system") var operationSystem: String) {
    var id: Int = 0
}