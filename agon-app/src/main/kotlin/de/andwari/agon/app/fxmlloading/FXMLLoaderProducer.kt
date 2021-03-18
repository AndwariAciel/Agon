package de.andwari.agon.app.fxmlloading

import jakarta.enterprise.inject.Instance
import jakarta.enterprise.inject.Produces
import jakarta.inject.Inject
import javafx.fxml.FXMLLoader
import javafx.util.Callback

class FXMLLoaderProducer {

    @Inject
    lateinit var instance: Instance<Any>

    @Produces
    fun getFXMLLoader(): FXMLLoader {
        val fxmlLoader = FXMLLoader()
        fxmlLoader.controllerFactory = Callback {
                p -> instance.select(p).get()
        }
        return fxmlLoader
    }
}