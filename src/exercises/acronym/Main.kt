package exercises.acronym

fun main() {
    val input = readln().split("\\s+".toRegex())
    val acronym: StringBuilder = StringBuilder("")

    for (word in input) {
        acronym.append(word[0].uppercaseChar())
    }

    println(acronym)
}