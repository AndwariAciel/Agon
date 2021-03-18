package de.andwari.agon.app.fxmlloading

import de.andwari.agon.business.service.PropertyService
import jakarta.enterprise.inject.Instance
import jakarta.inject.Inject
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage
import java.util.*

class FxmlLoader {

    @Inject
    lateinit var propertyService: PropertyService

    @Inject
    private lateinit var loaderInstance: Instance<FXMLLoader>

    fun loadMainPage(stage: Stage) {
        load(MAIN, null, stage, emptyArray())
        stage.show()
        stage.isMaximized = true
    }

    fun loadInThisPage(
        resource: String,
        sourceController: FxmlController,
        stage: Stage,
        data: Array<Any>?
    ): FxmlController {
        val controller = load(resource, sourceController, stage, data)
        stage.show()
        return controller
    }

    fun loadInNewPage(
        resource: String,
        sourceController: FxmlController?,
        data: Array<Any>?
    ): FxmlController {
        val stage = Stage()
        val controller = load(resource, sourceController, stage, data)
        stage.show()
        return controller
    }

    fun loadInNewPageAndWait(
        resource: String,
        sourceController: FxmlController,
        data: Array<Any>?
    ): FxmlController {
        val stage = Stage()
        val controller = load(resource, sourceController, stage, data)
        stage.showAndWait()
        return controller
    }

    private fun load(
        resource: String,
        sourceController: FxmlController?,
        stage: Stage,
        data: Array<Any>?
    ): FxmlController {
        val loader = loaderInstance.get()
        loader.resources = ResourceBundle.getBundle("lang.lang", propertyService.getLanguage())
        loader.location = javaClass.classLoader.getResource(resource)
        val parent = loader.load<Parent>()
        stage.scene = Scene(parent)

        val controller = loader.getController<FxmlController>()

        if(sourceController == null)
            controller.setup(stage, controller, data)
        else
            controller.setup(stage, sourceController, data)

        return controller
    }


}