package de.andwari.agon.app.fxmlloading

import javafx.stage.Stage

abstract class FxmlController {

    lateinit var stage: Stage
    lateinit var source: FxmlController
    lateinit var data: Array<Any>

    fun setup(stage: Stage, source: FxmlController, data: Array<Any>?) {
        this.stage = stage
        this.source = source
        if(data != null)
            this.data = data
        else
            this.data = emptyArray()
        initialize()
    }

    abstract fun initialize()

}