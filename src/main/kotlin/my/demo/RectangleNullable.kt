package my.demo

class RectangleNullable(val height: Double, private val length: Double?) {
    val perimeter = calcPerimeter(height, length)

    constructor(height: Double) : this(height, 2.0) //secondary constructor

    private fun calcPerimeter (height: Double, length: Double?) : Double {
        return (height + length!!) * 2
    }

}