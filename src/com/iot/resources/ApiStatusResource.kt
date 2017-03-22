package com.iot.resources

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces

/**
 * Created by JGabrielFreitas on 22/03/17.
 */

@Path("status")
class ApiStatusResource {

    @GET
    @Produces("text/plain")
    fun getClichedMessage(): String  {
        return "STATUS - OK";
    }
}