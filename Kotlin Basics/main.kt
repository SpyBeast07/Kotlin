// # Hello World

fun main() {
    println("Hello World!")
}



// # Variables

fun main() {
    var userName: String = "Kushagra"
    var age: Int = 21
    println("Hello $userName!\nI am $age years old")

    var name = "Kush"
    println("I am $name")
}



// Data Types

fun main() {
    // Int - 32 bits - -2147483648 to 2147483647
    var number = 21

    var maxIntegerValue: Int = Int.MAX_VALUE
    var minIntegerValue: Int = Int.MIN_VALUE

    println("Max Integer value: $maxIntegerValue")
    println("Min Integer value: $minIntegerValue\n")

    number = 2147483647

    // Byte - 8 bits - -128 to 127
    var maxByteValue: Byte = Byte.MAX_VALUE
    var minByteValue: Byte = Byte.MIN_VALUE

    println("Max Byte value: $maxByteValue")
    println("Min Byte value: $minByteValue\n")

    // Short - 16 bits - -32768 to 32767
    var maxShortValue: Short = Short.MAX_VALUE
    var minShortValue: Short = Short.MIN_VALUE

    println("Max Short value: $maxShortValue")
    println("Min Short value: $minShortValue\n")

    // Long - 64 bits - -9223372036854775808 to 9223372036854775807
    var maxLongValue: Long = Long.MAX_VALUE
    var minLongValue: Long = Long.MIN_VALUE

    println("Max Long value: $maxLongValue")
    println("Min Long value: $minLongValue\n")
    
    var no1 = 72  // It will be of Int type
    var no2 = 72L  // It will be of Long type
    var no3 = 7272727272727272  // It will be of Long type
}



// Floats and Doubles

fun main() {
    var no1 = 2.5 //  By default all floating point numbers are of Double type | There is no D for double
    var no2 = 2.5f  // This will be of Float type
    var no3 = 72F  // It will be of Float type and output will be 72.0

    println("no1: $no1")
    println("no2: $no2")
    println("no3: $no3")
}



// Char and Boolean

fun main() {
    var charValue: Char = 'K'
    println("Char value: $charValue")

    var booleanValue: Boolean = true
    println("Boolean Value: $booleanValue")
    println("Boolean Value: $booleanValue")
}



// Operators

fun main() {
    var x = 5
    var y = 3
    // var y = 3.0

    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}\n")

    var result = x + y
    result *= 2  // Abbreaviated form of result = result * 2
    println("Result: $result\n")

    var z = 0
    println("z++: ${z++}")
    println("z: $z")
    println("++z: ${++z}")
    println("z: $z\n")

    println("z--: ${z--}")
    println("z: $z")
    println("--z: ${--z}")
    println("z: $z\n")
}



// Comments

/*
    This is the 
    multiple
    line comment
*/



// If-else Statement

fun main() {
    var x = 5
    var y = 3

    if (x > y) {
        println("x is greater than y")
    }
    else {
        println("y is greater than x")
    }
}



// Less than or equal to operator

fun main() {
    var x = 5
    var y = 3
    
    println("x == y: ${x == y}")
    println("x > y: ${x > y}")
    println("x < y: ${x < y}")
    println("x > y: ${x >= y}")
    println("x < y: ${x <= y}\n")

    var isActive = true
    if (isActive) {
        println("User is Active")
    }
    isActive = false
    if (!isActive) { // Thsi statement will be true if isActive is false
        println("User is not Active\n")
    }
}



// Logical AND and OR Operators

fun main() {
    var isPlaying = true
    var score = 80
    println("isPlaying && score > 50: ${isPlaying && score > 50}")
    println("isPlaying || score == 50: ${isPlaying || score == 50}")
    println("!isPlaying || score == 80: ${!isPlaying || score == 80}\n")
}



// When Statement | Control Flow Statement

fun main() {
    var alarm = 23

    when (alarm) {
        6 -> println("Wake up! The time is: $alarm")
        7 -> println("Get ready for office! The time is: $alarm")
        12, 19 -> println("Food time! The time is: $alarm")  // Combined cases
        in 20..22 -> println("Sleep time! The time is: $alarm")  // Range of values
        !in 0..6 -> println("Its high time! The time is: $alarm")  // Not in range of values
        else -> println("The time is: $alarm")
    }

    var text = when (alarm) {
        6 -> {
            "Wake up! The time is: $alarm"
        }
        7 -> {
            "Get ready for office! The time is: $alarm"
        }
        12, 19 -> {
            "Food time! The time is: $alarm"
        }
        in 20..22 -> {
            "Sleep time! The time is: $alarm"
        }
        !in 0..6 -> {
            "Its high time! The time is: $alarm"
        }
        else -> {
            "The time is: $alarm"
        }
    }
    println(text)

    text = when {
        alarm == 6 -> {
            "Wake up! The time is: $alarm"
        }
        alarm == 7 -> {
            "Get ready for office! The time is: $alarm"
        }
        alarm == 12 || alarm == 19 -> {
            "Food time! The time is: $alarm"
        }
        alarm in 20..22 -> {
            "Sleep time! The time is: $alarm"
        }
        alarm !in 0..6 -> {
            "Its high time! The time is: $alarm"
        }
        alarm <= 6 -> {
            "Keep sleeping! The time is: $alarm"
        }
        else -> {
            "The time is: $alarm"
        }
    }
    println(text)
}



// NULL

fun main() {
    // var name: String = null  // Error
    
    var name: String? = null  // null is allowed
    var length = name?.length

    println("name: $name & Length: $length")


    var name2: String? = "Kushagra"
    // println(name2.length)  // Here the length can be null so it will give error, so we need to use safe call operator
    println("Length using safe call operator: " + name2?.length)  // It will print the length if name2 is not null else it will print null | This is equivalent to if-else statement
    println(name2!!.length)  // if name2 is null then it will throw null pointer exception
    
    if (name2 != null) {
        println(name2.length)
    }
    else {
        println("Name is null")
    }
    
    val text: Any = name2 ?: "Name is null"  // Elvis Operator
    println(text)
}



// Functions

fun main() {
    sayHello()
    sayHello()  // Function can be called multiple times and reusable

    sayHello2("Kushagra")  // Function with parameter

    sayHello3("Kushagra", 21)  // Multiple parameters

    val isInternetConnection = true
    if (isInternetConnection) {
        getData("e23J2fgilHuNrFghj2");
    }
    else {
        showMessage();
    }
}

fun sayHello() {
    println("Hello!")
}

fun sayHello2(name: String) {
    println("Hello $name!")
}

fun sayHello3(name: String, age: Int) {
    println("Hello $name, with age $age.")
}

fun getData(data: String) {
    println("Data is being fetched from the server. Your data is: $data")
}

fun showMessage() {
    println("No internet connection!")
}



// Return Statement

fun main() {
    println("Max: " + getMax(5, 3))
}

