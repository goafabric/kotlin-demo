package my.demo

fun main(args: Array<String>) {
    sugar()
    cream()
    coffee()
}

/*** syntactic sugar ***/
private fun sugar() {
    //no new needed for creating instances
    val rectangle = Rectangle(5.0, 5.0)

    //simple getter with templating
    println("The perimeter is ${rectangle.perimeter}")

    //is automatically an instance variable and assigned in constructor
    println("The height is ${rectangle.height}")

    //we can use java classes two, in the same way if the have getters
    val triangle = Triangle(1.0, 2.0, 3.0)
    println("Side a is ${triangle.a}")
}

/*** nullability and imutability ***/
private fun cream() {
    //passing null is forbidden out of the box !
    //val rectangleNullable = Rectangle(5.0, null)

    //setting the value is also not possible, as long as its a val
    //rectangle.height = 5.0
}

private fun coffee() {
    val arabica = Coffee(
        name = "Arabica", price = 4.99);

    println("Coffee Name is ${arabica.name}, Price is ${arabica.price}")

    val empty = Coffee()
    empty.name ="yo";
}
