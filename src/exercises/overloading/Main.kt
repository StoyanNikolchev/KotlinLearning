package exercises.overloading

import kotlin.math.pow

fun main() {
    println(calculateRectangleArea(54, 32))
    println(calculateRectangleArea(41))
}

fun calculateRectangleArea(width: Int, height: Int): Int {
    return width * height
}

fun calculateRectangleArea(size: Int): Int {
    return size.toDouble().pow(2.0).toInt()
}