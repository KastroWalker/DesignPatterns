package dev.kastro.creational.AbstractFactory.system

import dev.kastro.creational.AbstractFactory.button.LinuxButton
import dev.kastro.creational.AbstractFactory.checkbox.LinuxCheckbox
import dev.kastro.creational.AbstractFactory.selectbox.LinuxSelectbox

class LinuxInterface : SystemInterface {
    override fun createButton(): LinuxButton {
        return LinuxButton()
    }

    override fun createCheckbox(): LinuxCheckbox {
        return LinuxCheckbox()
    }

    override fun createSelectbox(): LinuxSelectbox {
        return LinuxSelectbox()
    }
}