fun getMax(a: Int, b: Int): Int {
    return (if (a > b) a else b)
}
// // Can also be written as:
// fun getMax(a: Int, b: Int): Int = (if (a > b) a else b)
// fun getMax(a: Int, b: Int) = (if (a > b) a else b)



// Function Overloading

fun main() {
    println("Max: " + getMax(5, 3))
    println("Max: " + getMax(6.5, 9.6))
    println("Max: " + getMax(5, 3, 8))
}

fun getMax(a: Int, b: Int) = (if (a > b) a else b)
fun getMax(a: Double, b: Double) = (if (a > b) a else b)
fun getMax(a: Int, b: Int, c: Int) = if ((if (a > b) a else b) > c) (if (a > b) a else b) else c



// Default Arguments

fun main() {
    sendMessage()
    sendMessage("Kushagra")
    sendMessage(message = "Hello!")
    sendMessage("Kushagra", "Hello!")
    sendMessage(
        message = "Hello!", 
        name = "Kushagra"
    )
}

fun sendMessage(name: String = "User", message: String = sendText()) {
    println("Message from $name: $message")
}

fun sendText(): String {
    return "A message!"
}



// Varargs - Variable Arguments - Can pass multiple arguments

fun main() {
    println(sum(5, 6, 7, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20))
}

fun sum(vararg numbers: Int): Int {
    var sum = 0
    // for (x in numbers) {
    //     sum += x
    // }
    numbers.forEach {
        sum += it
    }
    return sum
}



// Loops

fun main() {
    for (i in 1..10) {
        print("$i ")
    }
    println()

    for (i in 1 until 10) {
        print("$i ")
    }
    println()

    for (i in 10 downTo 1) {
        print("$i ")
    }
    println()

    for (i in 1 until 10 step 2) {
        print("$i ")
    }
    println()

    var num = 0
    while (num < 10) {
        print("$num ")
        num++
    }
    println()

    num = 0
    do {
        print("$num ")
        num++
    }
    while (num < 10)
    println()

    num = 0
    while (num < 10) {
        // to skip 5 we will use continue statement
        if (num == 5) {
            num++
            continue
        }

        print("$num ")
        num++
    }
    println()

    num = 0
    while (num < 10) {
        // to stop at 7 we will use break statement
        if (num == 7) {
            break
        }

        print("$num ")
        num++
    }
    println()

    for (i in 1..10) {
        if (i in 3..7) {
            continue
        }
        print("$i ")
    }
    println()

    num = 0
    outer@ while (num < 5) {
        num++
        print("$num ")

        var i = 0
        while (i < 5) {
            if (i == 3) {
                break@outer
            }
            i++
            print("***$i ")
        }
        println()
    }
    println()
}



// Loop Challenge - Print even and skip odd. Also count even numbers

fun main() {
    var num = 1
    var last = 20
    var count = 0

    while (num <= last) {
        num++
        if (!isEven(num)) {
            continue
        }
        else {
            count++
            print("$num ")
        }
    }
    println("\nTotal even numbers: $count")
}

fun isEven(num: Int): Boolean {
    return (num % 2 == 0)
}



// Arrays

fun main() {
    var names: Array<String> = arrayOf("Kushagra", "Kush", "Kushu")
    // var names = arrayOf("Kushagra", "Kush", "Kushu")  // Can also be written as this
    var mixed = arrayOf(2, 7, 11, "Kush", 'k')  // Can also have different data types

    names[0] = "Gupta Ji"
    println("First element: ${names[0]}")
    println("Size of array: ${names.size}")

    for (name in mixed) {
        print("$name ")
    }
    println()

    for (name in mixed) {
        if (name is String) {
            println("String: $name")
        }
        else if (name is Int) {
            println("Int: $name")
        }
        else if (name is Char) {
            println("Char: $name")
        }
    }
}



// Array Challenge - Array of numbers is passed as argument and determine the buggest number and return it | Also make function for the same to find minimum number | #rd function to combine both in functions and return values

fun main() {
    var numbers = arrayOf(5, 7, 2, 9, 1, 3, 6, 8, 4)
    println("Max: ${getMax(numbers)}")
    println("Min: ${getMin(numbers)}")
    val result = getMinMax(numbers)
    println("Max: ${result.first} & Min: ${result.second}")
}

fun getMax(numbers: Array<Int>): Int {
    var max = numbers[0]
    for (num in numbers) {
        if (num > max) {
            max = num
        }
    }
    return max
}

fun getMin(numbers: Array<Int>): Int {
    var min = numbers[0]
    for (num in numbers) {
        if (num < min) {
            min = num
        }
    }
    return min
}

fun getMinMax(numbers: Array<Int>): Pair<Int, Int> {
    var max = numbers[0]
    var min = numbers[0]
    for (num in numbers) {
        if (num > max) {
            max = num
        }
        if (num < min) {
            min = num
        }
    }
    return Pair(max, min)
}



// OOPS - Object Oriented Programming

// OOP - Classes

fun main() {
    val car1 = Car()  // Object of Car class | Instance of Car class | car1 is a reference to the object
    car1.name = "Mercedez"
    car1.model = "S-Class"
    car1.color = "Black"
    car1.doors = 4

    println("Car1: \nName: ${car1.name} \nModel: ${car1.model} \nColour: ${car1.color} \nDoors: ${car1.doors}")

    car1.move()
    car1.stop()

    println()

    val car2 = Car()
    car2.name = "Ford"
    car2.model = "Mustang"
    car2.color = "Yellow"
    car2.doors = 2

    println("Car2: \nName: ${car2.name} \nModel: ${car2.model} \nColour: ${car2.color} \nDoors: ${car2.doors}")

    car2.move()
    car2.stop()

    println()

    val car3 = pCar("  Dodge     ", "Charger SRT-8", "Matte Black", 4)

    println("Car3: \nName: ${car3.name} \nModel: ${car3.model} \nColour: ${car3.color} \nDoors: ${car3.doors}")

    car3.move()
    car3.stop()
}

class Car {  // Class is a blueprint of an object
    var name = ""  // Properties of the class
    var model = ""  // Properties are also called as fields or attributes
    var color = ""
    var doors = 0
    
    fun move() {
        println("$name is moving")
    }

    fun stop() {
        println("$name is stopped")
    }
}

class pCar(name: String, var model: String, var color: String, var doors: Int) {
    var name = name.trim()  // Primary Constructor | It is used to initialize the properties of the class | trim is used to remove the leading and trailing whitespaces
    fun move() {
        println("$name is moving")
    }

    fun stop() {
        println("$name is stopped")
    }
}



// OOP - Initializer Block

fun main() {
    val user = User("Kushagra", "Gupta", 21)
    val friend = User("Naman", "Kumawat", 21)
    println("Name: ${user.name}")
    println("Name: ${friend.name}")
}

