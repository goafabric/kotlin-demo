package my.demo

class RectangleNullable(private val height: Double, private val length: Double?) {
    val perimeter = (height + length!!) * 2

    constructor(height: Double) : this(height, 2.0) //secondary constructor

    fun dosomething() {
        println(dosomething())
    }
}