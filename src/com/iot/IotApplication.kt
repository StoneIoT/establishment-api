package com.iot

import com.iot.database.dao.DevicesDAO
import java.util.*
import javax.ws.rs.ApplicationPath
import javax.ws.rs.core.Application
import java.lang.System.out as sys

/**
 * Created by JGabrielFreitas on 22/03/17.
 */

@ApplicationPath("/")
class IotApplication : Application {

    constructor() {
        DevicesDAO.getInstance()
    }

    override fun getClasses(): Set<Class<*>> {
        return HashSet<Class<*>>().apply {
            ClassFinder.find("com.iot.resources").forEach { add(Class.forName(it.name)) }
        }
    }
}
