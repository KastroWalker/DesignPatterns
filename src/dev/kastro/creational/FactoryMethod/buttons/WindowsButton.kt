package dev.kastro.creational.FactoryMethod.buttons

class WindowsButton: Button {
    override fun render() {
        println("Rendering windows button")
    }

    override fun onClick() {
        println("Clicking windows button")
    }
}