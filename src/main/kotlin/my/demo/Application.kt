package my.demo

fun main(args: Array<String>) {
    println(args.contentToString())
    println("hello world")

    println(sum(5, 4))

    val logic = Logic();

    logic.run()

}

fun sum(a: Int, b: Int): Int {
    return a + b
}
