package de.andwari.agon.app.launch

import de.andwari.agon.app.fxmlloading.FxmlLoader
import de.andwari.agon.business.service.PropertyService
import jakarta.inject.Inject
import javafx.stage.Stage

class Initializer() {

    @Inject
    lateinit var loader: FxmlLoader

    @Inject
    lateinit var propertyService: PropertyService

    fun initialize(stage: Stage) {
        loader.loadMainPage(stage)
    }

}