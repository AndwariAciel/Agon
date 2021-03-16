package de.andwari.agon.business.service

import de.andwari.agon.core.property.PropertyManager
import jakarta.enterprise.context.RequestScoped
import jakarta.inject.Inject
import java.util.*

class PropertyService {

    val LANGUAGE = "lang"

    @Inject
    lateinit var propertyManager: PropertyManager

    fun getLanguage(): Locale {
        return Locale(propertyManager.findProperty(LANGUAGE))
    }

}