package dev.kastro.creational.AbstractFactory.system

import dev.kastro.creational.AbstractFactory.button.MacButton
import dev.kastro.creational.AbstractFactory.checkbox.MacCheckbox
import dev.kastro.creational.AbstractFactory.selectbox.MacSelectbox

class MacInterface: SystemInterface {
    override fun createButton(): MacButton {
        return MacButton()
    }

    override fun createCheckbox(): MacCheckbox {
        return MacCheckbox()
    }

    override fun createSelectbox(): MacSelectbox {
        return MacSelectbox()
    }
}