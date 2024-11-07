package inheritance

fun main() {
    val car = Car("Red", 4, "Peugeot")
    car.move()

    val plane = Plane("Silver", 8, "Airbus", 2)
    plane.move()
}

open class Vehicle(var color: String, val wheelsCount: Int) {
    open fun move() {
        println("The vehicle moved!")
    }
}

class Car(color: String, wheelsCount: Int, model: String) : Vehicle(color, wheelsCount) {
    override fun move() {
        println("The car moved!")
    }
}

class Plane(color: String, wheelsCount: Int, model: String, engines: Int) : Vehicle(color, wheelsCount) {
    override fun move() {
        println("The plane moved!")
    }
}