class User(name: String, var lastName: String, var age: Int) {  // Primary Constructor
    var name: String

    init {  // Initializer Block | It is used to initialize the properties of the class | It is executed when the object is created and before the constructor
        if (name.lowercase().startsWith("k")) {
            this.name = name
        }
        else {
            this.name = "User"
            println("Name doesn't start with 'k' or 'K'")
        }
    }

    init {
        println("User created")
    }
}



// OOP - Secondary Constructor

fun main() {
    val user = User("Kushagra")
    val friend = User("Naman", "Kumawat")
    println()
    println("Name: ${user.name} ${user.lastName}, ${user.age}")
    println("Name: ${friend.name} ${friend.lastName}, ${friend.age}")
}

class User(var name: String, var lastName: String, var age: Int) {  // Primary Constructor
    constructor(name: String) : this(name, "<lastName>", 21)  {// Secondary Constructor | It is used to provide multiple ways to initialize the object
        println("Secondary Constructor")
    }

    constructor(name: String, lastName: String) : this(name, lastName, 22)  {// Another Secondary Constructor
        println("Another Secondary Constructor")
    }
}



// OOP - Default Values

fun main() {
    val user = User("Kushagra")
    val friend = User("Naman", "Kumawat")
    val user2 = User(age = 21, name = "Kushagra", lastName = "Gupta")
    println()
    println("Name: ${user.name} ${user.lastName}, ${user.age}")
    println("Name: ${friend.name} ${friend.lastName}, ${friend.age}")
    println("Name: ${user2.name} ${user2.lastName}, ${user2.age}")
}

class User(var name: String, var lastName: String = "<lastName>", var age: Int = 22) {
}



// OOP - Getters and Setters

fun main() {
    val user = User("Kushagra")
    val friend = User("Naman", "Kumawat")
    val user2 = User(age = 21, name = "Kushagra", lastName = "Gupta")

    user.name = "Kush"  // Setter is called | When we initialize the ‘name’ property, it is passed to the setter’s parameter value and sets the ‘field’ to value

    println(user.name)  // Getter is called | When we access the ‘name’ property, it returns the value of the ‘field’ because of this code get() = field
    println(user.lastName)
    println(user.age)

    println("Name: ${friend.name} ${friend.lastName}, ${friend.age}")
    println("Name: ${user2.name} ${user2.lastName}, ${user2.age}")
}

class User(name: String, var lastName: String = "<lastName>", var age: Int = 22) {
    var name: String = name
    
    get() {  // Getter | It is used to get the value of the property
        return "name: $field"  // field is used to access the value of the property
    }

    set(value) {  // Setter | It is used to set the value of the property
        println("$value is being set to name")
        field = value  // field is used to set the value of the property
        // name = value  // This will cause infinite loop because it will call the setter again and again forever | And that is why we use field
    }

    // Getter and Setter function are equivalent to these 2 functions | So this is the easier explaination to understand the getter and setter(which are automatically generated for you)
    fun setFirstName(name2: String) {
        this.name = name2
    }
    fun getFirstName(): String {
        return this.name
    }
}



// OOP - lateinit

fun main() {
    val user = User("Kushagra", "Gupta", 21)

    // println(user.favouriteMovie)  // This will give error because favouriteMovie is lateinit and it is not initialized

    user.favouriteMovie = "DEADPOOL"

    println("Name: ${user.name} ${user.lastName}, ${user.age}\nFavourite Movie: ${user.favouriteMovie}")
}

class User(var name: String, var lastName: String, var age: Int) {
    lateinit var favouriteMovie: String  // lateinit is used to tell the compiler that the property will be initialized later | It can be used with classes and local variables but not with primitive data types

    // lateinit var favouriteGame: Int  // This will give error because lateinit can only be used with non-primitive data types
    // lateinit var favouriteGame: Char  // This will give error because lateinit can only be used with non-primitive data types
}



// OOP - Companion Object

fun main() {
    println("Sum: ${Calculator.add(12, 7)}")
    println(Calculator.max)
}

class Calculator {
    // Companion Object | It is used to create static methods and properties | It is used to access the properties and methods of the class without creating an object of the class | It is used to create a singleton | It is used to create factory methods | It is used to create extension functions and properties | It is used to create constants | It is used to create named arguments | It is used to create default arguments | It is used to create top-level functions and properties | It is used to create private constructors | It is used to create private properties and methods | It is used to create private setters | It is used to create private getters | It is used to create private fields | It is used to create private classes | It is used to create private interfaces | It is used to create private enums | It is used to create private objects | It is used to create private companion objects | It is used to create private extension functions and properties | It is used to create private top-level functions and properties
    companion object {
        var max = Int.MAX_VALUE  // This can also be accessed without making object of the class
        fun add(a: Int, b: Int): Int {  // Also called Class Variables/ Class Functions | It belongs to the class and not to the object
            return a + b
        }

        fun subtract(a: Int, b: Int): Int {
            return a - b
        }

        fun multiply(a: Int, b: Int): Int {
            return a * b
        }

        fun divide(a: Int, b: Int): Int {
            return a / b
        }
    }
}



// OOP - Singleton

fun main() {
    val instance: Database? = Database.getInstance()
    val instance2: Database? = Database.getInstance()  // It will return the same instance as the previous one
    println(instance)
    println(instance2)  // Both the instances will be same

    println()

    println(Database2)  // It will print the message only once because it is a singleton class
    println(Database2)
    println(Database2)  // All the instances will be same
}

class Database private constructor() {  // When we use access modifier with the constructor, it makes the constructor private and it can only be accessed within the class
        companion object {
        private var instance: Database? = null  // We are creating a private instance of the class

        fun getInstance(): Database? {
            // If the instance is null then we will create a new instance | This is called lazy initialization | It is used to create the object only when it is needed | It is used to save memory | It is used to save resources
            if (instance == null) {
                instance = Database()
            }
            return instance
        }
    }  // This is a singleton class because it can only have one instance at a time  
}

object Database2 {  // This is a singleton class because it can only have one instance at a time
    init {
        println("Database created")
    }
}



// OOP - Lazy Initialization

fun main() {
    val user1 = User("Kushagra", "Gupta", 21)
    // lazy is used to create the object only when it is needed | It is used to save memory | It is used to save resources
    // This will not be initialized until it is called
    val user2 by lazy {
        User("Naman", "Kumawat", 21)
    }

    println("User2: ${user2.name} ${user2.lastName}, ${user2.age}")
}

class User(var name: String, var lastName: String, var age: Int) {
    init {
        println("User: $name is  created")
    }
}



// OOP - Enum Classes

