package exercises.nullability

fun main() {
    val nullString = null
    val someString = "Hey there"

    println(getStringLength(nullString))
    println(getStringLength(someString))
}

fun getStringLength(string: String?): Int{
    return string?.length ?: 0
}