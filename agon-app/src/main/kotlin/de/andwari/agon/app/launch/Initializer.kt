package de.andwari.agon.app.launch

import de.andwari.agon.business.service.PropertyService
import jakarta.inject.Inject
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage
import java.util.*

class Initializer() {

    @Inject
    lateinit var loader: FXMLLoader

    @Inject
    lateinit var propertyService: PropertyService

    fun initialize(stage: Stage) {
        loader.resources = ResourceBundle.getBundle("lang.lang", propertyService.getLanguage())
        loader.location = javaClass.classLoader.getResource("fxml/main.fxml")
        val parent = loader.load<Parent>()
        stage.scene = Scene(parent)

        stage.show()
        stage.isMaximized = true
    }

}