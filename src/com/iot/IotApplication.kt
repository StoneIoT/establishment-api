package com.iot

import java.util.*
import javax.ws.rs.ApplicationPath
import javax.ws.rs.core.Application
import java.lang.System.out as sys

/**
 * Created by JGabrielFreitas on 22/03/17.
 */

@ApplicationPath("/")
class IotApplication : Application() {

    override fun getClasses(): Set<Class<*>> {
        return HashSet<Class<*>>().apply {

            val allClasses = ClassFinder.find("com.iot.resources")
            allClasses.forEach { add(Class.forName(it.name)) }
        }
    }
}
