package com.iot.model

import com.google.gson.annotations.SerializedName

/**
 * Created by JGabrielFreitas on 22/03/17.
 */
class User(@SerializedName("client_id") val clientId:String) {
}