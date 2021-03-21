package de.andwari.agon.app.controller

import de.andwari.agon.app.fxmlloading.FxmlController
import de.andwari.agon.app.fxmlloading.FxmlLoader
import de.andwari.agon.app.fxmlloading.START
import de.andwari.agon.business.service.PropertyService
import jakarta.inject.Inject
import javafx.fxml.FXML
import javafx.scene.control.Button

class StartPageController : FxmlController() {

    @Inject
    lateinit var test:PropertyService

    @FXML
    lateinit var fxButton: Button;

    override fun initialize() {


    }

    fun onPress() {
        test.test()

    }
}