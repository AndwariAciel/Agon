package de.andwari.agon.app.controller

import de.andwari.agon.app.fxmlloading.FxmlController
import javafx.fxml.FXML
import javafx.scene.control.Button

class PlayerPageController : FxmlController() {

    @FXML
    lateinit var btnAddPlayer: Button

    override fun initialize() {
    }

    fun addPlayer() {
        print("add player!!")
    }

    fun deletePlayer() {

    }
}