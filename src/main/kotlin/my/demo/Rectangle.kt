package my.demo

import java.util.concurrent.atomic.AtomicLong

//by indicating the constructor params as val, they become automatic instance variables
//and they are automatically initialized  with the constructor
class Rectangle(val height: Double, private val length: Double) {
    val perimeter = calcPerimeter(height, length)

    private fun calcPerimeter (height: Double, length: Double) : Double {
        return (height + length) * 2
    }

}