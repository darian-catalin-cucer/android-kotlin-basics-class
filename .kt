// Defining a class called "Person"
class Person {

    // Properties of the Person class
    var name: String = ""
    var age: Int = 0

    // Method to print the Person's details
    fun printDetails() {
        println("Name: $name")
        println("Age: $age")
    }
}

// Creating an object of the Person class
val person1 = Person()

// Setting the properties of person1 object
person1.name = "John"
person1.age = 30

// Calling the printDetails() method of person1 object
person1.printDetails()
