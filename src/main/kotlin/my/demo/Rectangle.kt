package my.demo

//height and length become automatic instance variables and are assigned
class Rectangle(val height: Double, private val length: Double) {
    val perimeter = calcPerimeter(height, length)

    private fun calcPerimeter (height: Double, length: Double) : Double {
        return (height + length) * 2
    }

}