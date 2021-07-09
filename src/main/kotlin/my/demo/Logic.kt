package my.demo

class Logic {
    fun run() {
        val rectangle = Rectangle(5.0, 5.0)

        println("The perimeter is ${rectangle.perimeter}")
        println("The height is ${rectangle.height}")

        val rectangleNullable = RectangleNullable(2.0, 5.0)
    }
}