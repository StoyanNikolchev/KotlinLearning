package enums

fun main() {
    for (color in Color.entries) {
        color.printData()
    }
}

enum class Color(var cool: Boolean) {
    RED (true),
    BLUE (true),
    YELLOW (false),
    ORANGE (false);

    fun printData() {
        println("The color $name is cool? $cool")
    }
}