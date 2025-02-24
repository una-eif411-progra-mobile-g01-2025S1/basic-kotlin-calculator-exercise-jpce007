package org.example

fun main() {
    val name = "Juan Pablo Cartin Esquivel-JP"
    println("Hello I'm, " + name + "!")

    val scanner = java.util.Scanner(System.`in`)

    var firNum: Double
    var secNum: Double
    var operation: String

    println("Your personal calculator")

    while (true) {
        print("Enter the first number: ")
        if (scanner.hasNextDouble()) {
            firNum = scanner.nextDouble()
            break
        } else {
            println("Not valid")
            scanner.next() // Esto limpia
        }
    }

    while (true) {
        print("Enter the operation (+, -, *, /): ")
        operation = scanner.next()

        if (operation == "+" || operation == "-" || operation == "*" || operation == "/") {
            break
        } else {
            println("ERROR- valid operation: (+, -, *, /).")
        }
    }

    while (true) {
        print("Enter the second number: ")
        if (scanner.hasNextDouble()) {
            secNum = scanner.nextDouble()
            break
        } else {
            println("Not valid")
            scanner.next()
        }
    }

    val result = when (operation) {
        "+" -> firNum + secNum
        "-" -> firNum - secNum
        "*" -> firNum * secNum
        "/" -> if (secNum != 0.0) firNum / secNum else {
            println("ERROR- divide by zero")
            return
        }
        else -> {
            println("Invalid operation")
            return
        }
    }

    println(" $firNum $operation $secNum = $result")
    //Todo esto fue porque no lei el README antes de empezar
}