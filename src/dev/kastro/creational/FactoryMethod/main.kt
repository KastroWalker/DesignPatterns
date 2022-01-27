package dev.kastro.creational.FactoryMethod

import dev.kastro.creational.FactoryMethod.factories.Dialog
import dev.kastro.creational.FactoryMethod.factories.WebDialog
import dev.kastro.creational.FactoryMethod.factories.WindowsDialog

class Application {
    var dialog: Dialog? = null
    val config = "Web"

    fun initialize() {
        if (config === "Windows") {
            dialog = WindowsDialog()
        } else if (config === "Web") {
            dialog = WebDialog()
        } else {
            throw Exception("Error! Unknown operating system.")
        }
    }

    fun main() {
        this.initialize()
        dialog?.render()
    }
}

fun main () {
    val application = Application()
    application.main()
}