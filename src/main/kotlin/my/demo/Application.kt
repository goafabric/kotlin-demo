package my.demo

fun main(args: Array<String>) {
    val rectangle = Rectangle(5.0, 5.0)

    //simple getter with templating
    println("The perimeter is ${rectangle.perimeter}")

    //is automatically an instance variable and assigned in constructor
    println("The height is ${rectangle.height}")

    //we can use java classes two, in the same way if the have getters
    val triangle = Triangle(1.0, 2.0, 3.0)

    println("Side a is ${triangle.a}")
}

