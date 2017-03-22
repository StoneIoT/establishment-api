package com.iot.resources

import com.google.gson.Gson
import com.iot.model.Device
import com.iot.model.User
import java.util.*
import javax.ws.rs.*
import javax.ws.rs.core.Context
import javax.ws.rs.core.MediaType.APPLICATION_JSON
import javax.ws.rs.core.UriInfo

/**
 * Created by JGabrielFreitas on 22/03/17.
 */

@Path("user")
class UserResource {

    @POST
    @Path("new")
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    fun getToken(deviceReceived: String): String {

        val device: Device = Gson().fromJson(deviceReceived, Device::class.java)
        val userToken = User(UUID.randomUUID().toString())

        return Gson().toJson(userToken)
    }

}