fun main() {
    println("Direction: ${Direction.EAST}")
    println("Direction: ${Direction.WEST}")
    println("Direction: ${Direction.NORTH}")
    println("Direction: ${Direction.SOUTH}")

    println()

    val direction = Direction.valueOf("north".uppercase())  // valueOf is used to get the value of the enum constant | It is used to get the enum constant by its name | It is used to get the enum constant by its value
    when (direction) {
        Direction.NORTH -> println("You are going North")
        Direction.SOUTH -> println("You are going South")
        Direction.EAST -> println("You are going East")
        Direction.WEST -> println("You are going West")
    }

    println()

    println("Direction: ${Direction2.EAST.direction}, Distance: ${Direction2.EAST.distance}")
    println("Direction: ${Direction2.WEST.direction}, Distance: ${Direction2.WEST.distance}")
    println("Direction: ${Direction2.NORTH.direction}, Distance: ${Direction2.NORTH.distance}")
    println("Direction: ${Direction2.SOUTH.direction}, Distance: ${Direction2.SOUTH.distance}")

    println()

    Direction2.EAST.printDirection()
    Direction2.WEST.printDirection()
    Direction2.NORTH.printDirection()
    Direction2.SOUTH.printDirection()

    println()

    for (direction in Direction.values()) { 
        println("${direction.ordinal} = ${direction.name}")
    }

    println(Direction.EAST.ordinal)  // ordinal is used to get the index of the enum constant | It is used to get the position of the enum constant | It is used to get the order of the enum constant
}

// Enum Classes | It is used to create a collection of constants | It is used to create a collection of objects | It is used to create a collection of instances | It is used to create a collection of values | It is used to create a collection of properties | It is used to create a collection of methods | It is used to create a collection of functions | It is used to create a collection of classes | It is used to create a collection of interfaces | It is used to create a collection of enums | It is used to create a collection of objects | It is used to create a collection of companion objects | It is used to create a collection of extension functions and properties | It is used to create a collection of top-level functions and properties | An instance of enum class cannot be created using constructors | An instance of enum class cannot be created using new keyword | An instance of enum class cannot be created using object keyword | An instance of enum class cannot be created using companion object
enum class Direction {
    NORTH,
    SOUTH,
    EAST,
    WEST
}

enum class Direction2(var direction: String, var distance: Int) {
    NORTH("North", 10),  // Enum constants aren’t just mere collections of constants- these have properties, methods etc
    SOUTH("South", 20),  // Enum constants can have properties, methods etc
    EAST("East", 30),  // Each of the enum constants acts as separate instances of the class
    WEST("West", 40);  // Semicolon is used to separate the enum constants | ; is used to close the enum class

    fun printDirection() {  // This is a method of the enum class
        println("Direction: $direction, Distance: $distance")
    }
}



// OOP - Enums as Anonymous Classes

fun main() { 
	// calling foo() function override be Summer constant 
	Seasons.Summer.foo() 
} 

// defining enum class 
enum class Seasons(var weather: String) { 
	Summer("hot"){ 
		// compile time error if not override the function foo() 
		override fun foo() {			 
			println("Hot days of a year") 
		} 
	}, 
	Winter("cold"){ 
		override fun foo() { 
			println("Cold days of a year") 
		} 
	}, 
	Rainy("moderate"){ 
		override fun foo() { 
			println("Rainy days of a year") 
		} 
	}; 
	abstract fun foo() 
}



// OOP - Inner Classes

fun main() {
    val outer = Outer()
    val inner = outer.Inner()
    inner.print()

    println()

    val listView = listView(arrayOf("Kushagra", "Kush", "Kushu", "User"))

    listView.listViewItem().displayItems(2)
}

class Outer {
    private val name: String = "Outer Class"
    
    inner class Inner {
        fun print() {
            println(name)
        }
    }
}

class listView(val  items: Array<String>) {
    inner class listViewItem() {
        fun displayItems(position: Int) {
            println(items[position])
        }
    }
}



// OOP - Challenge - Make a account class and perform deposit, withdraw, showTransactions and calculateBalance operations

fun main() {
    val kushaccount = account("Kushagra")
    kushaccount.deposit(1000)
    kushaccount.withdraw(500)
    kushaccount.deposit(-20)
    kushaccount.withdraw(2000)
    kushaccount.showTransactions()
    println("Balance: ${kushaccount.calculateBalance()}")
    kushaccount.deposit(2000)
    kushaccount.withdraw(500)
    kushaccount.withdraw(1000)
    kushaccount.deposit(7000)
    kushaccount.showTransactions()
    // kushaccount.balance = 10000  // This will give error because balance is private
    println("Balance: ${kushaccount.calculateBalance()}")
    println()
    println("${kushaccount.accountName} has balance of ${kushaccount.balance}")
}

class account(val accountName: String) {
    private var balance = 0  // It is private so that it can't be accessed directly from outside the class and get modified
    private var transactions = mutableListOf<Int>()  // It is private so that it can't be accessed directly from outside the class and get modified

    fun deposit(amount: Int) {
        if (amount > 0) {
            balance += amount
            transactions.add(amount)
            println("$amount deposited")
        }
        else {
            println("Invalid amount")
        }
    }

    fun withdraw(amount: Int) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            transactions.add(-amount)
            println("$amount withdrawn. Remaining balance is now ${this.balance}")
        }
        else {
            println("Invalid amount")
        }
    }

    fun calculateBalance(): Int {
        // balance = 0
        // for (transaction in transactions) {
        //     balance += transaction
        // }
        return balance
    }

    fun showTransactions() {
        print("Transactions: ")
        for (transaction in transactions) {
            print("$transaction ")
        }
        println()
    }
}



// OOP - Inheritance

fun main() {
    val car = Car("Mercedez", "Black", 1, 4)
    val plane = Plane("Boeing", "White", 4, 4)

    car.move()
    car.stop()

    println()

    plane.move()
    plane.stop()
}

open class vehicle(var name: String, var color: String) {  // open is used to make the class inheritable | It is used to make the class extendable
    open fun move() {  // open is used to make the function inheritable | It is used to make the function extendable
        println("$name is moving")
    }

    open fun stop() {
        println("$name has stopped")
    }
}

// Car class is inheriting the vehicle class | Car class is extending the vehicle class | Car class is subclass of vehicle class | Car class is derived class of vehicle class | vehicle class is superclass of Car class | vehicle class is base class of Car class

// name and color are the properties of the vehicle class and they are inherited by the Car class so can not be declared again, while engine and doors are the properties of the Car class and are declared

class Car(name: String, color: String, var engine: Int, var doors: Int) : vehicle(name, color) {
}

class Plane(name: String, color: String, var engine: Int, var doors: Int) : vehicle(name, color) {
    override fun move() {  // override is used to override the function of the parent class | It is used to replace the function of the parent class
        fly()
        super.move()  // super is used to call the function of the parent class
    }

    fun fly() {
        println("$name is flying")
    }
}



// OOP - Inheritance 2

fun main() {
    val view = view()
    val button = button("Login", "Center")
    val roundButton = roundButton("Register", "Center", 10)

    view.draw()
    button.draw()
    roundButton.draw()
}

