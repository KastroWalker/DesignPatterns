package dev.kastro.creational.FactoryMethod.factories

import dev.kastro.creational.FactoryMethod.buttons.Button

abstract class Dialog {
    abstract fun createButton(): Button

    fun render() {
        val okButton = createButton()
        okButton.render()
        okButton.onClick()
    }
}