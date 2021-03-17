package de.andwari.agon.app.controller

import de.andwari.agon.app.fxmlloading.FxmlController
import de.andwari.agon.app.fxmlloading.FxmlLoader
import jakarta.inject.Inject
import javafx.fxml.FXML
import javafx.scene.control.Button

class StartPageController : FxmlController() {

    @Inject
    lateinit var loader: FxmlLoader

    @FXML
    lateinit var fxButton: Button;

    override fun initialize() {
    }

    fun onPress() {
        loader.loadInNewPage("fxml/StartPage.fxml", this, null)
    }
}