open class view() {
    open fun draw() {
        println("Drawing the view.")
    }
}

open class button(val text: String, val orientation: String) : view() {
    override fun draw() {
        println("Drawing the button.")
        super.draw()
    }
}

class roundButton(text: String, orientation: String, val corners: Int) : button(text, orientation) {
    override fun draw() {
        println("Drawing the round button.")
        super.draw()
    }
}



// OOP - Sealed Classes

fun main() {
    val success = result.SUCCESS("Success!!")
    val recoverableError = result.ERROR.recoverableError(Exception("Recoverable"), "Recoverable Error")
    val nonRecoverableError = result.ERROR.nonRecoverableError(Exception("Non-recoverable"), "Non-recoverable Error")
    val progress = result.PROGRESS("In Progress!!")

    getData(success)
    getData(recoverableError)
    getData(nonRecoverableError)
    getData(progress)
}

// Sealed Classes | It is used to create a restricted hierarchy | It is used to create a fixed number of subclasses | It is used to create a fixed number of instances | It is used to create a fixed number of objects | It is used to create a fixed number of values | It is used to create a fixed number of properties | It is used to create a fixed number of methods | It is used to create a fixed number of functions | It is used to create a fixed number of classes | It is used to create a fixed number of interfaces | It is used to create a fixed number of enums | It is used to create a fixed number of objects | It is used to create a fixed number of companion objects | It is used to create a fixed number of extension functions and properties | It is used to create a fixed number of top-level functions and properties

// enum class result {
//     SUCCESS,
//     ERROR(nonRes: String, res: String);  // This will give error because we can't have properties in enum class
// }

fun getData(result: result) {
    when (result) {
        is result.SUCCESS -> result.showMessage()
        is result.ERROR.recoverableError -> result.showMessage()
        is result.ERROR.nonRecoverableError -> result.showMessage()
        is result.PROGRESS -> result.showMessage()
        // Here else will not come and give an error because we have handled all the cases possible in the sealed class
    }
}

sealed class result(val message: String) {
    fun showMessage() {
        println("Result: $message")
    }

    class SUCCESS(message: String) : result(message)
    sealed class ERROR(message: String) : result(message) {
        class recoverableError(exception: Exception, message: String) : ERROR(message)
        class nonRecoverableError(exception: Exception, message: String) : ERROR(message)
    }
    class PROGRESS(message: String) : result(message)
}



// OOP - Abstract Classes

fun main() {
    val car = Car("Mercedez", "Black", 1, 4)

    car.move()
    car.stop()
}

// Abstract class can't be instantiated and only be inherited by another class | Abstract class can have abstract(functions without body) and non-abstract functions | Abstract class can have abstract and non-abstract properties | Abstract class can have abstract and non-abstract methods, functions, classes, interface, enums, objects, companion objects or properties
// It can have properties which interaface can't have
abstract class vehicle() {
    val text = "Some text"

    abstract fun move()

    abstract fun stop()
}

class Car(var name: String, var color: String, var engine: Int, var doors: Int) : vehicle() {  // It is mandatory to override the abstract functions of the abstract class
    override fun move() {
        println("$name is moving")
    }

    override fun stop() {
        println("$name has stopped")
    }
}



// OOP - Data Classes

fun main() {
    val name1 = "Kushagra"
    val name2 = "Kushagra"
    val name3 = "Kushu"

    println(name1 == name2)  // It will return true | This is called structural equality
    println(name1 == name3)  // It will return false because the references are different | This is called structural equality
    println(name1 === name2)  // It will return true | This is called referential equality
    println(name1 === name3)  // It will return false because the references are different | This is called referential equality

    println()

    val user1 = User("Kushagra", "Gupta", 21)
    val user2 = User("Kushagra", "Gupta", 21)

    println(user1 == user2)  // It will return false because the references are different but now it will return true because we have overridden the equals function in the User class
    println(user1.equals(user2))  // Same as (user1 == user2)

    println()

    println(user1.hashCode())  // It will return 0 because we have overridden the hashCode function in the User class

    println()

    println(user1)  // It will return "User: Kushagra Gupta, 21" because we have overridden the toString function in the User class
    println(user2)

    println()

    // Implementation of Data Classes
    val user3 = UserD("Kushagra", "Gupta", 21)
    val user4 = UserD("Kushagra", "Gupta", 21)

    println(user3 == user4)

    println()

    println(user3)
    println(user4)
}

// Data Classes | It is used to create a class with only properties or fields or attributes or values or methods or functions or classes or interfaces or enums or objects or companion objects or extension functions and properties or top-level functions and properties or data classes

// Any is the superclass of all the classes in Kotlin | It is used to create a class with all the properties of the class
// It is mandatory to inherit the Any class
// https://medium.com/@m.sandovalcalvo/kotlin-type-system-unveiling-the-mystery-50613f0db893

class User(var fisrtName: String, var lastName: String, var age: Int) : Any() {
    // It will give error because data class can't have properties
    // var name = "Kushagra"
    // var age = 21

    // Before and after overriding this function form 'Any' class, the results were different!! Tri it yourself
    override fun equals(other: Any?): Boolean {
        if (this === other) {  // Check if the object is compared with itself
            return true
        }

        if (other is User) {  // Check if the object is compared with the object of the same class i.e. User
            return this.fisrtName == other.fisrtName && this.lastName == other.lastName && this.age == other.age
        }

        return false
    }

    // No need to change hashcode function because it is already implemented in the 'Any' class | equals and hascode are used together
    override fun hashCode(): Int {
        return 0
    }

    // No need to change toString function because it is already implemented in the 'Any' class
    override fun toString(): String {
        // return super.toString()
        return "User: $fisrtName $lastName, $age"
    }
}

// Instead of this code, we can implement it consicely using data classes
// in this, we don't need to override the equals, hashcode and toString functions as they are already implemented in the data class
data class UserD(var fisrtName: String, var lastName: String, var age: Int)



// OOP - Interfaces

fun main() {}

interface engine {
    fun start()
    fun stop()
}

class car(val name: String) : engine {
    override fun start() {
        println("$name is starting the engine")
    }

    override fun stop() {
        println("$name is stopping the engine")
    }
}

class truck(val name: String) : engine {
    override fun start() {
        println("$name is starting the engine")
    }

    override fun stop() {
        println("$name is stopping the engine")
    }
}

class plane(val name: String) : engine {
    override fun start() {
        println("$name is starting the engine")
    }

    override fun stop() {
        println("$name is stopping the engine")
    }
}



// OOP - Interfaces 2

fun main() {
    val clickListener = clickListener()

    val loginButton = Button("Login", 7503, clickListener)
    val signUpButton = Button("Sign Up", 3057, clickListener)
}

class Button(val text: String, val id: Int, onClickListener: OnClickListener)

class clickListener() : OnClickListener {  // This is the implementation of the interface
    override fun onClick(text: String, id: Int) {
        println("$text button with id $id is clicked")
    }
}

