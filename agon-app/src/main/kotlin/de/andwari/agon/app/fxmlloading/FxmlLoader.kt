package de.andwari.agon.app.fxmlloading

import jakarta.enterprise.inject.Instance
import jakarta.inject.Inject
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage
import java.net.URL

open class FxmlLoader {

    @Inject
    private lateinit var loaderInstance: Instance<FXMLLoader>

    open fun loadInThisPage(
        resource: String,
        sourceController: FxmlController,
        stage: Stage,
        data: Array<Any>?
    ): FxmlController {
        val controller = load(resource, sourceController, stage, data)
        stage.show()
        return controller
    }

    open fun loadInNewPage(
        resource: String,
        sourceController: FxmlController,
        data: Array<Any>?
    ): FxmlController {
        return loadInThisPage(resource, sourceController, Stage(), data)
    }

    open fun loadInNewPageAndWait(
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
        sourceController: FxmlController,
        stage: Stage,
        data: Array<Any>?
    ): FxmlController {
        var loader = loaderInstance.get()
        loader.location = javaClass.classLoader.getResource(resource)
        val parent = loader.load<Parent>()
        stage.scene = Scene(parent)

        val controller = loader.getController<FxmlController>()
        controller.setup(stage, sourceController, data)
        return controller
    }


}