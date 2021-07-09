package my.demo

//height and length become automatic instance variables and are assigned
class Rectangle(val height: Double, private val length: Double) {
    val perimeter = (height + length) * 2

    //var duration //thats not possible
}