interface OnClickListener {
    fun onClick(text: String, id: Int)
}



// Another way to implement the interface
fun main() {
    val loginButton = Button("Login", 7503, object: OnClickListener {
        override fun onClick() {
            // login the user
        }
    })
    val signUpButton = Button("Sign Up", 3057, object: OnClickListener {
        override fun onClick() {
            // sign up the user
        }
    })
}

class Button(val text: String, val id: Int, onClickListener: OnClickListener)

class clickListener() : OnClickListener {  // This is the implementation of the interface
    override fun onClick() {
    }
}

interface OnClickListener {
    fun onClick()
}



// OOP - Delegation - When a class delegates some of its responsibilities to another class | Let's say we have to inherit 2 classes but we can't inherit 2 classes in Kotlin so we can use delegation

fun main() {}

class app : A by fisrtDelegate(), B by secondDelegate() {
    override fun print() {
        println("App")
    }

    override fun print2() {
        println("App2")
    }
}

interface A {
    fun print()
}

interface B {
    fun print2()
}

open class fisrtDelegate : A {
    override fun print() {
        println("First Delegate for A")
    }
}

open class secondDelegate : B {
    override fun print2() {
        println("Second Delegate for B")
    }
}



// OOP - Delegation 2

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun main() {
    val user = User()
    with(user) {
        fisrtName = "Kushagra"
        lastName = "Gupta"
    }
    with (user) {
        println(fisrtName)
        println(lastName)
    }
    // both the ways of printing the values are correct
    // println(user.fisrtName)
    // println(user.lastName)
}

class User {
    var fisrtName by FormatDelegate()
    var lastName by FormatDelegate()
}

class FormatDelegate : ReadWriteProperty<Any?, String> {
    private var formattedString: String = ""
    
    override fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return formattedString
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        formattedString = value.lowercase()
    }
}



// Collections - List, Set and Map - Mutable and Immutable

fun main() {
    // Immutable list
    val names = listOf<String>("Kushagra", "Gupta", "Kushu", "User")
    
    println(names)
    println(names[0])
    println(names.get(0))
    println(names.size)
    println(names.contains("Kushagra"))
    names.forEach { print(it + " ") }
    
    println()
    println()
    println()

    // Mutable list
    val names2 = mutableListOf<String>("Kushagra", "Gupta", "Kushu", "User", "Kushagra")
    
    println(names2)
    names2.add("Kush")
    println(names2)
    names2.remove("User")
    println(names2)
    names2.removeAt(1)
    println(names2)

    println()
    println()

    // Immutable Set
    val names3 = setOf<String>("Kushagra", "Gupta", "Kushu", "User", "Kushagra")
    println(names3)

    println()
    println()

    // Mutable Set
    val names4 = mutableSetOf<String>("Kushagra", "Gupta", "Kushu", "User", "Kushagra")
    println(names4)
    names4.add("Kush")
    println(names4)

    println()

    val user1 = User("Kushagra")
    val user2 = User("Kushagra")
    val user3 = User("Kushagra")
    val user4 = User("Kushagra")
    val user5 = User("Kushagra")
    val user6 = User("Kush")
    val user7 = User("Kush")

    val names5 = setOf<User>(user1, user2, user3, user4, user5, user6, user7)
    println(names5)
    names5.forEach { print(it.name + " ") }  // Here, it will also show the duplicate values because the references are different because it used the equals to function but if you change the class to data class then it will show only the unique values

    println()
    println()

    // Immutable Map
    val names6 = mapOf<String, Int>("Kushagra" to 21, "Gupta" to 22, "Kushu" to 23, "User" to 24)
    println(names6)
    println(names6["Kushagra"])
    println(names6["Kush"])
    names6.forEach {
        (key, value) -> println("$key: $value")
    }
    
    println()
    println()

    // Mutable Map
    val names7 = mutableMapOf<String, Int>("Kushagra" to 21, "Gupta" to 22, "Kushu" to 23, "User" to 24)
    println(names7)
    names7["Kush"] = 25
    println(names7)
    names7.remove("Kushagra")
    println(names7)

    println()
}

data class User(val name: String)


// Lambda Expressions

// with type annotation in lambda expression
val sum1 = { a: Int, b: Int -> a + b }

// without type annotation in lambda expression
val sum2:(Int,Int)-> Int = { a , b -> a + b}

fun main(args: Array<String>) {
	val result1 = sum1(2,3)
	val result2 = sum2(3,4)
	println("The sum of two numbers is: $result1")
	println("The sum of two numbers is: $result2")

	// directly print the return value of lambda
	// without storing in a variable.
	println(sum1(5,7))
}



// Operations on Collections

// Transformation

// Mapping

fun main() {
    val numbers = setOf(1, 2, 3, 4, 5, 6, 7)
    println(numbers.map { it * 2 })  // It will multiply each element by 2 | It will return a new list with the transformed elements | map is used to apply the function on each and every element of numbers
    println(numbers.map { if (it == 3) it * 100 else it * 10 })
    println(numbers.mapIndexedNotNull { index, value -> if (index == 0) null else index * value })

    println()

    val numberMap = mapOf("key 1" to 1, "key 2" to 2, "key 3" to 3, "key 4" to 4)
    println(numberMap.mapKeys { it.key.uppercase() })
    println(numberMap.mapValues { it.value + it.key.length })
}



// Zipping - Pairing the elements of 2 collections with the same index

fun main() {
    val colors = listOf("red", "brown", "grey")
    val animals = listOf("fox", "cat", "elephant")

    println(colors.zip(animals))
    println(colors zip animals)
    println(colors.zip(animals) { color, animal -> "The ${animal.replaceFirstChar { it.uppercase() }} is $color" })

    println()

    val numberPairs = listOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(numberPairs)
    println(numberPairs.unzip())
}



// Association - It is used to create a map from the collection

fun main() {
    val numbers = listOf("one", "two", "three", "four")
    println(numbers.associateWith { it.length })  // It will create a map with the elements of the list as the keys and the length of the elements as the values
    println(numbers.associateBy { it.first().uppercase() })  // It will create a map with the first character of the elements of the list as the keys and the elements as the values
    println(numbers.associateBy(keySelector = { it.first().uppercase() }, valueTransform = { it.length }))  // It will create a map with the first character of the elements of the list as the keys and the length of the elements as the values
}



// Flatten - It is used to flatten the collection of collections

fun main() {
    val numberSets2 = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(7, 8, 9))
    println(numberSets2[2][0])

    println()

    val numberSets = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(7, 8, 9))
    // println(numberSets[2][2])  // This don't work with list of sets, we need to make it array
    
    for (i in numberSets) {
        for (j in i) {
            print("$j ")
        }
        println()
    }
    
    println(numberSets.flatten())  // This will flatten the list of sets and return a single list | This will be list<int>4
    for (i in numberSets.flatten()) {
        print("$i ")
    }
    println()
}



