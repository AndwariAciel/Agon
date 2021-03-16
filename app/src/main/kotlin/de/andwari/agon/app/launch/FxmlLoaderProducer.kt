package de.andwari.agon.app.launch

import jakarta.enterprise.inject.Produces
import javafx.fxml.FXMLLoader

class FxmlLoaderProducer {

    @Produces
    fun getFXMLLoader(): FXMLLoader {
        return FXMLLoader()
    }
}