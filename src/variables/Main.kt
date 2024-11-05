package first

fun main() {
    var name: String = "Hello" //or just var name = "Hello"
    val age: Int = 22 //or just val age = "Hello"

    val maxIntegerValue = Int.MAX_VALUE
    val maxByteValue = Byte.MAX_VALUE

    println("$name $age $maxIntegerValue $maxByteValue")

    val floatExample = 3.4f
    println(floatExample)

    val x = 3
    val y = 5

    println("x + y = ${x + y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
}