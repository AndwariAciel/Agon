package de.andwari.agon.app.controller

import de.andwari.agon.app.fxmlloading.FxmlController
import de.andwari.agon.app.fxmlloading.FxmlLoader
import de.andwari.agon.app.fxmlloading.START
import de.andwari.agon.business.service.PlayerService
import de.andwari.agon.business.service.PropertyService
import de.andwari.agon.core.persistance.repositories.PlayerRepository
import jakarta.inject.Inject
import javafx.fxml.FXML
import javafx.scene.control.Button

class StartPageController : FxmlController() {

    @FXML
    lateinit var fxButton: Button;

    override fun initialize() {


    }

}