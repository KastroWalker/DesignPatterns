package dev.kastro.creational.FactoryMethod.factories

import dev.kastro.creational.FactoryMethod.buttons.Button
import dev.kastro.creational.FactoryMethod.buttons.WindowsButton

class WindowsDialog: Dialog() {
    override fun createButton(): Button {
        return WindowsButton()
    }
}