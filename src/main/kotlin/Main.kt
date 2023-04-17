fun main(){
    var person = Person("Alice Moraa",22)
    person.speak()
    //
    var vehicle = Vehicle("Toyota","Hilux",2019)
    vehicle.start()
    //
    var rectangle = Rectangle(20.0,25.0)
    println(rectangle.area())
    //
    var animal=Animal("Cow","Moooooo")
    animal.makeSound()
    //
    var dog =Dog("Dog","Woof")
    dog.makeSound()
    //
    var cat = Cat("cat","meow")
    cat.makeSound()
    //
    var person1 = Person1("Mary",30)
    person1.introduce()
    //
    var car = Car("German Machine","BMW",2019,"Black")
    car.start()

}
//Create a class called Person with properties for name and age.
// Write a method called speak that prints "Hello, my name is {name} and I am {age} years old."
class Person(var name:String,var age:Int){
    fun speak(){
        println("Hello my name is $name and i am $age years old")
    }
}
//Create a data class called User with properties for username and password.
//Write a method called validatePassword that checks if the password contains at least
//one uppercase letter, one lowercase letter, and one number.
data class User(var userName:String,var password:Int)
fun validatePassword(x:String){

}
//Create a class called Vehicle with properties for make, model, and year.
// Write a method called start that prints "The {make} {model} is starting up."
open class Vehicle(var make:String,var model:String,var year:Int){
    open fun start(){
        println("The $make $model is starting up")
    }
}
//Create a class called Car that extends Vehicle and adds a property for color.
//Override the start method to print "The {color} {make} {model} is starting up."
class Car(make: String,model: String,year: Int,var color:String):Vehicle(make,model,year){
override fun start(){
    println("The $make $model $color is starting up")
}
}

//Create a class called Rectangle with properties for width and height.
// Write a method called area that returns the area of the rectangle.
class Rectangle(var width:Double,var height:Double){
    fun area():Double{
        return width*height
    }
}
//Create a data class called Point with properties for x and y. Write a method
//called distance that takes another Point as an argument and returns the Euclidean distance between the two points.
data class Point(var x:Double,var y:Double)
fun distance (){

}
//Create a class called Animal with properties for species and sound.
// Write a method called makeSound that prints "{species} says {sound}."
open class Animal(var species:String,var sound:String){
   open fun makeSound(){
        println("$species says $sound")
    }
}
//Create a class called Dog that extends Animal and sets species to "dog" and
//sound to "woof". Override the makeSound method to print "{species} barks {sound}."
class Dog(species:String,sound:String):Animal(species,sound){
    override fun makeSound() {
        println("$species barks $sound")
    }
}
//Create a class called Cat that extends Animal and sets species to "cat" and
//sound to "meow". Override the makeSound method to print "{species} meows {sound}."
class Cat(species: String,sound: String):Animal(species,sound){
    override fun makeSound() {
        println("$species meows $sound")
    }
}
//Create a class called Person with properties for name and age. Write a method
//called introduce that prints "Hi, my name is {name} and I am {age} years old."
class Person1(var name1:String,var age:Int){
    fun introduce(){
        println("Hi my name is $name1 and i am $age years old")
    }
}
