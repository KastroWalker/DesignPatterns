package dev.kastro.creational.AbstractFactory

import dev.kastro.creational.AbstractFactory.button.Button
import dev.kastro.creational.AbstractFactory.checkbox.Checkbox
import dev.kastro.creational.AbstractFactory.selectbox.Selectbox
import dev.kastro.creational.AbstractFactory.system.SystemInterface

class Application (
    private val systemInterface: SystemInterface,
) {
    private lateinit var button: Button
    private lateinit var checkbox: Checkbox
    private lateinit var selectbox: Selectbox

    fun createUI() {
        this.button = systemInterface.createButton()
        this.checkbox = systemInterface.createCheckbox()
        this.selectbox = systemInterface.createSelectbox()
    }

    fun renderInterface() {
        this.button.renderButton()
        this.selectbox.renderSelectbox()
        this.checkbox.renderCheckbox()
    }
}