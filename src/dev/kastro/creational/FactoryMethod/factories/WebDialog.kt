package dev.kastro.creational.FactoryMethod.factories

import dev.kastro.creational.FactoryMethod.buttons.Button
import dev.kastro.creational.FactoryMethod.buttons.HtmlButton

class WebDialog: Dialog() {
    override fun createButton(): Button {
        return HtmlButton()
    }
}