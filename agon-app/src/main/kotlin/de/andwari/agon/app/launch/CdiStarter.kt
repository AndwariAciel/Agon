package de.andwari.agon.app.launch

import javafx.application.Application
import javafx.stage.Stage
import org.jboss.weld.environment.se.Weld

class CdiStarter : Application() {

    override fun start(stage: Stage?) {
        if (stage == null)
            return
        val container = Weld().initialize()

        container.select(Initializer::class.java).get().initialize(stage)

    }
}