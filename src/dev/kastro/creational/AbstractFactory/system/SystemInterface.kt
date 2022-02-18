package dev.kastro.creational.AbstractFactory.system

import dev.kastro.creational.AbstractFactory.button.Button
import dev.kastro.creational.AbstractFactory.checkbox.Checkbox
import dev.kastro.creational.AbstractFactory.selectbox.Selectbox

interface SystemInterface {
    fun createButton(): Button
    fun createCheckbox(): Checkbox
    fun createSelectbox(): Selectbox
}