package com.example.kotlin_1.android_basics

fun main() {
//    // 1. println function
//    println("Welcome to Kotlin!")  // Prints a message to the console
//
//    // 2. Variables
//    var mutableVariable: String = "I am mutable"
//    val immutableVariable: String = "I am immutable"
//
//    println(mutableVariable)  // Prints: I am mutable
//    println(immutableVariable)  // Prints: I am immutable
//
//    // 3. Integer and String examples
//    var myInteger: Int = 42  // Integer type
//    var myString: String = "This is a string."
//
//    println("Integer: $myInteger")  // Prints: Integer: 42
//    println("String: $myString")    // Prints: String: This is a string.
//
//    // 4. Mutable and Immutable variables (using var and val)
//    mutableVariable = "Changed my value"
//    // immutableVariable = "Trying to change" // This will cause an error because 'val' cannot be reassigned
//
//    println(mutableVariable)  // Prints: Changed my value
//
//    // 5. Arrays (Immutable)
//    val myArray: Array<Int> = arrayOf(1, 2, 3, 4, 5)  // Immutable array
//
//    // Iterating over the array
//    for (element in myArray) {
//        println("Array element: $element")  // Prints each element in the array
//    }
//
//    // 6. ArrayList (Mutable)
//    val myArrayList: ArrayList<String> = ArrayList()  // Mutable ArrayList
//    myArrayList.add("First item")
//    myArrayList.add("Second item")
//    myArrayList.add("Third item")
//
//    // Iterating over the ArrayList
//    for (item in myArrayList) {
//        println("ArrayList item: $item")  // Prints each item in the ArrayList
//    }
//
//    // 7. Using arrayListOf() function to initialize an ArrayList
//    val anotherList = arrayListOf("Apple", "Banana", "Cherry")  // Using arrayListOf to create an ArrayList
//    for (fruit in anotherList) {
//        println("Fruit: $fruit")  // Prints each fruit in the list
//    }
//
//    // Any data type
//    var anyArray=arrayListOf<Any>("Nischay",4,true)
//    print(anyArray)
//
//    //8. List
//    //By default Immutable
//    var data1= listOf("ram","sita")
//    var data2= mutableListOf("hari","shyam")
//
//    //9. Map
//    // By default immutable
//    var data3= mapOf<String,String>(
//        "animal" to "living organism",
//        "shyam" to "15"
//    )
//
//    //10. Switch case(when) , default-else
//
//    println("Enter the day of week")
//    var dayOfWeek : Int = readln().toInt()
//    val day : String = when(dayOfWeek){
//        1 -> "Sunday"
//        2 -> "Monday"
//        3 -> "Tuesday"
//        4 -> "Wednesday"
//        5 -> "Thursday"
//        6 -> "Friday"
//        7 -> "Saturday"
//        else -> "Invalid input!!"
//
//    }
//    print("The day is $day")

//    // 11. Loop
//    //For loop
//    for (i in 0 until 5){
//        println(i)
//    }
//
//    for (i in 0 .. 5){
//        println(i)
//    }


//    var data= listOf("ram","shyam")
//
//    //foreach loop
//    data.forEach{
//        println(it)
//    }
//    //rename it
//    data.forEach { element ->
//        println(element)
//
//    }

    //while and do while are same

    //12. Function
    //user-defined function

    //return type
    fun calculate(a:Int, b: Int) : Int{
        return a+b
    }
    println("The sum of two number is ${calculate(2,2)}")

    //no return type
    //Void -> Unit
    fun greet():Unit{
        print("Namaste")
    }
    greet()













}
