package dev.kastro.creational.FactoryMethod.buttons

class HtmlButton: Button {
    override fun render() {
        println("Rendering html button")
    }

    override fun onClick() {
        println("Clicking html button")
    }
}