package classesAndObjects

class Person(var age: Int, var name: String) {

    fun getInfo(): String{
        return "$name is $age years old"
    }
}