// String Representation - It is used to convert the collection to a string

fun main() {
    val numbersStrings = listOf("one", "two", "three", "four")
    println(numbersStrings)
    println(numbersStrings.joinToString())

    println()

    val listString = StringBuffer("The list of numbers: ")
    println(numbersStrings.joinTo(listString))

    println()

    println(numbersStrings.joinToString(separator = " | ", prefix = "start: ", postfix = " :end"))

    println()

    val numbers = (1..100).toList()
    println(numbers.joinToString(limit = 12, truncated = "<...>"))

    println()

    println(numbers.joinToString(limit = 12, truncated = "<...>", transform = { "($it)" }))
    println(numbers.joinToString(limit = 12, truncated = "<...>", transform = { if (it % 2 == 0) "($it)" else it.toString() }))

    println()

    println(numbersStrings.joinToString { "Element: ${it.uppercase()}" })
}



// Filtering - It is used to filter the elements of the collection

fun main() {
    val numbers = listOf("one", "two", "three", "four")
    val longerThan3 = numbers.filter { it.length > 3 }
    println(longerThan3)
    
    println()

    val numbersMap = mapOf("key 1" to 1, "key 2" to 2, "key 3" to 3, "key 4" to 4, "key 101" to 101)
    val filteredMap = numbersMap.filter { it.key.endsWith("1") && it.value > 100 }
    println(filteredMap)

    println()

    val filterIdx = numbers.filterIndexed { index, value -> (index != 0 && value.length < 5) }
    println(filterIdx)
    val filterNot = numbers.filterNot { it.length <= 3 }
    println(filterNot)

    println()

    val mixedList = listOf("one", "two", 3, 4, "five", 6, "Hello", "Kushagra", false, 'A', 'B', 'C')
    mixedList.filterIsInstance<String>().forEach { print("$it ") }
    println()
    mixedList.filterIsInstance<Char>().forEach { print("$it ") }
    println()
    mixedList.filterIsInstance<Int>().forEach { print("$it ") }
    println()
    mixedList.filterIsInstance<Boolean>().forEach { print("$it ") }
    println()

    println()

    // Partition
    val (match, rest) = numbers.partition { it.length > 3 }
    println(match)
    println(rest)

    println()

    // Testing Predicates - All, Any, Count, and Find - It is used to check the elements of the collection
    println(numbers.any { it.endsWith("e") })
    println(numbers.none { it.endsWith("w") })
    println(numbers.all { it.length > 1 })
}



// Plus and Minus Operators - It is used to add or remove the elements from the collection

fun main() {
    val numbers = mutableListOf("one", "two", "three", "four")
    // numbers.add("five")
    val plusList = numbers + "five"
    val minusList = numbers - mutableListOf("three", "four")

    println(plusList)
    println(minusList)
}



// Grouping - It is used to group the elements of the collection

fun main() {
    val numbers = listOf("one", "two", "three", "four", "five", "six")
    println(numbers.groupBy { it.first().uppercase() })
    println(numbers.groupBy(keySelector = { it.first() }, valueTransform = { it.uppercase() }))
}



// Retrieving Collection Parts - It is used to get the parts of the collection

fun main() {
    val numbersString = listOf("one", "two", "three", "four", "five", "six")
    println(numbersString.slice(1..3))
    println(numbersString.slice(0..4 step 2))
    println(numbersString.slice(setOf(3, 5, 0)))

    println()

    println(numbersString.take(3))
    println(numbersString.takeLast(3))
    println(numbersString.drop(1))
    println(numbersString.dropLast(5))

    println()

    println(numbersString.takeWhile { !it.startsWith('f') })
    println(numbersString.takeLastWhile { it != "three" })
    println(numbersString.dropWhile { it.length == 3 })
    println(numbersString.dropLastWhile { it.contains('i') })
    
    println()


    // Chunked - It is used to divide the collection into chunks
    val numbers = (1..14).toList()
    println(numbers.chunked(3))
    println(numbers.chunked(3) { it.sum() })
    
    println()
    
    // Windowed - It is used to create a sliding window of the collection
    val numbersString2 = numbersString
    println(numbersString2.windowed(3))
}



// Retrieving Single Elements - It is used to get the single elements of the collection

fun main() {
    val numbers = listOf("one", "two", "three", "four", "five", "six")
    println(numbers.elementAt(3))
    println(numbers.first())
    println(numbers.last())

    println()

    println(numbers.first { it.length > 3 })
    println(numbers.last { it.startsWith("f") })
    println(numbers.firstOrNull { it.length > 3 })
    println(numbers.lastOrNull { it.length > 3 })
    println(numbers.random())
    println(numbers.isEmpty())

    println()

    println(numbers.elementAtOrNull(5))
    println(numbers.elementAtOrNull(6))
    println(numbers.elementAtOrElse(5) { index -> "The value for index $index is undefined" })
}



// Aggregate Operations - It is used to perform the operations on the collection

fun main() {
    val numbers = listOf(6, 10, 14, 4, 100)
    println(numbers.sum())
    println(numbers.count())
    println(numbers.average())
    println(numbers.maxOrNull())
    println(numbers.minOrNull())
    println(numbers.sumOf { it * 2 })
    println(numbers.sumBy { it * 2 })

    println()

    // Fold and Reduce - It is used to perform the operations on the collection
    println(numbers.reduce { acc, element -> acc + element })
    println(numbers.reduceIndexed { index, acc, element -> if (index % 2 == 0) acc + element else acc })
    println(numbers.runningReduce { acc, element -> acc + element })
    println(numbers.runningFold(2) { partResult, element -> partResult + element })
    println(numbers.sumBy { it * 2 })
    println(numbers.sumByDouble { it.toDouble() / 2 })
    println(numbers.sumOf { it * 2 })
    println(numbers.reduceRight { acc, element -> acc + element })
    println(numbers.reduceRightIndexed { index, acc, element -> if (index % 2 == 0) acc + element else acc })
    println(numbers.reduceRightIndexedOrNull { index, acc, element -> if (index % 2 == 0) acc + element else acc })
    println(numbers.reduceRightOrNull { acc, element -> acc + element })
    println(numbers.runningReduceRight { acc, element -> acc + element })
    println(numbers.runningReduceRightIndexed { index, acc, element -> if (index % 2 == 0) acc + element else acc })
    println(numbers.runningReduceRightIndexedOrNull { index, acc, element -> if (index % 2 == 0) acc + element else acc })
    println(numbers.runningReduceRightOrNull { acc, element -> acc + element })
    println(numbers.runningFoldRight(2) { partResult, element -> partResult + element })
    println(numbers.runningFoldRightIndexed(2) { index, partResult, element -> partResult + element })
    println(numbers.runningFoldRightIndexedOrNull(2) { index, partResult, element -> partResult + element })
    println(numbers.runningFoldRightOrNull(2) { partResult, element -> partResult + element })
    println(numbers.runningFoldRightTo(2) { partResult, element -> partResult + element })
    println(numbers.runningFoldRightIndexedTo(2) { index, partResult, element -> partResult + element })
    println(numbers.runningFoldRightIndexedOrNullTo(2) { index, partResult, element -> partResult + element })
    println(numbers.runningFoldRightOrNullTo(2) { partResult, element -> partResult + element })   println(numbers.sumOf { it * 2 })
}



