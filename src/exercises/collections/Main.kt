package exercises.collections

fun main() {
    var numbers = listOf(4, 5, 6, 1, 612, 13, 64, 99)
    numbers = numbers.stream().filter { number -> number % 2 == 0 }.toList()
    println(numbers)

    val countriesAndPopulations = mapOf(Pair("USA", 10000000), Pair("Russia", 9000013), Pair("Germany", 143656))
    println(countriesAndPopulations.minByOrNull { country -> country.value }?.key)

    val emptyMap: Map<String, Int> = mapOf()
    println(emptyMap.maxByOrNull { entry -> entry.value })
}