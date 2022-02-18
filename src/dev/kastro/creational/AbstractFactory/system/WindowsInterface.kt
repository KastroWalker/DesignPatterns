package dev.kastro.creational.AbstractFactory.system

import dev.kastro.creational.AbstractFactory.button.WindowsButton
import dev.kastro.creational.AbstractFactory.checkbox.WindowsCheckbox
import dev.kastro.creational.AbstractFactory.selectbox.WindowsSelectbox

class WindowsInterface: SystemInterface {
    override fun createButton() = WindowsButton()

    override fun createCheckbox() = WindowsCheckbox()

    override fun createSelectbox() = WindowsSelectbox()
}