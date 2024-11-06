package whenStatements

fun main() {
    val something = 6;

    when (something) {
        50 -> println("Woah it's 50")
        15 -> println("Now it's 15!")
        14,6, 135 -> println("And we're at $something")
    }

    when (something) {
        in 1..10 -> println("$something is between 1 and 10")
    }

    when (something) {
        !in 20..30 -> println("Boo")
    }
}