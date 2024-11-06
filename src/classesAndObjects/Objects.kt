package classesAndObjects

class Person(var age: Int, var name: String) {

    fun getInfo(): String{
        return "$name is $age years old"
    }
}

class Animal(name: String, color: String, var ugly: Boolean) {

    var name: String = name
        get() {
            println("Getting name...")
            return field
        }

        set(name) {
            field = "Name: $name"
        }

    var color: String = color
        get() {
            return field
        }

        set(color) {
            field = "Color: $color"
        }
}

class User(val name: String, var age: Int) {
    lateinit var favoriteColor: String
}

class Calculator() {
    companion object {
        fun sum(x: Int, y: Int): Int {
            return x + y
        }
    }
}

class Database private constructor() {
     companion object {
         private var instance: Database? = null

         fun getInstance(): Database? {
             if (instance == null) {
                 instance = Database()
             }
             return instance
         }
     }
}

object SingletonThing {
    init {
        println("Singleton thing created!")
    }
}

class Cat(val name: String, var age: Int) {
    init {
        println("A cat by the name of $name lives!")
    }
}