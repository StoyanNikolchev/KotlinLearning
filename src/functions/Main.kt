package functions

fun main() {
    sayHello()
    sayName("Pesho")

    val max = getMax(y = 2, x = 5)
    println(max)
}

fun getMax(x: Int, y: Int): Int {
    return if (x > y) x else y
}

fun sayHello() {
    println()
}

fun sayName(name: String) {
    println(name)
}