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

    println(Calculator.sum(4, 6))

    val database = Database.getInstance()
    val database2 = Database.getInstance()

    println(database)
    println(database2)

    val singletonThing = SingletonThing
    val singletonThing2 = SingletonThing

    println(singletonThing)
    println(singletonThing2)

    val firstCat = Cat("Slavi", 73)
    val secondCat by lazy {
        Cat("John", 814)
    }

    println("Haven't used second cat yet!")
    println("Second cat's name is ${secondCat.name} and it's ${secondCat.age} years old!")
}