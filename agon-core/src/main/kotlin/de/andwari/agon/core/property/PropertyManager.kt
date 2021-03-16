package de.andwari.agon.core.property

import java.io.File
import java.io.FileOutputStream
import java.util.*

class PropertyManager {

    fun findProperty(propertyName: String): String {
        javaClass.classLoader.getResourceAsStream("application.properties").use {
            val props = Properties()
            props.load(it)
            return props.getProperty(propertyName)
        }
    }

    fun saveProperty(propertyName: String, propertyValue: String) {
        val url = javaClass.classLoader.getResource("application.properties")
        FileOutputStream(File(url.toURI())).use {
            val props = Properties()
            props.setProperty(propertyName, propertyValue)
            props.store(it, null)
        }
    }
}
