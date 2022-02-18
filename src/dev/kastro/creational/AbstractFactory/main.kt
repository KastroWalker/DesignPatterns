package dev.kastro.creational.AbstractFactory

import dev.kastro.creational.AbstractFactory.system.LinuxInterface
import dev.kastro.creational.AbstractFactory.system.MacInterface
import dev.kastro.creational.AbstractFactory.system.SystemInterface
import dev.kastro.creational.AbstractFactory.system.WindowsInterface

fun main() {
    val operationalSystem = "windows";
    val systemInterface: SystemInterface

    if (operationalSystem == "linux") {
        systemInterface = LinuxInterface()
    } else if (operationalSystem == "mac") {
        systemInterface = MacInterface()
    } else if (operationalSystem == "windows") {
        systemInterface = WindowsInterface()
    } else {
        throw Exception("unknow Operational System")
    }

    val application = Application(systemInterface)
    application.createUI()
    application.renderInterface()
}