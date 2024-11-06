package classesAndObjects

fun main() {
    val person = Person(age = 13, name = "Pesho")
    println(person.age)
    println(person.getInfo())

    val animal = Animal("Cat", "Orange", true)

    println("${animal.name} ${animal.color} ${animal.ugly}")
    animal.name = "Gosho";
    animal.ugly = false;
    println("${animal.name} ${animal.color} ${animal.ugly}")

    val user = User(name = "Ivan", age = 55)
    user.favoriteColor = "Black"

    println(Calculator.sum(4, 6))}