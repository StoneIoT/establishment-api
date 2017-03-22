package com.iot

import java.io.File
import java.net.URL
import java.util.ArrayList

/**
 * Created by JGabrielFreitas on 22/03/17.
 */
object ClassFinder {

    val PKG_SEPARATOR = '.'
    val DIR_SEPARATOR = '/'
    val CLASS_FILE_SUFFIX = ".class"
    val BAD_PACKAGE_ERROR = "Unable to get resources from path '%s'. Are you sure the package '%s' exists?"

    fun find(scannedPackage: String): List<Class<*>> {
        val scannedPath = scannedPackage.replace(PKG_SEPARATOR, DIR_SEPARATOR)
        val scannedUrl = Thread.currentThread().contextClassLoader.getResource(scannedPath) ?: throw IllegalArgumentException(String.format(BAD_PACKAGE_ERROR, scannedPath, scannedPackage))
        val scannedDir = File(scannedUrl.file)
        val classes = ArrayList<Class<*>>()
        for (file in scannedDir.listFiles()!!) {
            classes.addAll(find(file, scannedPackage))
        }
        return classes
    }

    private fun find(file: File, scannedPackage: String): List<Class<*>> {
        val classes = ArrayList<Class<*>>()
        val resource = scannedPackage + PKG_SEPARATOR + file.name
        if (file.isDirectory) {
            for (child in file.listFiles()!!) {
                classes.addAll(find(child, resource))
            }
        } else if (resource.endsWith(CLASS_FILE_SUFFIX)) {
            val endIndex  = resource.length - CLASS_FILE_SUFFIX.length
            val className = resource.substring(0, endIndex)
            try {
                classes.add(Class.forName(className))
            } catch (ignore: ClassNotFoundException) {
            }

        }
        return classes
    }

}