// Sorting - It is used to sort the elements of the collection
// Comparable and Comparator - It is used to compare the elements of the collection

fun main() {
    val numbers = mutableListOf(2, 5, 1, 40, 20, 100, 60)
    numbers.sorted().forEach { print("$it ") }

    println()
    println()

    val laptops = mutableListOf(
        Laptop("Dell", 2018, 8, 70000),
        Laptop("Apple", 2019, 16, 120000),
        Laptop("HP", 2017, 4, 50000),
        Laptop("Lenovo", 2016, 4, 30000),
        Laptop("Asus", 2015, 8, 40000)
    )

    println()

    laptops.sortedByDescending { it.year }.forEach { println(it) }

    println()
    
    laptops.sorted().forEach { println(it) }

    println()

    laptops.sortedWith(ComparatorRam()).forEach { println(it) }

    println()

    laptops.sortedWith(ComparatorYear()).forEach { println(it) }

    println()
    println()
    println()

    // Using Lambda Function we do not need any of the above or comparator for sorting
    laptops.sortedWith(compareBy { it.price }).forEach { println(it) }
    println()
    laptops.sortedBy { it.ram }.forEach { println(it) }
    println()
    laptops.sortedWith(compareBy<Laptop> { it.year }.thenBy { it.price }).forEach { println(it) }
    // Implementation in new main class also, after this code
}

data class Laptop(val brand: String, val year: Int, val ram: Int, val price: Int) : Comparable<Laptop> {
    override fun compareTo(other: Laptop): Int {
        return if (this.price > other.price) {
            println("Swapping ${this.brand} with ${other.brand}")
            1
        }
        else if (this.price < other.price) {
            println("Swapping ${this.brand} with ${other.brand}")
            -1
        }
        else {
            0
        }
    }
}

class ComparatorRam : Comparator<Laptop> {
    override fun compare(o1: Laptop, o2: Laptop): Int {
        return if (o1.ram > o2.ram) {
            println("Swapping ${o1.brand} with ${o2.brand}")
            1
        }
        else if (o1.ram < o2.ram) {
            println("Swapping ${o1.brand} with ${o2.brand}")
            -1
        }
        else {
            0
        }
    }
}

class ComparatorYear : Comparator<Laptop> {
    override fun compare(o1: Laptop, o2: Laptop): Int {
        return if (o1.year > o2.year) {
            println("Swapping ${o1.brand} with ${o2.brand}")
            1
        }
        else if (o1.year < o2.year) {
            println("Swapping ${o1.brand} with ${o2.brand}")
            -1
        }
        else {
            0
        }
    }
}



fun main() {
    val laptops = mutableListOf(
        Laptop("Dell", 2018, 8, 70000),
        Laptop("Apple", 2019, 16, 120000),
        Laptop("HP", 2017, 4, 50000),
        Laptop("Lenovo", 2016, 4, 30000),
        Laptop("Asus", 2015, 8, 40000)
    )

    // Using Lambda Function we do not need any of the above or comparator for sorting
    laptops.sortedWith(compareBy { it.price }).forEach { println(it) }
    println()
    laptops.sortedBy { it.ram }.forEach { println(it) }
    println()
    laptops.sortedWith(compareBy<Laptop> { it.year }.thenBy { it.price }).forEach { println(it) }
}

data class Laptop(val brand: String, val year: Int, val ram: Int, val price: Int)



// Binary Search - It is used to search the elements of the collection

fun main() {
    println(searchElement(21, mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25)))
    println(binarySearch(21, mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25)))

    println()

    val numbers = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25)
    // Pre defined binary search function from the Kotlin Standard Library
    println(numbers.binarySearch(21))
}

// Binary Search
private fun binarySearch(searchedElement: Int, numbers: MutableList<Int>) : Int {
    var i = 0
    var low = 0
    var high = numbers.size - 1

    while (low <= high) {
        i++
        println("Iteration $i")

        val mid = (low + high) / 2
        val midElement = numbers[mid]

        if (midElement > searchedElement) {
            high = mid - 1
        }
        else if (midElement < searchedElement) {
            low = mid + 1
        }
        else {
            return midElement
        }
    }
    return -1
}


// Linear Search
private fun searchElement(searchedElement: Int, numbers: MutableList<Int>) : Int {
    var i = 0
    for (number in numbers) {
        i++
        println("Iteration $i")
        if (number == searchedElement) {
            return number
        }
    }
    return -1
}



// // Generic Functions - It is used to create a function with generic type

fun main() {
    val footballPlayer = FootballPlayer("Football Player 1")
    val footballPlayer2 = FootballPlayer("Football Player 2")

    val basketballPlayer = BasketballPlayer("Basketball Player 1")
    val basketballPlayer2 = BasketballPlayer("Basketball Player 2")
    
    val footballTeam = Team<FootballPlayer>("Football Team", mutableListOf(footballPlayer))
    footballTeam.addPayers(footballPlayer2)

    val basketballTeam = Team<BasketballPlayer>("Basketball Team", mutableListOf(basketballPlayer))
    basketballTeam.addPayers(basketballPlayer2)
    // basketballTeam.addPayers(footballPlayer2)  // It will give an error because the player is not of the same type as the team | This is the advantage of using generic functions

    // val gamesTeam = Team<GamesPlayer>("Games Team", mutableListOf())  // This will give error because it is not inheriting the Player class
}

class Team<T>(val name: String, val players: MutableList<T> = mutableListOf()) {
    fun addPayers(player: T) {
        if (players.contains(player)) {
            println("Player: ${(player as Player).name} is already in the team ${this.name}")
        }
        else {
            players.add(player)
            println("Player: ${(player as Player).name} is added to the team ${this.name}")
        
        }
    }
}

// // Can also be done using the following code where Team<T: Player> is used and player.name is used instead of (player as Player).name
// class Team<T: Player>(val name: String, val players: MutableList<T> = mutableListOf()) {
//     fun addPayers(player: T) {
//         if (players.contains(player)) {
//             println("Player: ${player.name} is already in the team ${this.name}")
//         }
//         else {
//             players.add(player)
//             println("Player: ${player.name} is added to the team ${this.name}")
        
//         }
//     }
// }

open class Player(val name: String)

class FootballPlayer(name: String) : Player(name)
class BasketballPlayer(name: String) : Player(name)
class GamesPlayer(name: String)