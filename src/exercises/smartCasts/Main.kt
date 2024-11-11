package exercises.smartCasts

fun main() {
    val double = 56.6
    val name = "Pesho"

    println(getType(double))
    println(getType(name))
}

fun getType(something: Any): String {
    when (something) {
        is String -> return "String"
        is Int -> return "Int"
        is Double -> return "Double"
    }
    return "idk man"
}