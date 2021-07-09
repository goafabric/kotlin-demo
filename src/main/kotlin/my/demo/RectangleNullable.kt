package my.demo

import java.util.concurrent.atomic.AtomicLong

class RectangleNullable(val height: Double, private val length: Double?) {
    val perimeter = calcPerimeter(height, length)

    constructor(height: Double) : this(height, 2.0) //secondary constructor

    val duration = AtomicLong()

    private fun calcPerimeter (height: Double, length: Double?) : Double {
        duration.set(0L);
        return (height + length!!) * 2
    }

}